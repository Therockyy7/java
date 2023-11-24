package homwork.homewokA;

import java.util.Arrays;
import java.util.Scanner;

public class ArrHomeWork {
    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
        int ans;
        int k, getvalue,i;
        System.out.print("So luong mang muon nhap: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        Funtion fun = new Funtion();
        fun.nhapMang(n,a);
        System.out.println();
        System.out.print("Mang: ");
        for(int out : a){
            if(out != 0)
            System.out.print(out + " ");
        }
        System.out.println();
        System.out.println();

        fun.menu();
        System.out.println("Chon: ");
        ans = sc.nextInt();
        switch(ans){
            case 1:
                fun.add(n, a);
                System.out.println(Arrays.toString(a));
            break;
            case 2:
                fun.size(a);
            break;
            case 3:
                k = fun.choose_position(n);
                fun.insert(k, n, a);
                break;
            case 4:
                System.out.print("Gia tri muon kiem tra: ");
                k = sc.nextInt();
                if(fun.contains(a, k)){
                    System.out.println("Exist.");
                }else{
                    System.out.println("Not exist.");
                }
                break;
            case 5:
                fun.clear(a);
                break;
            case 6:
                k = fun.choose_position(n);
                getvalue = fun.getValue(a, k);
                System.out.println("The value of "+ k +" position: " + getvalue);
                break;
            case 7:
                System.out.print("Value which you want to find: ");
                getvalue = sc.nextInt();
                i = fun.indexOf(a, getvalue);
                
                if(i == 1){
                    System.out.println(getvalue + " is Exist.");
                }
                if(i == -1){
                    System.out.println(getvalue + " is Not exist.");
                }
                break;
            case 8:
                getvalue = fun.isEmty(a);
                if(getvalue == 1){
                    System.out.println("Array is emty.");
                }
                if(getvalue == 0){
                    System.out.println("Not emty.");
                }
            break;    
            case 9:
                System.out.print("Value which you want to find: ");
                getvalue = sc.nextInt();
                i = fun.lastIndexOf(a, getvalue);
                
                if(i == 1){
                    System.out.println(getvalue + " is Exist.");
                }
                if(i == -1){
                    System.out.println(getvalue + " is Not exist.");
                }
            break;
            case 10:
                
                fun.remove(a, n);   
            break; 
            case 11:
                fun.replace(a, n);
            break;
            case 12:
                fun.set(a, n);
            break;
            case 13:
                System.out.print("Group: ");
                System.out.print(fun.toString(a));
                break;
          
            
        }
       

    }
}
    

