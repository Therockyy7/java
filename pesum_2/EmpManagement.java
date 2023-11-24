package pesum_2;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;

import match.Validate;

public class EmpManagement extends Menu {
    public List<Employee> employees;
    
    public static boolean checkABC123(String input){
        String regex = "^MNV[0-9]{3}$";
        return input.matches(regex);
    }


    public EmpManagement() {
        super("\nEmployee Management system", new String[] {
            
            "List all employee",
            "Calculate money",
            "Sorting Employee",
            "Exit"
            
        });
        employees = new ArrayList<>();
    }



    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                loadEmployeeFromFile("D:\\java_tu_hoc\\pesum_2\\employee.txt", 1);
                break;
            case 2:
                loadEmployeeFromFile("D:\\java_tu_hoc\\pesum_2\\employee.txt", 2);
                break;
            case 3:
                sortEmployees();
                break;
            case 4:
                System.out.println("Exit!");
                break;
            default:
                System.err.println("Invalid choice. Please try again.");
                break;
        }

    }
    // "D:\netbeenJava\peSum3\MVC.txt"
    public void displayAllEmployee(){
        if(employees.isEmpty()){
            System.out.println("No employees found!");
            
        }else{
            System.out.println("\nAll employees");
            for(Employee employee : employees){
                System.out.println(employee);
            }

        }
    }

    public void sortEmployees(){
        System.out.println("Sort employees by MonthlyIncome!");
        Collections.sort(employees, (a, b) -> (int) (a.getMonthlyIncome() - b.getMonthlyIncome()));
        System.out.println("Employees sorted successfully!");
        displayAllEmployee();
    }
    
    public void searchEmployee(){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        try {
            System.out.println("----------------------------------------------");
            System.out.print("1. Search by name Account\n"+"2. WorkStartingDate\n"+"Your choice: ");
            System.out.println("----------------------------------------------");
            int chooice  = sc.nextInt();

            switch (chooice) {
                case 1:
                    String account = Validate.getStringFromInput("account");
                        for(Employee employee : employees){
                            if(employee.getAccount().equals(account) ){
                                System.out.println("----------------------------------------------");
                                System.out.println(employee);
                                System.out.println("----------------------------------------------");
                                count = 1;
                            }
                        }

                        if(count == 0){
                            System.out.println("Does not have this account!");
                        }else{
                            System.out.println("Find successfull!");
                        }
                    break;
                case 2:
                        System.out.println("Enter WorkStartingDate (dd/MM/yyyy):");
                        Date workStartingDate = Validate.getDateFromInput();
                        for(Employee employee : employees){
                            if(employee.getWorkStartingDate().equals(workStartingDate)){
                                System.out.println("----------------------------------------------");
                                System.out.println(employee);
                                System.out.println("----------------------------------------------");
                                count = 1;
                            }
                        }

                         if(count == 0){
                            System.out.println("Does not have this account!");
                        }else{
                            System.out.println("Find successfull!");
                        }
                    break;
                default:
                        System.out.println("Choice Wrong!");
                    break;
            }
          

            
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public void loadEmployeeFromFile(String fileName, int choice){
        try {
            Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                String[] data = line.split(",");

                // if(data.length == 6){

                    String empld_String = data[0]; 
                    boolean empld_Tool = checkABC123(empld_String);
                    
                    String account = data[1];
                    
                    String workStartingDate_String = data[2];
                    boolean workStartingDate_Tool = Validate.isValidDate(workStartingDate_String, "dd/MM/yyyy");
                    
                    String productScore_String = data[3].split("f")[0];
                    boolean productivityScore_Tool = Validate.isNumericDouble(productScore_String);
                    
                    String allwance_String = data[4];
                    boolean allowance_Tool = Validate.isNumericInt(allwance_String);
                    
                    if(empld_Tool && workStartingDate_Tool && productivityScore_Tool && allowance_Tool){
                        String empld = empld_String;
                        Date workStartingDate = Validate.parse(workStartingDate_String);
                        Float productivityScore = Float.parseFloat(productScore_String);
                        int  allowance = Integer.parseInt(allwance_String);
                        
                        Employee employee = new Employee(empld, account, workStartingDate, productivityScore, allowance);
                        if(choice == 1){
                            employees.add(employee);
                            System.out.println(employee.toString2());
                        }
                        if(choice == 2){
                            double  monthlyIncome = employee.CalMonthlyIncome();
                            double  rewardSalary = employee.CalReward();
                            employee = new Employee(empld, account, workStartingDate, productivityScore, monthlyIncome, rewardSalary, allowance);
                            employees.add(employee);
                            System.out.println(employee.toString());
                        }
                        
                    // }
                }
            }
           
        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        }
    }

}
