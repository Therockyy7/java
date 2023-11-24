package filemaneger;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class GhiFile {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("D:\\java_tu_hoc\\filemaneger\\filetxt\\testGhiFile.txt","UTF-8");
            pw.println("Xin chào, tôi là LInh");
            pw.print("Dữ liệu: ");
            pw.println("3.14");

            Student st = new Student(10, "Trần Hoang Linh ");
            pw.println(st);

            pw.flush();//Đẩy dữ liệu xuống File ngay lập tức
            pw.close();//Luốn luôn nhớ phải đóng File sau khi sử dụng xong

        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
