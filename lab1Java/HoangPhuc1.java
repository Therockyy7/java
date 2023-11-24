package lab1Java;
import java.util.Scanner;

public class HoangPhuc1 {
    public static void main(String[] args) {
        String arr1;
        Scanner sc = new Scanner(System.in);
        // System.out.println("Nhap so chuoi");
        System.out.println("Nhap chuoi: ");
        // String chuoi = sc.nextLine();
        arr1 = sc.nextLine();
        System.out.println(arr1);
        System.out.println(arr1.length());
        
        int demSO = 0;
        int demKituDacbiet = 0;
        int demNguyeAm = 0;
        int demphuAm = 0;
    for(char out : arr1.toCharArray()){
        if(Character.isDigit(out)){
            demSO++;
        }else if(Character.isLetter(out)){
            char out2 = Character.toLowerCase(out);

            if(out2 == 'u' || out2 == 'o'|| out2 == 'e' || out2 == 'a' || out2 == 'i'){
            demNguyeAm++;
        }else{
            demphuAm++;
        }
    }else{
        demKituDacbiet++;
    }
}
System.out.println("ki tu so: "+ demSO);
System.out.println("Nguyen am: "+ demNguyeAm);
System.out.println("Phu am: "+demphuAm);
System.out.println("ky tu dac biet: "+ demKituDacbiet);
} 
}
