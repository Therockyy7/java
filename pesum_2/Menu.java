package pesum_2;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu {
    protected String title;
    protected ArrayList<String> list = new ArrayList<>();

    public Menu(){};

    public Menu(String title, String[] s){
        this.title = title;
        for(String item : s){
            this.list.add(item);
        }
    }

    public void displayMenu(){
        System.out.println(this.title);
        System.out.println("-----------------------------------");
        for(int i = 0; i < list.size(); i++){
            System.out.println((i + 1)+". " + this.list.get(i));
        }
        System.out.println("-----------------------------------");

    }

    public int choice(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Your chooice: ");
        int choice = sc.nextInt();
        return choice;
    }

    public abstract void execute(int choice);

    public void run(){
        int chooice;
        do{
            displayMenu();
            chooice = choice();
            execute(chooice);
        }while(chooice > 0 && chooice < list.size());
    }
}
