package billManeger;

import java.util.InputMismatchException;
import java.util.Scanner;

import match.Validation;

public class GUI {
    public static void main(String[] args) {
        Validation vaidat = new Validation();
        String[] cusType = {"NN", "SX", "KD"};
        Scanner sc = new Scanner(System.in);
        ArrayBill magerBill = new ArrayBill();
        int choice = 0;
        do{
                System.out.println("--------------------------------------------------");
                System.out.print(
                "1: Add a new bill\n"
                +"2: Find the bill.\n"
                +"3: The payment of a private customer.\n"
                +"4: Delete the bill.\n"
                +"5: Find a bill that have the largest bill.\n"
                +"6: View all.\n"
                +"0: Exit!.\n"
                +"Your choice: ");
                choice = sc.nextInt();
                sc.nextLine();
                try {
                    if(choice != 0 && choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6 ){
                        
                        throw new MyException("*******Wrong choice, please try again!*******");
                    } 
                }catch (MyException e) {
                        System.out.println(e.getMessage());
                    }
                  
            
            if(choice == 1){
                
                sc.nextLine();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"+"Your Information");
                try {
                    
                    System.out.print("1: Code bill: ");
                    String code = sc.nextLine();
                    System.out.print("2: Type of customer: ");
                    String type = sc.nextLine();
                    System.out.print("3: OldIndex: ");
                    int oldIndex = sc.nextInt();
                    System.out.print("4: NewIndex: ");
                    int newIndex = sc.nextInt();
                    Bill bill = new Bill();
                    int usedEnergy = bill.calculateUsedEnergy(newIndex, oldIndex);
                    int norm = bill.calculateNorm(type);
                    int payment = bill.calculatePayment(newIndex, oldIndex, type);
            
                    bill = new Bill(code, type, oldIndex, newIndex, usedEnergy, norm, payment);

                    magerBill.addBill(bill);

                } catch (NumberFormatException | InputMismatchException a) {
                    System.out.print("****************~Wrong Input!~****************");
                    choice = 0;
                } 
                
            }else if(choice == 2){

                System.out.print("***Code of customer: ");
                String code = sc.nextLine();
                Bill billCode = new Bill(code);
                if(magerBill.findBillByCode(billCode) != null){
                    magerBill.showFindBillDialog(magerBill.findBillByCode(billCode));
                }else{
                    System.out.print("!!!Check code or wrong customer!!!");
                }
                
            }else if(choice == 3){
                try {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("***What the customer type is?");
                    for(int i = 0; i < cusType.length; i++){
                        System.out.println((i + 1)+ "." + cusType[i]);
                    }
                    System.out.print("Your choice: ");
                    String ch = sc.nextLine();
                    if(Validation.checkStringLecter(ch)){
                        int sumCusType = magerBill.calculateTotalPaymentForCustomerType(ch);
                        System.out.println("The total bill payment of customers belonging among specified customer type: "+ sumCusType);

                    }else {
                        throw new MyException("****************~Wrong Input!~****************");
                    }
                    
                } catch (MyException b) {
                    System.out.println(b.getMessage());
                }
            }else if(choice == 4){

                System.out.print("***Code of customer: ");
                String code = sc.nextLine(); 
                if(magerBill.checkCodeExist(code)){
                    magerBill.deleteBillByCode(code);
                    System.out.println("***Removed success!");
                }else{
                    System.out.printf("***Not have any code like %s in Bill!\n",code);

                }

            }else if(choice == 5){
                if(magerBill.findBillWithLargestPayment() != null){
                    System.out.println("***The largest payment is: ");
                    magerBill.showLargestPayment(magerBill.findBillWithLargestPayment());
                }else{
                    System.out.println("***The Bill is Empty***");
                    choice = 0;
                }
            }else if(choice == 6){
                magerBill.view();
            }else if(choice == 0){
                System.out.print("Exit!");
            }
            }while(choice != 0);

    }
}
