

public class menu_cafe {
    int money;
    int sum;
    // menu_cafe(int money, int sum){
    //     this.money = money;
    //     this.sum

    // }
        //String bill;
    public void menu(){
        System.out.println("------------MENU------------");
        System.out.println("1) Hat ROBUSTA - 95,000k/kg");
        System.out.println("2) Hat CULI ROBUSTA - 100,000k/kg");
        System.out.println("3) Hat ARABICA - 120,000k/kg");
        System.out.println("4) Hat MOKA  - 130,000k/kg");
        System.out.println("5) Hat CULI ARABICA - 150,000k/kg\n");

    }
    public int bill(int ans){
        switch (ans) {
            case 1:
                sum = sum + 95;
                break;
        
            case 2:
                sum = sum + 100;
                break;
            case 3:
                sum = sum + 120;
                break;
            case 4:
                sum = sum + 130;
                break;
            case 5:
                sum = sum + 150;    
                break;
        }
         
        return sum;
    }
}
