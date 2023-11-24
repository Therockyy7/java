package itemManager.DTO;

import java.util.Scanner;

public class Vase extends Item{
    int height;
    String material;

    public Vase() {
        
    }
    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public void inputVase(){
        Scanner sc = new Scanner(System.in);
        input();
        try {
            System.out.print("The height: "); this.height = sc.nextInt();
            sc.nextLine();
            System.out.print("The material: "); this.material = sc.nextLine();  
        } catch (Exception e) {
            System.out.println("Something is wrong!.");
        }
        

    }
    
    public void outputVase(){
        System.out.println("--------------------------------------");
        output();
        System.out.println("The height of vase: "+ this.height);
        System.out.println("The material of vase: "+ this.material);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}
