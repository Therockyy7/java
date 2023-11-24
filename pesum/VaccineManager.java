package pesum;

import java.util.*;
import java.io.*;
import java.text.*;
import java.util.logging.Level;
import java.util.logging.Logger;


import match.Validate;

public class VaccineManager extends Menu{
   
    private List<Vaccine> VaccineList = new ArrayList<>();

    // private String[] listMenus = new String[]{
    //     "Display All Vaccines from file",
    //     "Add a vaccine",
    //     "Delete a vaccine by code",
    //     "Sort Vaccines by name",
    //     "Save to file",
    //     "Exit"
    // };
    
    
    public VaccineManager() {
        super("\nVaccin Managerment system", new String[]{
        "Display All Vaccines from file",
        "Add a vaccine",
        "Delete a vaccine by code",
        "Sort Vaccines by name",
        "Save to file",
        "Exit"});

    }

    @Override
        public void execution(int choice) {
            switch (choice) {
                case 1:
                    loadData("D:\\java_tu_hoc\\pesum\\vaccines_input.txt");
                    break;
                case 2:
                    addNewVaccine();
                    break;
                case 3:
                    deleteVaccine();
                    break;
                case 4:
                    sortVaccine();
                    break;
                case 5:
                    saveNewVacine();
                    break;
                case 6:
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                 break;
            }
        }
  
    public void loadData(String dataFile){
            
            // SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            
        try  {
                Scanner sc = new Scanner(new File(dataFile));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] data = line.split(",");
                if(data.length == 6){
                    String code = data[0].split("=")[1];
                    String name = data[1].split("=")[1];

                    String quantity_string = data[2].split("=")[1];
                    boolean quantity_tool = Validate.isNumericInt(quantity_string);

                    String expiration_string = data[3].split("=")[1];
                    boolean expiration_tool = Validate.isValidDate(expiration_string, "dd/MM/yyyy");

                    String price_string = data[4].split("=")[1];
                    boolean price_tool = Validate.isNumericDouble(price_string);

                    String lastInjectedDate_string = data[5].split("=")[1];
                    boolean lastInjectedDate_tool = Validate.isValidDate( lastInjectedDate_string, "dd/MM/yyyy");

                    if(quantity_tool && expiration_tool && lastInjectedDate_tool && price_tool){
                        int quantity = Integer.parseInt(quantity_string);
                        double price = Double.parseDouble(price_string);
                        Date expirationDate = Validate.parse(expiration_string);
                        Date lastInjectedDate = Validate.parse(lastInjectedDate_string);

                        Vaccine vaccine = new Vaccine(code, name, quantity, expirationDate, price, lastInjectedDate);
                        VaccineList.add(vaccine);
                    }
                }
                
            }displayVaccines();
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }

    public void deleteVaccine(){
        System.out.println("Delete a vaccine by code");
        System.out.print("Enter the code of the vaccin: ");
        String code = Validate.getStringFromInput("code");
        
        boolean removed = VaccineList.removeIf(v -> v.getCode().equals(code));
        if(removed){
            System.out.println("Remove success!");
            displayVaccines();
        }else{
            System.err.println("Vaccine not found.");
        }
        
        
        
        // Vaccine vc = new Vaccine(code);
        // if(VaccineList.contains(vc.getCode())){

        //     for(Vaccine vaccine : VaccineList){
        //         if(vaccine.code.equals(code)){
        //             VaccineList.remove(vaccine);
        //         }
        //     }
        //     System.out.println("Remove success!");
        //     displayVaccines();
        // }else{
        //     System.err.println("Vaccine not found.");
        // }
        
    }

    public void sortVaccine(){
        System.out.println("Sorts the list of Vaccines by name.");
        Collections.sort(VaccineList, (a, b) -> a.getName().compareTo(b.getName()));
        System.err.println("Vaccines sorted successfully!");
        displayVaccines();
    }

    public void addNewVaccine(){
        System.out.print("Add a vaccine: ");
        String code = Validate.getStringFromInput("code");

        Vaccine isExist = new Vaccine(code);
        if(!VaccineList.contains(isExist)){
            try {
                 String name = Validate.getStringFromInput("name");

                int quantity = Validate.getIntFromInput("quatity");

                System.out.print("Enter expiration date (dd/MM/yyyy): ");
                Date expirationDate = Validate.getDateFromInput();
           
                double price = Validate.getDoubleFromInput("price");

                System.out.println("Enter last injected date (dd/MM/yyyy): ");
                Date lastInjectedDate = Validate.getDateFromInput();

                Vaccine vaccine = new Vaccine(code, name, quantity, expirationDate, price, lastInjectedDate);
                VaccineList.add(vaccine);
                System.err.println("Vaccine added successfully.");
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("Vaccine is exist in the list!");
        }
    }

    public void saveNewVacine(){
        try {
            PrintWriter pw = new PrintWriter("D:\\java_tu_hoc\\pesum\\vaccines_input.txt");
            for(Vaccine vaccine : VaccineList){
                pw.println(vaccine.toString());
            }
            System.out.println("Saved success!");
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    

    public void displayVaccines() {
        if(VaccineList.isEmpty()){
            System.out.println("No vaccines found.");
        }else{
            System.out.println("\nVaccines:");
            for (Vaccine vaccine : VaccineList) {
                System.out.println(vaccine);
            }
        }
    }

    

}
