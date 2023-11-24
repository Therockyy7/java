package filemaneger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteFile {
    public static void xoaFile(File fx){
        if(fx.isFile()){
            //xóa nếu là tập tin
            System.out.println("Đã xóa: "+ fx.getAbsolutePath());
            fx.delete();
        }else if(fx.isDirectory()){// có 2 trường hợp: 1 là thư mục rổng,2 là thư mục ko rỗng
            // lấy các file con
            File[] mangCon = fx.listFiles();
            for(File f : mangCon){
                //xóa các file con
                xoaFile(f);
            }
            // xóa bản thân Thư mục sau khi đã xóa các file con
            System.out.println("Đã xóa: "+ fx.getAbsolutePath());
            fx.delete();
        }
    }
    public static void main(String[] args) {
        // Sử dụng class File xóa tập tin hoặc thư mục
        File f0 = new File("D:\\java_tu_hoc\\F0");
        File f0_1 = new File("D:\\java_tu_hoc\\F0_1");
        
        // f0.deleteOnExit();// ko xóa được vì nó ko rỗng
        //f0_1.deleteOnExit();// xóa được vì là 1 thư mục rỗng => ko trả về true ỏ false gì hết

        //System.out.println(f0_1.delete()); // Nố trả về true/ false nếu file có tồn tại hay ko để xóa
        
        //DeleteFile.xoaFile(f0);
        /*
         *  Đã xóa: D:\java_tu_hoc\F0\F!\F2\123..txt
            Đã xóa: D:\java_tu_hoc\F0\F!\F2\abc.txt
            Đã xóa: D:\java_tu_hoc\F0\F!\F2
            Đã xóa: D:\java_tu_hoc\F0\F!
            Đã xóa: D:\java_tu_hoc\F0
         */
//--------------------------------------------------------------------------------------------------------
         // Sử dụng class File Xóa tập tin hoặc thư mục

         Path p0 =  f0.toPath();
         Path p0_1 = f0_1.toPath();
        
         try {
            // Files.deleteIfExists(p0);// ko xóa được vì nó ko rỗng
            Files.deleteIfExists(p0_1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
