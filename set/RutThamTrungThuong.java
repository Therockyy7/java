package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RutThamTrungThuong {
    Set<String> thungPhieuHoapPhieuDuThuong = new HashSet<String>();
    

    public RutThamTrungThuong() {   
    }

    public boolean themPhieu(String giaTri){
        return this.thungPhieuHoapPhieuDuThuong.add(giaTri);
    }

    public boolean xoaPhieu(String giaTri){
        return this.thungPhieuHoapPhieuDuThuong.remove(giaTri);
    }

    public boolean kieuTraPhieuTonTai(String giaTri){
        return this.thungPhieuHoapPhieuDuThuong.contains(giaTri);
    }

    public void xoaAllPhieu(){
        this.thungPhieuHoapPhieuDuThuong.clear();
    }

    public int soLuongPhieu(){
        return this.thungPhieuHoapPhieuDuThuong.size();
    }

    public String rutPhieu(){
       String ketQua = "";
        Random random = new Random();
        int viTri = random.nextInt(this.thungPhieuHoapPhieuDuThuong.size());
        /*  Nếu muốn ép kiểu MỘT phần tử trong mảng trả về bởi toArray(), thì sử dụng cú pháp:  (kiểu dữ liệu) mảng.toArray()[vị trí].
            Nếu muốn ép kiểu TOÀN bộ mảng trả về bởi toArray(), thì sử dụng cú pháp:            (kiểu dữ liệu[]) mảng.toArray(). 
            */
        ketQua  = (String) this.thungPhieuHoapPhieuDuThuong.toArray()[viTri];
        //Lấy ra một cái giá trị trong set thì sài toArray đẻ lấy
        return ketQua;
    }

    public void intatca(){
        System.out.println(Arrays.toString(this.thungPhieuHoapPhieuDuThuong.toArray()));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        RutThamTrungThuong rt = new RutThamTrungThuong();
        do{
            System.out.println("--------------------------------------");
            System.out.println("MENU");
            System.out.println("1: Thêm mã số dự thưởng. ");
            System.out.println("2: Xóa mã số dự thưởng.");
            System.out.println("3: Kiểm Tra mã số dự thưởng có tồn tại hay không?.");
            System.out.println("4: Xóa tất cả cá phiếu dự thưởng.");
            System.out.println("5: Số lượng phiếu thưởng.");
            System.out.println("6: Rút thăm trúng thưởng.");
            System.out.println("7: In ra tất cả.");
            System.out.println("0: Thoát khỏi chương trình.");
            System.out.print("Chon: "); 
            choice = sc.nextInt();
            if(choice == 1 || choice == 2 || choice == 3){
                System.out.print("Nhập mã số: ");
                String giaTri = sc.nextLine();
                if(choice == 1){
                    rt.themPhieu(giaTri);
                }
                if(choice == 2){
                    rt.xoaPhieu(giaTri);
                }
                if(choice == 3){
                    rt.kieuTraPhieuTonTai(giaTri);
                }

            }
            if(choice == 4){
                rt.xoaAllPhieu();
            }
            if(choice == 5){
                rt.soLuongPhieu();
            }
            if(choice == 6){
                System.out.println("Rút ra được: "+ rt.rutPhieu());
            }
        }while(choice != 0);
    }
}

