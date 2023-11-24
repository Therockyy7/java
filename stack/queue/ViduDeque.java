package stack.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ViduDeque {
    public static void main(String[] args) {
        Deque<String> danhSach = new ArrayDeque<String>();
        danhSach.offer("xin");
        danhSach.offer("chao");
        danhSach.offer("toi la phuc 1");
        danhSach.offer("toi la phuc 2");
        danhSach.offerFirst("haha");
        danhSach.offerLast("Cut cut");

       
            String t = danhSach.pollFirst();
            System.out.println(t);
        
            String m = danhSach.pollLast();
            System.out.println(m);

        // while(true){

        //     String t = danhSach.pollFirst();
        //     if(t == null){
        //         break;
        //     }
        //     System.out.println(t);
        // }

    }
}
