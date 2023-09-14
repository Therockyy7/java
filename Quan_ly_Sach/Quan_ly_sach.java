import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class Quan_ly_sach {
    public static void main(String[] args) {
        try {
            Scanner search = new Scanner(System.in);
            Path path = Path.of("Infor_book_2.txt");
            List<String> data_List = Files.readAllLines(path);

            System.out.print("Nhap ten sach: ");
            String tim_Kiem = search.nextLine();
            System.out.println("\n");
            System.out.format("%-35s %-5s %-5s %-19s %-5s\n", "Ten sach","Gia","Nam","Tac gia","Tuoi tac gia");
            for (String id_data : data_List) {
                String data[] = id_data.split(";");
                book_information infor = new book_information();
                infor.name_Book = data[0];
                infor.paid = Integer.valueOf(data[1]);
                infor.year = Integer.valueOf(data[2]);
                infor.author = data[3];
                infor.age_Author = Integer.valueOf(data[4]);
                if(infor.name_Book.contains(tim_Kiem)){
                    System.out.format("%-35s %-5s %-5s %-19s %-5s\n",infor.name_Book, infor.paid, infor.year, infor.author, infor.age_Author);
                    int year_siml = infor.year;
                    String name = infor.name_Book;
                    System.out.println("----------------------------------------------------------------------------------------");
                    System.out.println("Sach duoc san xuat cung nam:\n");             
                    for (String id_data2 : data_List){
                        String data2[] = id_data2.split(";");
                        infor.name_Book = data2[0];
                        infor.paid = Integer.valueOf(data2[1]);
                        infor.year = Integer.valueOf(data2[2]);
                        infor.author = data2[3];                                                                                                                                    
                        infor.age_Author = Integer.valueOf(data2[4]);
                        
                        if(year_siml == infor.year && name != infor.name_Book){
                            System.out.format("%-35s %-5s %-5s %-19s %-5s\n",infor.name_Book, infor.paid, infor.year, infor.author, infor.age_Author);
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        }     
                        
                    }
                    
                }
            }
            System.out.println("----------------------------------------------------------------------------------------");



        } catch (IOException e) {}
    }
}
