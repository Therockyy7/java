import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ary {
    
    public static List<Integer> reverselist(List<Integer> num_List){
         if(num_List.size() <= 1){
             return num_List;
         }
         List<Integer> reverse = new ArrayList<>();
         reverse.add(num_List.get(num_List.size() - 1));
         reverse.addAll(reverselist(num_List.subList(0, num_List.size() - 1)));
         return reverse;
     }
    public static int findPosition(int x, ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == x){
                return i;
            }
        }
        return -1;
    }
    public static void swap(ArrayList<Integer> list,int a, int b){
        int x = findPosition(a, list);
        int y = findPosition(b, list);
        list.set(x, b);
        list.set(y, a);
     }
    public static void upDate(ArrayList<Integer> list){
        list.clear();
        Scanner net = new Scanner(System.in);
        System.out.print("So luong phan tu: ");
        int n = net.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Bien: ");
            int x = net.nextInt();
            list.add(x);
        }
    }
    public static boolean Search(ArrayList<Integer> list, int x){
        for(int out : list){
            if(out == x){
                return true;
            }
        }
        return false;
    }
    public static void subList(List<Integer> list, int x, int y){
       int i = 0;
       while(i < list.size()){
        if(i < x || i >= y){
            list.remove(i);
        }
            i++;

       }
        System.out.print("After sublist: "+ list);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("so luong: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Bien: ");
            int x = sc.nextInt();
            list.add(x);
        }
        
        
        System.out.println();
        System.out.print("Created: ");
        for(int out : list){
            System.out.print(out+ " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Menu");
        System.err.println("1: sort elements");
        System.out.println("2: reverse list");
        System.out.println("3: compare two arrays list");
        System.out.println("4: Swap.");
        System.out.println("5: Join new Arraylist to old");
        System.out.println("6: Update new element.");
        System.out.println("7: search element.");
        System.out.println("8: Sublist.");
        System.out.print("Chon: ");
        ans = sc.nextInt();
        
        switch(ans){
            case 1:
                Collections.sort(list);
                // list.sort(null);
                System.out.print(list + " ");
                break;
            case 2: 
                List<Integer> output = reverselist(list);
                
                System.out.print("After reverse: ");
                System.out.print(output);
                break;
            case 3:
                System.out.print("So luong: "); 
                n = sc.nextInt();
                ArrayList<Integer> newList = new ArrayList<>();
                for(int i = 0; i < n; i++){
                    System.out.print("Bien: ");
                    int x = sc.nextInt();
                    newList.add(x);
                }
                Boolean out = list.equals(newList);
                System.out.print("Compare equal two arrays: ");
                System.out.print(out);
                break;
            case 4: 
                System.out.println("swap x to y");
                System.out.print("x: ");
                int a = sc.nextInt();
                System.out.print("y: ");
                int b = sc.nextInt();
                swap(list, a, b);
                System.out.print("After Swap: " + list);
                break;
            case 5:
                System.out.print("So luong: "); 
                n = sc.nextInt();
                ArrayList<Integer> newList2 = new ArrayList<>();
                for(int i = 0; i < n; i++){
                    System.out.print("Bien: ");
                    int x = sc.nextInt();
                    newList2.add(x);
                }
                list.addAll(newList2);
                System.out.print(list);
                break;
            case 6:
                System.out.println("UPDATE");
                upDate(list);
                System.out.print(list);
                break;
            case 7: 
                System.out.print("Search element: ");
                int x = sc.nextInt();
                System.out.print("The element contain: "+Search(list, x));
                break;
            case 8:
                System.out.println("Sublist from array");
                System.out.print("from index: ");
                int q = sc.nextInt();
                System.out.print("to index: ");
                int z = sc.nextInt();
                subList(list, q, z);
                break;
            
            }



        }
            

}
