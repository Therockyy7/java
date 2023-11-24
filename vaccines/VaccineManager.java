// package pro192_vaccine;

import java.util.*;
import java.io.*;
import java.text.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import match.Validate;

public class VaccineManager extends Menu {

    private List<Vaccine> vaccines;

    public VaccineManager() {
        super("\nVaccin Managerment System",
                new String[]{"Display All Vaccines From File",
                    "Add a Vaccine",
                    "Delete a Vaccine by code",
                    "Sort Vaccines by Name",
                    "Save to File",
                    "Exit"});
        vaccines = new ArrayList<>();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                loadVaccinesFromFile("D:\\java_tu_hoc\\pesum\\vaccines_input.txt");
                break;
            case 2:
                addVaccine();
                displayAllVaccines();
                break;
            case 3:
                deleteVaccine();
                break;
            case 4:
                sortVaccines();
                displayAllVaccines();
                break;
            case 5:
                saveVaccinesToFile("vaccines_output.txt");
                break;
            case 6:
                System.err.println("Exited. Bye bye");
                break;
            default:
                System.err.println("Invalid choice. Please try again.");
        }
    }

    private void saveVaccinesToFile(String filename) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(filename));
            for (Vaccine vaccine : vaccines) {
                writer.println(vaccine.toString());
            }
            System.err.println("Vaccines saved to file.");
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(VaccineManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addVaccine() {
        System.err.println("\nAdd a Vaccine");
        String code = Validate.getStringFromInput("code");

        Vaccine isExist = new Vaccine(code);

        //đã tồn tại vaccine
        if (!vaccines.contains(isExist)) {
            try {
                String name = Validate.getStringFromInput("name");

                int quantity = Validate.getIntFromInput("quantity");

                System.out.print("Enter expiration date (dd/MM/yyyy): ");
                Date expirationDate = Validate.getDateFromInput();

                double price = Validate.getDoubleFromInput("price");

                System.out.print("Enter last injected date (dd/MM/yyyy): ");
                Date lastInjectedDate = Validate.getDateFromInput();

                Vaccine vaccine = new Vaccine(name, code, quantity, expirationDate, price,
                        lastInjectedDate);
                vaccines.add(vaccine);
                System.err.println("Vaccine added successfully.");
            } catch (ParseException e) {
                Logger.getLogger(VaccineManager.class
                        .getName()).log(Level.SEVERE, null, e);
            }
        } else {
            System.err.println("Vaccine is exist in the list");
        }
    }

    //using Predicate and lamda for searching inside method removeif
    private void deleteVaccine() {
        Scanner scanner = new Scanner(System.in);
        System.err.println("\nDelete a Vaccine by code");
        System.out.print("Enter the code of the vaccine to delete: ");
        String code = scanner.nextLine();

        boolean removed = vaccines.removeIf(v -> v.getCode().equals(code));
        if (removed) {
            System.err.println("Vaccine deleted successfully.");
            displayAllVaccines();
        } else {
            System.err.println("Vaccine not found.");
        }
    }

    //Sort vaccines by name
    private void sortVaccines() {
        System.err.println("Sort vaccines by name");
        Collections.sort(vaccines, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.err.println("Vaccines sorted successfully!");
    }

    private void displayAllVaccines() {
        if (vaccines.isEmpty()) {
            System.err.println("No vaccines found.");
        } else {
            System.err.println("\nAll Vaccines:");
            for (Vaccine vaccine : vaccines) {
                System.out.println(vaccine);
            }
        }
    }

    //load file and check error for quantity, price, expirationDate,lastInjectedDate if incorrect format
    private void loadVaccinesFromFile(String filename) {
        try {
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] data = line.split(",");
                if (data.length == 6) {
                    String code = data[0].split("=")[1];
                    String name = data[1].split("=")[1];

                    //kiểm tra định dạng quantity 
                    String quantity_string = data[2].split("=")[1];
                    boolean quantity_bool = Validate.isNumericInt(quantity_string);

                    //kiểm tra định dạng expirationDate
                    String expirationDate_string = data[3].split("=")[1];
                    boolean expirationDate_bool = Validate.isValidDate(expirationDate_string, "dd/MM/yyyy");

                    //kiểm tra định dạng price
                    String price_string = data[4].split("=")[1];
                    boolean price_bool = Validate.isNumericDouble(price_string);

                    //kiểm tra định dạng lastInjectedDate
                    String lastInjectedDate_string = data[5].split("=")[1];
                    boolean lastInjectedDate_bool = Validate.isValidDate(lastInjectedDate_string, "dd/MM/yyyy");

                    if (quantity_bool && price_bool && expirationDate_bool && lastInjectedDate_bool) {
                        int quantity = Integer.parseInt(quantity_string);
                        double price = Double.parseDouble(price_string);
                        Date expirationDate = Validate.parse(expirationDate_string);
                        Date lastInjectedDate = Validate.parse(lastInjectedDate_string);

                        Vaccine vaccine = new Vaccine(code, name, quantity,
                                expirationDate, price, lastInjectedDate);
                        vaccines.add(vaccine);
                    }
                }
            }
            displayAllVaccines();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public static void main(String[] args) throws ParseException, IOException {
        VaccineManager manager = new VaccineManager();
        manager.run();
    }
}
