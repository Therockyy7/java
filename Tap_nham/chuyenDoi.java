import java.util.Scanner;

public class chuyenDoi {
    public void menu(){
        System.out.println("Choose: ");
        System.out.println("1: Kg to Pounds");
        System.out.println("2: C to F");
        System.out.println("3: Cm to index");
    }
    public static void main(String[] args) {
        int a;
        double A;  
        Scanner sc = new Scanner(System.in);
        chuyenDoi sitch = new chuyenDoi();
        sitch.menu();
        System.out.print("Choose: ");
        int ans = sc.nextInt();
        do{

            switch  (ans){
                case 1: 
            System.out.print("Your weight: ");
            a = sc.nextInt();
            A = a * 2.2;
            System.out.println("KG: "+ a +" to "+ " IBS = "+ A);
            System.out.println("Chon lai ko? [1/0]");
            ans = sc.nextInt();
            break;
            case 2:
            System.out.print("Your tempeture: ");
            a = sc.nextInt();
            A = a * 33.8;
            System.out.println("C: "+ a +" To F: "+ A);
            System.out.println("Chon lai ko? [1/0]");
            ans = sc.nextInt();

            break;
            case 3:
            System.out.print("Your cm: ");
            a = sc.nextInt();
            A = a * 0.3937; 
            System.out.println("Cm: "+ a + " To in: " + A );
            System.out.println("Chon lai ko? [1/0]");
            ans = sc.nextInt();
            break;
        }
    }while(ans == 1);
    }
}