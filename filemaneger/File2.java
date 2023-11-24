package filemaneger;

    
import com.sun.tools.javac.Main;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
 
public class File2 {
  

  static String fileIn = "input.txt";             //Duong dan tuong doi
//    static String fileIn = "D:\\Data\\input.txt; //Duong dan tuyet doi
    public static void userScanner(){
        try{
            File f = new File(fileIn);
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException ex)  {
            System.out.println("file not found " + fileIn);
        }
    }
    
        public static void main(String [] args) {
            userScanner();
        }
        
}

