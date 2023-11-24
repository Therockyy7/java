package filemaneger;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        //Kiểm tra tồn tại
        File folder1 = new File("D:\\java_tu_hoc\\filemaneger\\File2.java");
        System.out.println("folder exist: "+folder1.exists());

        //Tạo thư mục mới 
        //Phương thức mkdir() => tạo một thư mục
        File d1 = new File("D:\\java_tu_hoc\\filemaneger\\forderNew1");
        d1.mkdir();
        // phương thức mkdirs() => tạo hàng loạt thư mục cùng 1 lúc bắt đầu từ đầu đế móc cuối cùng
        /*
         * File d2 = new File("D:\\java_tu_hoc\\filemaneger\\forderNew1\\forder2\\forder3")
         */

         //Tạo tập tin (có phần mở rộng: .exe, .txt, .doc, ...)
         File fileText = new File("D:\\java_tu_hoc\\filemaneger\\filetxt\\test.txt");
         try {
            //True khi file chưa được tạo 
            //False khi file đã được tạo trước đó   
            boolean check = fileText.createNewFile();
            System.out.println("Created file: "+check);
        } catch (IOException e) {
            /*
             * nguyễn nhân phải bắt lỗi
             * + có một số phần user ko có quyền tạo tập tin
             * + ổ cứng bị đầy
             * + đường dẫn sai
             */
            e.printStackTrace();
        }
    }
    
}
