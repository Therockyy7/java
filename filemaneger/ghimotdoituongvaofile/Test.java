package filemaneger.ghimotdoituongvaofile;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSV dssv = new DanhSachSV();
        int choice;
        do{

            System.out.println("MENU ---------- ");
			System.out.println("Vui lòng chọn chức năng: ");
			System.out.print(
                "1.	Thêm sinh viên vào danh sách.\n"
                + "2.	In danh sách sinh viên ra màn hình.\n"
                + "3.	Kiểm tra danh sách có rỗng hay không.\n"
                + "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
                + "5.	Làm rỗng danh sách sinh viên.\n"
                + "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
                + "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
                + "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
                + "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
                + "10.  Lưu danh sách sinh viên xuông tập tin."
                + "0.   Thoát khỏi chương trình.\n"
                + "Chọn: ");
                choice = sc.nextInt();
                sc.nextLine();
            
            switch(choice){
                case 1:
                    System.out.println("Nhập mã sinh viên: "); String mssv = sc.nextLine();
                    System.out.println("Họ và tên: "); String name = sc.nextLine();
                    System.out.println("Năm sinh: "); int yearOld = sc.nextInt();
                    System.out.println("Điểm trung bình: "); float dtb = sc.nextFloat();
                    SInhVien sv = new SInhVien(yearOld, name, mssv, dtb);
                    dssv.themSV(sv);
                    break;
                case 2:
                    dssv.inDanhSach();
                    break; 
                case 3:
                    System.out.println("Danh sách rỗng: "+ dssv.emty() );
                    break;
                case 4:
                    System.out.println("Số lượng sinh viên: "+ dssv.soLuongSV());
                    break;
                case 5:
                    System.out.println("Xóa hết!");
                    dssv.clearDS();
                    break;
                case 6:
                    System.out.print("Nhập mã sinh viên muốn kiểm tra: ");
                    mssv = sc.nextLine();
                    sv = new SInhVien(mssv);
                    System.out.println("Sinh viên tồn tại: "+ dssv.findSV(sv));
                    break;
                case 7:
                    System.out.println("Nhập mã sinh viên muốn xóa: ");
                    mssv = sc.nextLine();
                    sv = new SInhVien(mssv);
                    System.out.println(dssv.romveSV(sv));
                    break;
                case 8:
                    System.out.println("Nhập tên sinh viên muốn tìm: ");
                    String inName = sc.nextLine();
                    System.out.println("Sinh viên tìm đuọc: ");
                    dssv.findNameSV(inName);
                    break;
                case 9:
                    System.out.println("Xuất danh sách từ Thấp đến Cao: ");
                    dssv.xapXepThatToCao();
                    break;
                case 10:
                    System.out.println("Nhập tên File: ");
                    String tenFile = sc.nextLine();
                    File f = new File(tenFile);
                    dssv.ghiDulieuXuongFile(f);
                    break;
            }






            }while(choice != 0);
    }
}
