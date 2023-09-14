import java.util.Scanner;

public class Get_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        int day = sc.nextInt();
        System.out.print("Nhap thang: ");
        int month = sc.nextInt();
        System.out.print("Nhap nam: ");
        int year = sc.nextInt();
        System.out.println("\n");
        System.out.println("Date:");
        Get_set_2 date = new Get_set_2(day, month, year);

        System.out.println(date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
        
        System.out.print("Ban muon sua ngay/thang/nam: ");
        sc.nextLine();
        String ans = sc.nextLine();
        switch (ans) {
            case "ngay":
                System.out.print("ngay: ");
                day = sc.nextInt();
                date.setDay(day);
                System.out.println(date.getDay() + "/" + date.getMonth() + "/" + date.getYear());

                break;
        
            case "thang":
                System.out.print("thang: ");
                month = sc.nextInt();
                date.setMonth(month);
                System.out.println(date.getDay() + "/" + date.getMonth() + "/" + date.getYear());

                break;
            case "nam":
                System.out.print("Nam: ");
                year = sc.nextInt();
                date.setYear(year);
                System.out.println(date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
                break;
    
        }
    }
}
