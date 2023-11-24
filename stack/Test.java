package stack;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stackChuoi = new Stack();

        // stackChuoi.push("giatri") => đưa giá trị vào stack
		// stackChuoi.pop() => lấy giá trị ra, xóa khỏi stack
		// stackChuoi.peek() => lấy giá trị ra, nhưng không xóa khỏi stack
		// stackChuoi.clear(); => xóa tất cả phần tử trong stack
		// stackChuoi.contains("giatri")=> xác định giá trị có tồn tại trong stack hay không
		// stackChuoi.size() => độ lớn của stack

        System.out.println("Nhập vào 1 chuỗi: ");
        String l = sc.nextLine();
        for(int i = 0; i < l.length(); i++){
            stackChuoi.push(l.charAt(i)+"");
        }
        System.out.println("Chuỗi đã đổi ngược: ");
        for(int i = 0; i < l.length(); i++){
            System.out.print(stackChuoi.pop());
        }
        System.out.println();
        // Chuyển thập phân sang nhị phân
        Stack<Integer> transfer = new Stack<Integer>();
        System.out.println("Nhập số thập phân: ");
        int x = sc.nextInt();
        while(x > 0){
            int y = x%2;
            transfer.push(y);
            x = x/2;
        }
        System.out.println("Sau khi chuyển sang nhị phân: ");
        int n = transfer.size();
        for(int i = 0; i < n; i++){
            System.out.print(transfer.pop());
        }
    }
}
