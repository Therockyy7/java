package taiXiu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RanDomFunTion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale lc = Locale.of("vi", "VN");
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);

        double taiKhoan = 500.000;
        double tienCuoc;
        int ans;
        int choice = 1;
        do{
            

                try {
                    System.out.println("---------MỜI BẠN CHỌN---------");
                    System.out.println("Tài khoảng: "+ numf.format(taiKhoan));
                    System.out.println("1) Để chơi.");
                    System.out.println("0) Thoát.");
                    System.out.print("Chọn: ");
                    ans = sc.nextInt();
                    
                } catch (Exception e) {
                    System.out.println("Nhập sai!");
                    ans = 0;
                }
            
            if(ans == 1){    
                System.out.println("**Mời bạn đặt cược:");
                System.out.println("Tài khoảng của bạn còn: "+ numf.format(taiKhoan));
                System.out.print("Bạn muốn cược: ");
                tienCuoc = sc.nextInt();
                if(tienCuoc <= taiKhoan && taiKhoan != 0){
                    System.out.println("---------MỜI BẠN ĐOÁN---------");
                    System.out.println("1) Tài.");
                    System.out.println("2) Xỉu.");
                    System.out.print("Chọn: ");
                    choice = sc.nextInt();
                    Random xx = new Random();
                    // hàm ramdom mà xx1.nextInt(n) có nghĩa là random từ 0 đên n
                    int lan1 = xx.nextInt(5) + 1;
                    int lan2 = xx.nextInt(5) + 1;
                    int lan3 = xx.nextInt(5) + 1;
                    int sum = lan1 + lan2 + lan3;
                    System.out.println("Đổ: "+ lan1 +"-"+ lan2 + "-" + lan3);
                    System.out.println("Tổng: "+ sum);
                    if(sum == 3 || sum == 18){
                        System.out.println("Bạn đã thua: nhà cái thắng");
                        taiKhoan = 0;

                    }
                    if(sum >= 4 && sum <=10 ){
                        if(choice == 2){
                            System.out.println("*****Bạn đã thắng!");
                            taiKhoan += tienCuoc;
                        }else{
                            System.out.println("*****Bạn thua.");
                            taiKhoan -= tienCuoc;

                        }
                    }
                    if(sum >= 11 && sum <= 17){
                        if(choice == 1){
                            System.out.println("*****Bạn đã thắng!");
                            taiKhoan += tienCuoc;
                        }else{
                            System.out.println("*****Bạn đã thua.");
                            taiKhoan -= tienCuoc;
                        }
                    }
                }else{
                    System.out.println("Tài khoảng của bạn không đủ: "+ numf.format(taiKhoan));
                    
                }            


            }

            

        }while(ans != 0);
    }
}
