package itemManager.DTO;

import java.util.Scanner;

public class Painting extends Item{
    int height;
    int width;
    boolean isWaterColor;
    boolean isFramed;
    public Painting() {
        
    }
   
    public Painting(int height, int width, boolean isWaterColor, boolean isFramed) {
        this.height = height;
        this.width = width;
        this.isWaterColor = isWaterColor;
        this.isFramed = isFramed;
    }


    public Painting(int value, String creator, int height, int width, boolean isWaterColor, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWaterColor = isWaterColor;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    
    
    public void inputPainting(){
        Scanner sc = new Scanner(System.in);
        input();
        System.out.print("The height: "); this.height = sc.nextInt();sc.nextLine();
        System.out.print("The width: "); this.width = sc.nextInt();sc.nextLine();
        System.out.print("The watercolor: "); this.isWaterColor = sc.nextBoolean();
        System.out.print("The paint is framed: "); this.isFramed = sc.nextBoolean();

    }

    public void outputPainting(){
        System.out.println("--------------------------------------");
        output();
        System.out.println("The height of item: "+ this.height);
        System.out.println("The width of item: "+ this.width);
        if(this.isWaterColor){
            System.out.println("The paint is watercolor: "+ this.isWaterColor);

        }
        if(this.isFramed){
            System.out.println("The paint is framed: "+ this.isFramed);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
