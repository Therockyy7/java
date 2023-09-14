import java.util.Scanner;

public class tinh_cafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu_cafe menu = new menu_cafe();
        menu.menu();
        String ans2;
        String yes = "Yes";
        do{

            System.out.println("Chon loai hat: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Đọc dòng trống sau khi đọc chuỗi "Yes" hoặc "No"
            /*bạn có thể thêm một lệnh  sc.nextLine()  ngay sau  sc.nextInt()  để đọc ký tự xuống dòng sau khi đọc giá trị  choice 
            . Điều này giúp xóa bộ đệm đầu vào và cho phép bạn nhập câu trả lời "Yes" hoặc "No" bình thường */
            menu.bill(choice);
            System.out.println("BAn muon chon tiep khong? [Yes/No]");
            ans2 = sc.nextLine();
        }while(ans2.equalsIgnoreCase(yes));
        System.out.println("Tong Bill: "+ menu.sum);
        

    }
}
