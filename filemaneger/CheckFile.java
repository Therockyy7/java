package filemaneger;

import java.io.File;
import java.util.Scanner;

public class CheckFile {
    Scanner sh = new Scanner(System.in);
    File file;
    
    public CheckFile(String nameFile) {
        this.file = new File(nameFile);
    }

    public boolean kiemTraThucThi(){
        return this.file.canExecute();
    }

    public boolean kiemTraCoTheDoc(){
        return this.file.canRead();
    }

    public boolean kiemTraCoTheGhi(){
        return this.file.canWrite();
    }

    public void induongDan(){
        System.out.println(this.file.getAbsolutePath());
    }

    public void inTenFile(){
        System.out.println(this.file.getName());
    }

    public void ktraFileOrForder(){
        if(this.file.isDirectory()){
            System.out.println("Đây là thư mục.");
        }else if(this.file.isFile()){
            System.out.println("Đây là file.");
        }
    }

    public void inDanhSachCacFileCon(){
        if(this.file.isDirectory()){
            System.out.println("Các tập tin con/ thư mục con làP: ");
            File[] mangCon = this.file.listFiles();
            for(File out : mangCon){
                System.out.println(out.getAbsolutePath());
            }
        }
    }

    public void inCayThuMuc(){
        this.inChiTietCayThucMuc(this.file, 1);
    }

    public void inChiTietCayThucMuc(File f, int level){
        for(int i = 0; i < level; i++){
            System.out.println("\t");
        }
        System.out.println("|_");
        System.out.println(f.getName());
        if(f.canRead() && f.isDirectory()){
            File[] mangCon = f.listFiles();
            for(File fx : mangCon){
                inChiTietCayThucMuc(fx, level + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        System.out.println("Nhập tên File: ");
        String namefile = sc.nextLine();
        CheckFile vdf = new CheckFile(namefile);
        do{
            System.out.println("MENU ---------- ");
			System.out.println("1. Kiểm tra file có thể thực thi: ");
			System.out.println("2. Kiểm tra file có thể đọc: ");
			System.out.println("3. Kiểm tra file có thể ghi: ");
			System.out.println("4. In đường dẫn: ");
			System.out.println("5. In tên file: ");
			System.out.println("6. Kiểm tra file là thư mục hoặc tập tin: ");
			System.out.println("7. In ra danh sách các file con: ");
			System.out.println("8. In ra cây thư mục: ");
			System.out.println("0. Thoát chương trình.");
			choice = sc.nextInt();
			switch (choice) {
                case 1:
                    System.out.println(vdf.kiemTraThucThi());
                    break;
                case 2:
                    System.out.println(vdf.kiemTraCoTheDoc());
                    break;
                case 3:
                    System.out.println(vdf.kiemTraCoTheGhi());
                    break;
                case 4:
                    vdf.induongDan();
                    break;
                case 5:
                    vdf.inTenFile();
                    break;
                case 6:
                    vdf.ktraFileOrForder();
                    break;
                case 7:
                    vdf.inDanhSachCacFileCon();
                    break;
                case 8:
                    vdf.inCayThuMuc();
                    break;
                }

        }while(choice != 0);
    }
}
