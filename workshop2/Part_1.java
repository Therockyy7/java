package workshop2;

import java.util.Scanner;

public class Part_1 {
    public static void main(String[] args) throws NumberFormatException {
        Scanner sc = new Scanner(System.in);
        boolean choice = false;
        do{
            try{
                System.out.print("Input a number great than 1: "); int num = sc.nextInt();
                if(num < 1){
                    System.out.println("The number is "+ num);
                    choice = false;
                    throw new Exception();
                }else{
                    System.out.println("The number is "+ num);
                    choice = true;
                }
            }catch (NumberFormatException e) {
                System.out.println("not an Integer!");
            } catch (Exception e) {
                System.out.println("Error!");
            }
        }while(!choice);

    }
}
