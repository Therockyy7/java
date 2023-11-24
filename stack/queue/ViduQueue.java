package stack.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ViduQueue {
    public static void main(String[] args) {
        Queue <String> danhSachSV = new LinkedList<String>();
        danhSachSV.offer("Tran");
        danhSachSV.offer("nguyen");
        danhSachSV.offer("hoang");
        danhSachSV.offer("phuc");

        while(true){
            String ten = danhSachSV.poll();
            if(ten == null){
                break;
            }
            System.out.println(ten);
        }
    }
}
