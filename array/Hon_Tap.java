package array;

import java.util.Arrays;
import java.util.Scanner;

public class Hon_Tap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        int n = sc.nextInt();
        int realNum[] = new int[n];
        System.out.print("Nhap mang: ");
        for(int i = 0; i < realNum.length - 1; i++){
            int x = sc.nextInt();
            realNum[i] = x;
        }
        System.out.println("1: Tim MAX.");
        
        System.out.print("Chon: ");
        int ans = sc.nextInt();
        
        switch(ans){
            case 1:
                int Max = realNum[0];
                for(int i = 0; i < realNum.length; i++){
                    if(realNum[i] > Max){
                        Max = realNum[i];
                    }
                }
                System.out.print("Max: "+ Max);
                break;
            case 2:
                int Min = 0;
                for(int i = 0; i < realNum.length; i++){
                    if(realNum[i] < Min){
                        realNum[i] = 0;
                    }
                }    
                System.out.print("Result: "+ Arrays.toString(realNum));
                break;
            case 3:
                for(int i = 0; i < realNum.length; i++){
                    if(realNum[i] < 2);
                    if(realNum[i] == 2){
                        System.out.print("So nguyen to: "+ realNum[i] );
                        
                    }
                    if(realNum[i] > 2){
                        //for(i = 1; i < realNum.length; i++){
                            //  Math.sqrt(realNum[i]);
                            for(int j = 2; j <= Math.sqrt(realNum[i]); j++){
                                if(realNum[i] % j != 0){
                                    System.out.println("So nguyen to: "+ realNum[i]);
                                    i = realNum.length + 1;
                                    break;
                                    // Math.sqrt(realNum[i] + 10);
                                }
                           // }
                        }
                    }
                }    
                break;
            case 4:
                int k = -1;
                while(k < 0 || k >= n){
                    System.out.println("Nhap vi tri k [ 0 < k < n]: ");
                    k = sc.nextInt();
                } 
                System.out.print("Nhap gia tri: ");
                int x = sc.nextInt();
                for(int i = n - 1; i >= k; i--) {
                    realNum[i] = realNum[i - 1];
                }
                realNum[k - 1] = x;
                
                System.out.println(Arrays.toString(realNum));
                break;
                
    }
    }
}
