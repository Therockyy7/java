import java.util.Scanner;

public class tinh_toan {
    public int binhPhuong(int n){
        int x;
        return x = n * n;
    }
    public static void main(String[] args) {
        int i;
        for(i = 1; i < 10; i++){
            tinh_toan squad = new tinh_toan();
            System.out.println(i+" ^ 2 = " + squad.binhPhuong(i));
        }
    }
}
