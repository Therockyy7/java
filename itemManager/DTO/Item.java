package itemManager.DTO;

import java.util.Scanner;

public abstract class Item {
    int value;
    String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("The value: "); value = sc.nextInt();
        sc.nextLine();
        System.out.print("The creator: "); creator = sc.nextLine();

        if(value < 0 || creator.isEmpty()){
            System.out.println("Something is wrong, please check value/creator");
            return;
        }
    }

    public void output(){
        
        System.out.println("The value of item: " + value);
        System.out.println("The creator: "+ creator);

    }
}
