import java.util.Scanner;

public class chuyenDoi {
    public void menu(){
        System.out.println("Choose: ");
        System.out.println("1: Kg to Pounds");
        System.out.println("2: C to F");
        System.out.println("3: Cm to index");
        System.out.println("4: tim tong nguyen to");
    }
    public static boolean CheckPrime(int a){
        if(a < 2){
            return false;
        }
        for(int i = 2; i < a; i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;

    }
    public static void SumPrime(int a[]){
        int sum = 0;
        for(int i =0; i < a.length; i++){
            if(CheckPrime(a[i])){
                sum = sum + a[i];
            }
        }
        System.out.print("Tong cac so nguyen to: "+ sum);
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
            case 4:

            System.out.print("Nhap so luong: ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                System.out.print("Bien: ");
                int x = sc.nextInt();
                arr[i] = x;
            }
            System.out.println();
            System.out.print("Mang: ");
            for(int out : arr){
                System.out.print(out+ " ");
            }
            System.out.println();
            System.out.println("Check so nguyen to");
            for(int out : arr){
                if(CheckPrime(out)){
                    System.out.print(out + " ");
                }
            }
            System.out.println();       
            SumPrime(arr);
        }
    }while(ans == 1);
    }
}