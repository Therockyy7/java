package array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hon_Tap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(9);
        list.add(1);
        list.add(5);
        for(int out : list){
            System.out.print(out + " ");
        }
        System.out.println();
        System.out.println("1: Xoa phan tu tai vi tri 0.");
        System.out.println("2: Them vao co toi < 0)");
        int ans = sc.nextInt();
        switch(ans){
            case 1:
                list.remove(0);
                for(int out : list){
                System.out.print(out + " ");
                }
                break;
            case 2: 
                do{
                    System.out.print("Them: ");
                    i = sc.nextInt();
                    list.add(i);
                }while(i > 0);
                for(int out : list){
                    if(out != 0){
                        System.out.print(out + " ");
                    }
                }
                break;
            case 3: 
                System.out.print(" vi tri cua so nguyen to lon nhat: ");
                    
        }
} 
}
