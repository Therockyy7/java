import java.util.*;

public class arryex {
    public static void main (String[] args){
        int[] Arr = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");  
        for(int i = 0; i < Arr.length; i++){
            //int num = sc.nextInt();
            Arr[i] = sc.nextInt();
        }
        
        System.out.println();
        System.out.println(Arrays.toString(Arr));
    }
    
}
