import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class idolDictionary {
    public static void main(String[] args) {
        try {
            Scanner search = new Scanner(System.in);
            Path path = Path.of("Idol.txt");
            List<String> id_data_list = Files.readAllLines(path);
            while(true){
                System.out.print("Nhap ten idol: ");
                
                String tim_Kiem = search.nextLine();
                System.out.format("%-15s %-5s %-10s %-10s %-15s\n", "Ho va Ten", "Tuoi", "Chieu cao", "Can nang", "Tinh trang");
                for (String id_data : id_data_list) {
                    String idol[] = id_data.split(";");
                    id_idol ID = new id_idol();
                    ID.name = idol[0];
                    ID.age = Integer.valueOf(idol[1]);
                    ID.tall = Double.valueOf(idol[2]);
                    ID.weight = Double.valueOf(idol[3]);
                    
                    if(ID.name.contains(tim_Kiem) == true){
                        System.out.format("%-15s %-5s %-10s %-10s %-15s \n", ID.name, ID.age, ID.tall, ID.weight, ID.du_tuoi() ); 
                    }
                }   
                System.out.println("---------------------------------------------------------");
            }      
        } 
        catch (IOException e ){}
        
    }
}
