package homwork.homewok_1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.sound.sampled.AudioFileFormat.Type;

import org.w3c.dom.TypeInfo;

public class Funtion{
    Scanner sc = new Scanner(System.in);
    //int size;
    int Add;
    String ans;
    
    public void menu(){
        System.out.println("1: add vao duoi.");
        System.out.println("2: show the size of array.");
        System.err.println("3: insert x to k position.");
        System.out.println("4: the value that you want to search.");
        System.out.println("5: clear all.");
        System.out.println("6: get value.");
        System.out.println("7: find a value at the fist array.");
        System.out.println("8: check the emty array.");
        System.out.println("9: find a value at the end of array.");
        System.out.println("10: remove a value.");
        System.out.println("11: replace the fist element of array.");
        System.out.println("12: change the element.");
    }


    public void nhapMang(int n, int a[]){
        for(int i = 0; i < n - 1; i++){
            System.out.println("Nhap vao mang: ");
            Add = sc.nextInt();
            a[i] = Add;
        }
    }

    public void add(int n, int a[]){
        System.out.print("Muon them: ");
        Add = sc.nextInt();
        a[n - 1] = Add;
    }

    public int size(int a[]){
        return a.length;
    }

    public int choose_position(int n){
        int k = -1;
        while(k < 0 || k >= n){
            System.out.println("Nhap k [ 0 < k < n]: ");
            k = sc.nextInt();

        }
        return k;
    }

 public int findLocation(int a[],int x){
        for(int i = 0; i < a.length - 1; i++){
            if(x == a[i]){
                
                return i;
            }
            
        }
        return -1;
    }
    
    public void outPut(int a[]){
        for(int out : a){
            if(out != 0){
                System.out.print(out + " ");
            }
        
        }
    }
    public void insert(int k, int n, int a[]){
        System.out.print("Nhap gia tri: ");
        int x = sc.nextInt();
        for(int i = n - 1; i >= k; i--) {
            a[i] = a[i - 1];
        }
        a[k - 1] = x;
        
        System.out.println(Arrays.toString(a));
    }

    public boolean contains(int a[], int x){
        for( int out : a){
            if(out == x){
                return true;
            }
        }
        return false;
    }

    public void clear(int a[]){
        Arrays.fill(a,0);
        int i = a.length - 1;
        for(int j = i; j > a.length - i; j--){
            a[j - 1] = a[j]; 

        }
        System.out.println("Clear!");
        System.out.print("Result: "); outPut(a);
        // System.out.println(Arrays.toString(a));
    }
    
    public int getValue(int a[], int k){
        return a[k - 1];
    }

    public int indexOf(int a[], int x){
       if (a[0] == x){
        return 1;
       }
       return -1;

    }

    public int lastIndexOf(int a[], int x){
        if(a[a.length - 2] == x){
            return 1;
        }
        return -1;

    }

    public int isEmty(int a[]){
        for(int out : a){
            if(out != 0){
                return 0;
            }
        }
        return 1;
    }

    public void remove(int a[], int n){
        System.out.println("the element which you want to remove");
        int x = sc.nextInt();
        int k = findLocation(a, x);
        
       for(int i = k; i < n - 1; i++){
            a[i] = a[i + 1];
        }
        System.out.print("Array is removed: ");
        for(int out : a){
            if(out != 0){
                System.out.print(out + " ");
            }
        }
    }
   
    public void replace(int a[], int n){
        
        System.out.print("the specified element that you want to remove at once: ");
        int x = sc.nextInt();
        int k = findLocation(a, x);
        if(k != -1){
            for(int i = k; i < n - 1; i++){
                a[i] = a[i + 1];
                
            }

        }if(k == -1){
            System.out.println("This value is not exist.");
        }
        System.out.print("Result: "); outPut(a);
    }

    public void set(int a[], int n){
        System.out.print("the specified element that you want to change: ");
        int x = sc.nextInt();
        int k = findLocation(a, x);
        System.out.print("change to: ");
        int j = sc.nextInt();
        // for(int i = n - 1; i > k; i--){
        //     a[i] = a[i-1];
        // }
        a[k] = j;
        System.out.println("Result: "); outPut(a);
    }

    public String toString(int a[]){
    
        int iMAx = a.length - 1;
        if(iMAx == -1){
            return "[]";
        }

        StringBuilder b = new StringBuilder();
        b.append('[');
        for(int i = 0; ; i++){
            b.append(a[i]);
            if(i == iMAx){
                return b.append(']').toString();
            }
            b.append(", ");
        }    
    }

    public void trimToSize(int a[]){
        ArrayList<Integer> newList = new ArrayList<>();
        newList.ca
    }
}
