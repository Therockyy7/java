package filemaneger.docmotdoituongtringfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

import buildCompareTo.SinhVien;

public class ViduDocDuLieu {
    public static void main(String[] args) {
        
        try{
            File file = new File("D:\\java_tu_hoc\\filemaneger\\filetxt\\fileSinhVien.data");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            
            SInhVien st = (SInhVien) ois.readObject();
            System.out.println(st);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}

