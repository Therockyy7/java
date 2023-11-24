package itemManager.DTO;

import java.util.Scanner;

public class Statue extends Item{
    int weight;
    String colour;

    public Statue() {
       
    }
    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void inputStatue(){
        Scanner sc = new Scanner(System.in);
        input();
        try {
            System.out.print("The Weight: "); this.weight = sc.nextInt();
            sc.nextLine();
            System.out.print("The colour: "); this.colour = sc.nextLine();
            
        } catch (Exception e) {
            System.out.println("Something is wrong!.");
        }

    }
    
    public void outputStatue(){
        System.out.println("--------------------------------------");

        output();
        System.out.println("The weight of item: "+ this.weight);
        System.out.println("The colour of item: "+ this.colour);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}
