package itemManager.GUI;

import java.util.Scanner;

public class Menu {
    public static int getChoice(String[] op){
        for(int i = 0; i < op.length; i++){
            if(i == op.length - 1){
                System.out.print(op[i]+ ": ");
                break;
            }
            System.out.println((i + 1) +" - "+ op[i]);
        }
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }
}
