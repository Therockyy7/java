import java.util.Scanner;

public class Ucln {

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

    public static int ucln(int a ,int b){
        if(a == 0){
            return b;
        }
        else if(b == 0 ){
            return a;
        }else if(a > b){
            return ucln(b, a % b);
        }else{
            return ucln(a, b % a);
        }


    }//phuc ngu
    

    public static void main(String[] args) {
        int gcd;
        int lcn;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: "); int a = sc.nextInt();
        System.out.println("Nhập b: "); int b = sc.nextInt();

        System.out.println(ucln(a, b));
    }
}
