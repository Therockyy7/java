package billManeger;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayBill extends Bill{
    Scanner sc = new Scanner(System.in);
    ArrayList<Bill>  arr = new ArrayList<>();
    ArrayList<Bill> listBillLargest = new ArrayList<>();
    Bill billMax = null;
    int size;

    public void addBill(Bill bill){
        this.arr.add(bill);
    }

    public Bill findBillByCode(Bill billCode){
        for(Bill out : arr){
            if(billCode.customerCode.equals(out.customerCode)){
                return out;
            }
        }
        return null;
        
    }
    

    



    public int calculateTotalPaymentForCustomerType(String choice) {
        // if (!choice.equals("NN") && !choice.equals("SX") && !choice.equals("KD")) {
        //     System.out.println("Invalid customer type!");
        //     return -1;
        // }

        // for(int i = 0; i < arr.size(); i++){
            //     if(arr.get(i).getCustomerType().equals(choice)){
                //         sum += arr.get(i).getPayment();
                //     }
                // }
        int sum = 0;
        for (Bill out : arr) {
            if (out.getCustomerType().equals(choice)) {
                sum += out.getPayment();
            }
        }
        return sum;
    }
    public boolean checkCodeExist(String billCode){
        for(Bill out : arr){
            if(out.getCustomerCode().equals(billCode)){
                return true;
            }
        }
        return false;
    }

    public void deleteBillByCode(String billCode){
        

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).getCustomerCode().equals(billCode) && checkCodeExist(billCode)){
                arr.remove(i);
            }
        }
    } 

    public Bill findBillWithLargestPayment(){
        int max = 0;
        for(Bill bill : arr){
            if(bill.getPayment() > max){
               max = bill.getPayment();
               billMax = bill;
            }
        }

       
        return billMax;
        
    }

    public void showLargestPayment(Bill out){
        
        //check same the largest bill
        for(Bill bill : arr){
            if(billMax.getPayment() == bill.getPayment() && !billMax.getCustomerCode().equals(bill.getCustomerCode())){
                listBillLargest.add(bill);

            }
        }
        if(!listBillLargest.isEmpty()){
                System.out.println(billMax);
            for(Bill sameLargestBill : listBillLargest){
                System.out.println(sameLargestBill);
            }
        }else{
            System.out.println(out);
        }
        listBillLargest.clear();

    }

    public void showFindBillDialog(Bill out){
        System.out.println(out);
    }

    public void view(){
            for(Bill bl : arr){
                    System.out.println(bl);
                }
            }
            
                
        }
        