package map;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
    private Map<String, String> data = new TreeMap<String, String>();
//Them    
    public String themTu(String tuKhoa, String yNghia){
        return this.data.put(tuKhoa, yNghia);
    } 

    public String xoaTu(String tuKhoa){
        return this.data.remove(tuKhoa);
    }
//Lấy ra một value của nó
    public String traTu(String tuKhoa){
        String ketQua = this.data.get(tuKhoa);
        return ketQua;
    }
//in tất cả 
    public void inTuKhoa(){
        Set<String> tayHopTuKhoa = this.data.keySet();
        //keySet là hàm dùng để lấy ra hết toàn bộ từ khóa
        System.out.println(Arrays.toString(tayHopTuKhoa.toArray()));
    }
//in ra số lượng
    public int soLuong(){
        return this.data.size();
    }
//xoa all\
    public void xoaTatCa(){
        this.data.clear();
    }
 
    public static void main(String[] args) {
        TuDien tuDien = new TuDien();
        int choice = 0;
         String tuKhoa;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("-------------------------------------------");
            System.out.print("Tra từ diển: \n"+
            "1: Thêm từ (Từ khóa, ý nghĩa)\n"
            +"2: Xóa từ\n"
            +"3: Tra từ điển\n"
            +"4: In ra danh sách từ khóa\n"
            +"5: In ra số lượng\n"
            +"6: Xóa tất cả các từ khóa\n"
            +"Lựa chọn: ");
            choice = sc.nextInt();
            sc.nextLine();
            if(choice == 1){
                System.out.print("Nhập từ khóa mới: "); tuKhoa = sc.nextLine();
                System.out.print("Ý nghĩa cảu từ khóa: "); String yNghia = sc.nextLine();
                tuDien.themTu(tuKhoa, yNghia);
            }else if(choice == 2 || choice == 3){
                System.out.print("Nhập từ khóa: "); tuKhoa = sc.nextLine();
                if(choice == 2){
                    tuDien.xoaTu(tuKhoa);
                }else{
                    System.out.println("Kết quả: ");
                    System.out.println(tuDien.traTu(tuKhoa));
                }
            }else if(choice == 4){
                System.out.println("Tất cả");
                tuDien.inTuKhoa();
            }else if(choice == 5){
                System.out.println("Số lượng từ khóa: "+tuDien.soLuong());
            }else{
                System.out.println("Clear ALL");
                tuDien.xoaTatCa();
            }

        }while(choice != 0);
    }
}
