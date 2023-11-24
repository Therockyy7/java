package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import fraction.test;
// Map là một giao diện lưu trữ dữ liệu theo cặp khóa (key) và giá trị (value). Mỗi cặp key và value được gọi là entry.
// Phương thức entrySet() trong Map trả về một tập hợp các entry trong map. Tập hợp này có thể được sử dụng để lặp qua các entry trong map.
public class Entry {
    Map<String, Integer> userss = new HashMap<>();

    public Integer themUser(String name, int age){
        return this.userss.put(name, age);
    }

    public void inAll(){
        Set<Map.Entry<String, Integer>> entries = this.userss.entrySet();
        for(Map.Entry<String, Integer> entri : entries){
            System.out.println(entri.getKey() +" : "+ entri.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        Entry entry = new Entry();
        do{
            System.out.print("1: them\n"+"2: in all\n"+"Your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            if(choice == 1){
                System.out.print("Nhap key: "); String key = sc.nextLine();
                System.out.print("Nhap value: "); int value = sc.nextInt();
                entry.themUser(key, value);
            }
            if(choice == 2){
                entry.inAll();
            }
        }while(choice != 0 );
    }
}
