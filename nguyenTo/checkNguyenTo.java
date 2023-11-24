package nguyenTo;
import java.util.Scanner;

public class checkNguyenTo {
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Bien: ");
            int x = sc.nextInt();
            a[i] = x;
        }
        System.out.println();
        System.out.print("Mang: ");
        for(int out : a){
            System.out.print(out+ " ");
        }
        System.out.println();
        System.out.println("Check so nguyen to");
        for(int out : a){
            if(CheckPrime(out)){
                System.out.print(out + " ");
            }
        }
        System.out.println();       
        SumPrime(a);
        
    }
}
