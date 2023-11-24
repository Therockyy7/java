package chuoiThanhMang;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = "xin chào, tôi là Trần Nguyễn Hoàng Phúc, nice to meet you";
        String [] a = s.split(" ");
        System.out.println(Arrays.toString(a)); 
        System.out.println(a[a.length-1]);
        System.out.println(s.charAt(35));
        // System.out.println(s.);
        String s2 = "Xin chao, toi la phuc, toi den tu da nang, hom nay. rat vui!";
        String[] b = s2.split("\\,|\\.");
        System.out.println(Arrays.toString(b));
    }
}