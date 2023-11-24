package filemaneger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.StandardCopyOption;

public class CopyAndMoveFile {
    public static void copyAll(File f1, File f2){
        try {
            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(f1.isDirectory()){
            File[] mangCon = f1.listFiles();
            for(File file : mangCon){
                File f_new = new File(f2.getAbsolutePath()+ "//" + file.getName());
                copyAll(file, f_new);
            }
        }
    }
    public static void main(String[] args) {
        File f0 = new File("D:\\java_tu_hoc\\filemaneger\\filetxt\\File_1.txt");
        File f1 = new File("D:\\java_tu_hoc\\filemaneger\\filetxt\\File_2.txt");
        File f2 = new File("D:\\java_tu_hoc\\filemaneger\\filetxt\\File_1ABC.txt");
        //1. thay đổi tên tập tin hoặc thư mục

        // *********Sử dụng File để thay đổi tên****************
        // f0.renameTo(f1);

        // *********sử dụng Files để thay đổi tên***************
        // Path
        /* 
            try {
                Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
                //StandardCopyOption.REPLACE_EXISTING là copy theo tiêu chuẩn là nếu như có file nào đã tồn tại thì ghi đè lên lun.
            } catch (IOException e) {
                e.printStackTrace();
            }
        */
        

        //2. di chuyển file

            File f_2new = new File("D:\\java_tu_hoc\\filemaneger\\testchuyenfile\\File_1ABC.txt");

            // Lưu ý:
            /*
             * khi chuyển vào một nơi khác thì vẫn phải có tên của file muốn chuyển vào cuối đường dãn của nơi muốn chuyển 
             */

            try {
                Files.move(f2.toPath(), f_2new.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }

        //3. Copy file
            
            File f_0 = new File("D:\\java_tu_hoc\\filemaneger");
            File f_0_Copy = new File("D:\\java_tu_hoc\\filemaneger_Copy");
/* 
            try {
                Files.copy(f_0.toPath(), f_0_Copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                ((Throwable) e).printStackTrace();

            }
             * 
             */
            //****** trường hợp trên chỉ có thể copy cái võ bên ngoài chứ ko copy hết mọi thứ bên trong khi nó là directory

            //  Nếu muốn Copy hết mọi thứ bên trong thì cần phải dùng đệ quy
            CopyAndMoveFile.copyAll(f_0, f_0_Copy);

    }
}
