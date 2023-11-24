package lqamd.view;

import java.util.Scanner;

import lqamd.Controller.Usercontrol;

public class UserView {
    static String[] menu= {"Create new accout", "Login", "Save data", "Exit"};
    static Usercontrol uc = new Usercontrol();
    public static void menu(){
        System.out.println("User maneger: ");
        for(int i = 0; i < menu.length; i++){
            System.out.print((i+1)+"."+ menu[i]+"\n");

        }
        int choice;
        uc.loadData();
        do{
            System.out.println("Your choice: ");
            choice = new Scanner(System.in).nextInt();
            switch(choice){
                case 1:
                    uc.CreateFile();
                    break;
                case 2:
                    uc.login();
                    break;
                case 3:
                    uc.saveData();
                    break;
                case 4:
                    uc.saveData();
                    return;
            }
        }while(choice != 4);
    }
    public static void main(String[] args) {
        Usercontrol uc = new Usercontrol();
        uc.loadData();
        // uc.login();
        menu();
    }
}
