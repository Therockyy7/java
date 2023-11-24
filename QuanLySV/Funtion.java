package QuanLySV;

import java.util.Scanner;

public class Funtion {
    Scanner sc = new Scanner(System.in);
    DanhSachSV ds = new DanhSachSV();
    public void themSV(){
        System.out.println("Nhập mã sinh viên: "); String mssv = sc.nextLine();
        System.out.println("Họ và tên: "); String name = sc.nextLine();
        System.out.println("Năm sinh: "); int yearOld = sc.nextInt();
        System.out.println("Điểm trung bình: "); float dtb = sc.nextFloat();
        SInhVien sv = new SInhVien(yearOld, name, mssv, dtb);
    }

    // public void inDS(){
    //     ds.inDanhSach();
    // }
}
