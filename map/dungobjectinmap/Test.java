package map.dungobjectinmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test {
    // Person person = new Person();
    Scanner sc = new Scanner(System.in);
    public Map<String, Person> users = new HashMap<>();
    // private Person them(){
    //     return this.users.put("Alice", new Person("Teo", 10));
    // }
    public Person them(String newName, int age){
        // System.out.print("Name: ");  String newName = sc.nextLine(); sc.nextLine();++++++=====>>> không được nhập thêm dữ liệu trên này vì nó chỉ có thể thêm đc 1 người vào và người sao ko nhận
        // và sẻ trả về null
        // System.out.print("Age: "); int ag = sc.nextInt(); 
        return this.users.put(newName, new Person(newName, age));
    }
    //vì Map<String, Person> thì Person là giá trị được trả về nên kỉu dữ liệu phải là Person
    public Person timKiem(String tuKhoa){
        return users.get(tuKhoa);
    }

    public Person xoa1nguoi(String tuKhoa){
        return this.users.remove(tuKhoa);
    }

    public void inTatCa(){
        Set<String> tapHopUsers = this.users.keySet();// Chỉ có thể in ra các từ khóa không in ra các giá trị 
        System.out.println(Arrays.toString(tapHopUsers.toArray()));
    }

    public int soLuong(){
        return this.users.size();
    }
    public void xoaTatCa(){
        this.users.clear();
    }
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        Test test = new Test();
        String name;
    //     test.them();
    //     Person alice = test.users.get("Alice");
    //    System.out.println("Ten: "+ alice.getName());
    //    System.out.println("tuoi: "+ alice.getAge()); 
        int choice = 0;
    do{
        System.out.println("-------------------------------------------");
        System.out.print("Tra từ diển: \n"+
        "1: Thêm \n"
        +"2: Xóa \n"
        +"3: Tra \n"
        +"4: In ra danh sách từ khóa\n"
        +"5: In ra số lượng\n"
        +"6: Xóa tất cả các từ khóa\n"
        +"Lựa chọn: ");
        choice = sh.nextInt();
        System.err.println();
        sh.nextLine();
        if(choice == 1){
            System.out.print("Name: ");  String newName = sh.nextLine(); 
            System.out.print("Age: "); int age = sh.nextInt(); 
            test.them(newName,age);
        }
        if(choice == 2){
            System.out.print("Nhập 1 tên: ");
            name = sh.nextLine();
            test.xoa1nguoi(name);
        }
        if(choice == 3){
            System.out.print("Name: ");  String tuKhoa = sh.nextLine();
            // Person nextIt = test.users.get(tuKhoa);
            System.out.println("Ket qua:\n"+ test.timKiem(tuKhoa));
        }
        if(choice == 4){
            System.out.println("In tắt cả từ khóa: ");
            test.inTatCa();
        }
        if(choice == 5){
            System.out.println("Số lượng danh sách: "+ test.soLuong());
        }
        if(choice == 6){
            System.out.println("Clear All~");
            test.xoaTatCa();
        }
    }while(choice != 0);
    }
}
