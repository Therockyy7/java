package billMangerElectricity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

import match.Validate;

public class ArrayBill extends Menu{
    
    public List<Bill> billList = new ArrayList<>();
    public List<Bill> typeBIll = new ArrayList<>();


public ArrayBill() {
        super("\nBill management:", new String[]{

            
            "Add Bill",
            "Find Bill by Customer code",
            "PayMent",
            "Delete",
            "Largest Payment",
            "Total among type",
            "Quit!"            
        });
    }

@Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                addBill();
                break;
            case 2:
                searchBillByCode();
                break;
            case 3:
                paymnet();
                break;
            case 4:
                deleteBillByCode();
                break;
            case 5:
                findLargestPayment();
                break;
            case 6:
                System.out.println("Your type");
                String type = Validate.getStringFromInput("Type");
                totalBillAmongType(type);
                break;
            case 7:
                System.out.println("**********Outttttttt**********");
                break;
            default:
                System.out.println("Wrong Chooice!");
                break;
        }
    }

    public void displayAllBill(){
        if(!billList.isEmpty()){
            System.out.println("----------------------------------------------");
            for(Bill b : billList){
                System.out.println(b);
            }
            System.out.println("----------------------------------------------");
        }else{
            System.out.println("No Bill found!~");
        }
    }

    public void paymnet(){
        if(!billList.isEmpty()){
            System.out.println("\nPayment of the Bill");
            for(Bill b : billList){
                System.out.println("\t"+ b.getCustomerCode() +" : "+b.getPayment());
            }
        }else{
            System.out.println("Bill is empty");
        }
    }

    public void searchBillByCode(){
        System.out.println("\nYour code:");
        String code = Validate.getStringFromInput("Code");
        int count = 0;
        for(Bill b : billList){
            if(b.getCustomerCode().equals(code)){
                System.out.println("----------------------------------------");
                System.out.println("\t"+b);
                count = 1;
                System.out.println("----------------------------------------");
            }
        }

        if(count == 1){
            System.out.println("\nFound successfull!!!");
        }else{
            System.out.println("\nCode is not exits!!");
        }
    }


    public boolean searchBillByType(String type){
        // System.out.println("\nWhat Type is ?");
        // String type = Validate.getStringFromInput("Type");

        for(Bill b : billList){
            if(b.getCustomerType().equals(type)){
                typeBIll.add(b);
                
            }
        }
        if(typeBIll.isEmpty()){
            
            return false;
        }else{
            return true;
        }
        
    }
    
    public void deleteBillByCode(){
        System.out.println("\nYour code of the customer that wants to delete");
        String code = Validate.getStringFromInput("Code");
        // int count = 0;

        boolean removed = billList.removeIf(c -> c.getCustomerCode().equals(code));

        if(removed){
            System.out.println("Remove successful!");
            saveBillToFile("D:\\java_tu_hoc\\billMangerElectricity\\BillElectricList.txt");
            displayAllBill();
        }else{
            System.out.println("Not have code!");
        }
        
    }

    public void totalBillAmongType(String type){
        int countType = 0;
        if(searchBillByType(type)){
            System.out.print("\n"+"Total of "+ type+" : ");
            for(Bill tp : typeBIll){
                countType = countType + tp.getPayment();
            }
        }else{
            System.out.println("Wrong type!!!!!!!!!!!");
        }

        System.out.println(countType);
    }

    public void saveBillToFile(String fileName){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for(Bill b : billList){
                String line = "customerCode="+b.getCustomerCode()+","+ "customerType="+b.getCustomerType()+"," +"oldIndex="+b.getOldIndex()+","+ "newIndex="+b.getNewIndex()+"\n";
                // String line = "customerCode="+b.getCustomerCode()+","+ "customerType="+b.getCustomerType()+"," +"oldIndex="+b.getOldIndex()+","+ "newIndex="+b.getNewIndex()+","+ "usedEnergy="+b.getUsedEnergy()+","+"norm="+b.getNorm()+","+"payment="+b.getPayment()+"\n";
                writer.write(line);
            }
            writer.close();

        } catch (IOException e) {
            System.out.println("\nFile not Found!");
        }
    }

    public void addBill(){
        System.out.println("\nPlease enter Code");
        String code = Validate.getStringFromInput("Code");

        Bill isExist = new Bill(code);
        if(!billList.contains(isExist)){
            System.out.println("---Your type--- "); String type = Validate.getStringFromInput("type");
            System.out.println("---Old InDex--- "); int oldIndex = Validate.getIntFromInput("old index");
            System.out.println("---New Index---"); int newIndex = Validate.getIntFromInput("New index");

            Bill bill = new Bill();
            int norm = bill.calculateNorm(type);
            int userenergy = bill.calculateUsedEnergy(newIndex, oldIndex);
            int payment = bill.calculatePayment(newIndex, oldIndex, type);
            billList.add(new Bill(code, type, oldIndex, newIndex, userenergy, norm, payment));
            saveBillToFile("D:\\java_tu_hoc\\billMangerElectricity\\BillElectricList.txt");
        }else{
            System.out.println(" exist code!!!!!!!!!!");
        }

        displayAllBill();
    }

    public void findLargestPayment(){
        System.out.println("-------------------------------------------------------");
        System.out.println("\nThe bill have the largest payment\n");
        int max = 0;
        for(Bill b : billList){
            if(b.getPayment() > max){
                max = b.getPayment();
            }
        }

        for(Bill b : billList){
            if(b.getPayment() == max){
                System.out.println("\t"+ b);
            }
        }
        System.out.println("\nFind successfull!!");
        System.out.println("-------------------------------------------------------");
    }

    public void loadBillFromFile(String fileName){
        try  {
            Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] data = line.split(",");

                if(data.length == 4){
                    String code = data[0].split("=")[1];

                    String type = data[1].split("=")[1];

                    String oldIndex_String = data[2].split("=")[1];
                    boolean oldIndex_Bool = Validate.isNumericInt(oldIndex_String);

                    String newIndex_String = data[3].split("=")[1];
                    boolean newIndex_Bool = Validate.isNumericInt(newIndex_String);

                    if(oldIndex_Bool && newIndex_Bool){
                        int oldIndex = Integer.parseInt(oldIndex_String);
                        int newIndex = Integer.parseInt(newIndex_String);

                        Bill bill = new Bill();
                        int usedEnergy = bill.calculateUsedEnergy(newIndex, oldIndex);
                        int payment = bill.calculatePayment(newIndex, oldIndex, type);
                        int norm = bill.calculateNorm(type);

                        // bill = new Bill(code, type, oldIndex, newIndex, usedEnergy, norm, payment);

                        billList.add(new Bill(code, type, oldIndex, newIndex, usedEnergy, norm, payment));
                    }else{
                        System.out.println("++++++++++");
                    }
                }
            }
            displayAllBill();
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    
}
