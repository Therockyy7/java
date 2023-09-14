import java.util.Scanner;

public class dien_tich_chuVi_hinhTron {
    public static void main(String[] args) {
        
       Scanner A = new Scanner(System.in);
       int r;
       int Ans;
       double chu_Vi, dien_Tich;
       System.out.println("Cho tinh S or CVi: (1/2)");
        Ans = A.nextInt();
        // System.out.println("Nhap R: ");
        // r = A.nextInt();
        switch (Ans) {
            case 1:
            System.out.println("Nhap R: ");  
            r = A.nextInt();
            dien_Tich = r * 2 * 3.14;
            System.out.println("Dien tich hinh tron: " + dien_Tich);
                break;
        
            case 2:
            System.out.println("Nhap R: ");
            r = A.nextInt();
            chu_Vi = Math.pow(r, 2) * 3.14;
            System.out.println("Chu vi hinh tron: " + chu_Vi);
                break;
        }
    }
}
