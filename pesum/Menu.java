package pesum;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu {
    protected String title;
    protected ArrayList<String> listMenu = new ArrayList<>();

    public Menu() {
    }
    public Menu(String title, String[] listMenu) {
        this.title = title;
       for(String item : listMenu){
        this.listMenu.add(item);
       }
    }

    public void displayMenu(){
        System.out.println(this.title);
        int i =0;
        for(String itemMenu : listMenu){
            System.out.println((i+1)+ ". " + itemMenu);
        }

    }

    public int choice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your chooice: ");
        int choice = sc.nextInt();
        return choice;
    }

    public abstract void execution(int choice);

    public void run(){
        int choice;
        do{
            displayMenu();
            choice = choice();
            execution(choice);
        }while(choice > 0 && choice < listMenu.size());
    }
}
