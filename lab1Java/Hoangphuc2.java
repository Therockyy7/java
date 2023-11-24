package lab1Java;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class Hoangphuc2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Nhap: ");
            int x = sc.nextInt();
            arrlist.add(x);
        }
        System.out.println("Xap xep: ");
        Collections.sort(arrlist);
        System.out.println(arrlist);
}
}
