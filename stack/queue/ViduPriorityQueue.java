package stack.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class ViduPriorityQueue {
    public static void main(String[] args) {
        Queue <String> danhSach = new PriorityQueue<String>();
        danhSach.offer("xin");
        danhSach.offer("chao");
        danhSach.offer("toi la phuc 1");
        danhSach.offer("toi la phuc 2");

        while(true){
            String s = danhSach.poll();
            if(s == null){
                break;
            }
            System.out.println(s);
        }
        
    }
}
