package filemaneger.ghimotdoituongvaofile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class viduGhiduLieu {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\java_tu_hoc\\filemaneger\\filetxt\\fileData.data");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            SInhVien st =new SInhVien(0001, "hoangPhuc", "de180455", 10);
            oos.writeObject(st);

            oos.flush();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException a){
            a.printStackTrace();
        }
    }
}
