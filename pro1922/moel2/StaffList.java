/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moel2;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.Menu;

/**
 *
 * @author ADMIN
 */
public class StaffList extends Menu{
    public List<Staff> staffList = new ArrayList<>();
    
    public static boolean checkNV123(String input){
        String regex = "^NV[0-9]{4}$";
        return input.matches(regex);
    }

    public StaffList() {
        super("Staff Management system", new String[]{
            
            "Display all staff",
            "Search staff",
            "login",
            "Change password"
            
        });
    }
    
    
    
     @Override
    public void execute(int choice) {
         switch (choice) {
             case 1:
                 loadStaffFromFile("staff.txt");
                 break;
             case 2:
                 searchStaffByID();
                 break;
             case 3:
                 login();
                 break;
             case 4:
                 changePassWord();
                 break;
             default:
                 System.out.println("Choice wrong");
         }
    }
    
    
    public void changePassWord(){
        Staff staff = new Staff();
        if(staff.checkChangePassWord(staffList)){
            System.out.println("Change success");
        }else{
            System.out.println("Fail!!!!!!!!!!!!!!");
        }
    }
            
    
    public void displayStaff(){
        if(!staffList.isEmpty()){
            System.out.println("\nAll staff");
            for(Staff staff : staffList){
                System.out.println(staff);
            }
        }else{
            System.out.println("No staffs found!");
        }
    }
    
    public void addStaff(){
        System.out.println("\nAdd a staff");
        String staffID = Validate.getStringFromInput("staffID");
        
        Staff isExist = new Staff(staffID);
        
        if(!staffList.contains(isExist)){
           try { 
            String fullName = Validate.getStringFromInput("full name");
            
            String department = Validate.getStringFromInput("department");
            
            String passWord = Validate.getStringFromInput("passWord");
            
            System.out.print("Enter dob date (dd/MM/yyyy): ");
            Date dob = Validate.getDateFromInput();
            
            Staff staff = new Staff(staffID, fullName, department, passWord, dob);
            staffList.add(staff);
            System.err.println("Staff added successfully.");
            } catch (ParseException ex) {
                Logger.getLogger(StaffList.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            System.out.println("Staff is exist in the list!!");
        }
    }
    
    public void searchStaffByID(){
        int count = 0;
        System.out.println("The staff ID");
        String staffID = Validate.getStringFromInput("StaffID");
        Staff staff = new Staff(staffID);
        for(Staff id : staffList){
            if(id.getStaffID().equals(staff.getStaffID())){
                System.out.println(id);
                count = 1;
            } else {
            }
        }
        
        if(count == 1){
            System.out.println("Find successfull");
        }else{
            System.out.println("Not have any Staff");
        }
    }
    
    public void removedStaff(){
        int count = 0;
        System.out.println("The staff ID which you want to remove:");
        String staffID = Validate.getStringFromInput("Staff ID");
        Staff staff = new Staff(staffID);
        
        Iterator<Staff> iterator = staffList.iterator();
        
        while(iterator.hasNext()){
            Staff item = iterator.next();
            if(item.getStaffID().equals(staff.getStaffID())){
                iterator.remove();
                count = 1;
            }
        }
        
         if(count == 1){
            System.out.println("Removed successfull");
        }else{
            System.out.println("Not have any Staff");
        }
    }
    
    public void login(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Staff ID: "); String staffID_Check = sc.nextLine();
        System.out.println("PassWord: "); String password_Check = sc.nextLine();
        
        if(staffList.contains(new Staff(staffID_Check, password_Check))){
            System.out.println("Suscessfull!");
        }else{
            System.out.println("fail!");
        }
    }
            
    
    public void loadStaffFromFile(String fileName){
        try {
            Scanner sc = new Scanner(new File(fileName));
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] data = line.split(",");
                
//                if(data.length == 6){
                    String staffID_String = data[0].split(":")[1];
                    boolean staffID_bool = checkNV123(staffID_String);
                    
                    String fullName_String = data[1].split(":")[1];
                    
                    String department_String = data[2].split(":")[1];
                    
                    String passWord_String = data[3].split(":")[1];
                    
                    String dob_String = data[4].split(":")[1];
                    boolean dob_bool = Validate.isValidDate(dob_String, "dd/MM/yyyy");
                    
                    if(staffID_bool && dob_bool){
                        String staffID = staffID_String;
                        Date dob = Validate.parse(dob_String);
                        
                        Staff staff = new Staff(staffID, fullName_String, department_String, passWord_String, dob);
                        staffList.add(staff);
                    }
//                }
            }
            displayStaff();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StaffList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

   
}
