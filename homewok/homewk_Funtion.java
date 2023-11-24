package homewok;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class homewk_Funtion {
   

    public static void main(String[] args) {
       int ans2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Nhap bien: ");
            int x = sc.nextInt();
            arr[i] = x;
        }
        
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println("menu");
        System.out.println("1: product of all the elements in an integer array.");
        System.out.println("2: set all element to 0");
        System.err.println("3: The diffrence between the largest number and the smallest number.");
        System.out.print("Chon: ");
        int ans = sc.nextInt();
        method_For_homewkFuntion funtion = new method_For_homewkFuntion();
        switch(ans){
            case 1: 
                System.out.print("All: "+ funtion.sum(arr));
                break;
            case 2:
                System.out.println("Set all O");
                funtion.setAllZero(arr);
                break;
            case 3:
                funtion.differenceOfMax_Min(arr);
                break;    
            case 4:
                System.out.print("Sum of odds index: "+ funtion.odd(arr));
                break;
            case 5:
                // Scanner scn = new Scanner(System.in);
                System.out.println("Enter the string: (write 'Stop' to end)");
                
                // String str = scn.nextLine();
                String[] mainString = new String[100];
                do{

                    
                    for(int i = 0; i < mainString.length; i++ ){
                        mainString[i] = sc.nextLine();
                        if(mainString[i].equalsIgnoreCase("Stop") ){
                            ans2 = 2;
                            break;

                        }
                    }
                }while(ans2 == 0);
                
                System.out.println("Mang: ");
                for(String out : mainString){
                    if(out != null){
                        System.out.println(out);
                    }
                }
                
                System.out.print("Check contain 'Hello': "+ funtion.check_Hello(mainString));
                break;
            case 6:
                char rev[] = new char[100];
                
                System.out.println("Nhap mot chuoi: ");
                // chuyển đổi chuỗi nhập vào thành mảng kiểu char
                rev = sc.next().toCharArray();
                System.out.println();
                System.out.println("Mang Char: ");
                for(char out : rev){
                    System.out.print(out);
                }
                System.out.println();
                System.out.print("After reverse: ");
                funtion.reverselist(rev);
                break;
            case 7:
                ArrayList<Integer> arrlist = new ArrayList<>();
                System.out.print("Nhap vao so luong: ");
                 n = sc.nextInt();
                for(int i = 0; i < n; i++){
                    System.out.print("Bien: ");
                    int x = sc.nextInt();
                    arrlist.add(x);
                }
                System.out.println();
                System.out.print("Mang: ");
                for(int out : arrlist){
                    System.out.print(out+ " ");
                }
                System.out.println();
                System.out.print("Sum of all: "+ funtion.sum(arrlist));
                break;
            case 8:
                System.out.print("Cap phat bo nho: ");
                n = sc.nextInt();
                sc.nextLine();
                ArrayList<String> arrlist_String = new ArrayList<>();
                System.out.println("Nhap chuoi: ");
                for(int i = 0; i < n; i++){
                    String str_list = sc.nextLine();
                    arrlist_String.add(str_list);
                    
                }
                System.out.println();
                System.out.println(arrlist_String);
                System.out.println("size: "+ arrlist_String.size());
                System.out.println("Check (odd/even): " + funtion.oddEven(arrlist_String));
                break;
            case 10:
                double arr_double[][] = {{1.2, 2.3, 4.1, 5.9}, {1.4, 2.2, 2.5, 9.2}, {1.32, 1.65, 4.32, 8.6}};
                System.out.println("Doc mang");
                // số dòng = độ dài của mảng 
                for(int i = 0; i < arr_double.length; i++){
                    for(int j = 0; j < arr_double[i].length; j++ ){
                        System.out.print(arr_double[i][j]+ " | ");
                    }
                    System.out.println();
                }
                System.out.print("The number of row: "+ funtion.numberOfRow(arr_double));
                break;
            case 11:
                int arr_ints[][] = {{1,2,3,4}, {2,3,1,4}, {6,1,2,4}};
                System.out.println("Doc mang");
                // arr_ints.length tương ứng với số dòng
                for(int i = 0; i < arr_ints.length; i++){
                    // arr_ints[i].length tương ứng với số cột
                    for(int j = 0; j < arr_ints[i].length; j++){
                        /*arr_ints[i] là một mảng một chiều kiểu int. Nó là phần tử thứ i của mảng hai chiều arr_ints[][]
                         * arr_ints[i].length là độ dài của mảng tại vị trí thứ i và bằng số cột của mảng arr_ints[i]
                         */
                        System.out.print(arr_ints[i][j] + " | ");
                    }
                    System.out.println();
                }
                System.out.print("Sum of the elements in the last column of each row: "+ funtion.sum(arr_ints));
                break;

        }
    }
}
