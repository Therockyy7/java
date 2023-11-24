package workshop2;

import java.util.Scanner;

public class Part_2 {

    public static boolean checkABC123(String input){
        String regex = "^SE[0-9]{3}$";
        return input.matches(regex);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean choice = false;
        do{
            try {
                System.out.println("----------------------------------");
                System.out.print("Input follow [SExxx] {x is number}: "); String line = sc.nextLine();
                if(checkABC123(line)){
                    System.out.println("Your input: "+ line);
                    choice = true;
                }else{
                    System.out.println("Your input: "+ line);
                    choice = false;
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("The String is invalid!");
            }
        }while(!choice);
    }
}
