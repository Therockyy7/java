package enumPractice;

public class Test {
    public static void main(String[] args) {
        // có 2 kỉu gọi enum
        // C1:
        Thang day = Thang.Thang_1;
        System.out.println("Thang 1: "+ day.soNgay());
        
        // C2:
        // int day = Thang.Thang_1.soNgay();
        // System.out.println("Thang 1: "+ day);
    }
}
