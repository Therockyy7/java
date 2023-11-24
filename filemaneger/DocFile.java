package filemaneger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DocFile {
    public static void main(String[] args) {
        File f = new File("D:\\java_tu_hoc\\filemaneger\\filetxt\\testGhiFile.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line;
            try {
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
