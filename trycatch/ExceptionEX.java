package trycatch;

import java.util.Scanner;

public class ExceptionEX {
    static Scanner sc = new Scanner(System.in);
    public static void inputInt(){
        boolean check = true;
        do{
            try {
                System.out.println("Input number i: ");
                int i = Integer.parseInt(sc.next());
                System.out.println("i = "+ i);
                check = false;
            } catch (NumberFormatException e) {
                System.out.println("not an Integer!");
            }
        }while(check);

    }
    public static void  coutline() {
        String s = null;
        Scanner sline = new Scanner(System.in);
        int sum = 0;
        int value = 0;
        while (sline.hasNext()){
            value = Integer.parseInt(sline.next());
            sum += value;
        
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        // System.out.print("A "); int a = sc.nextInt();
        // System.out.print("B: ");
        coutline();
    }
}
