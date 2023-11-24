package dateTime;

import java.sql.Date;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        //Hàm lấy thời gian hiện tại theo milisecon
        long t1 = System.currentTimeMillis();
        for(int i = 0; i < 10; i++){
            System.out.println("tets");
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Trước khi chạy: "+ t1);
        System.out.println("Sau khi chạy: "+ t2);
        System.out.println("Thời gian: "+ (t2-t1)+ "msl");
        //hàm chuyển đổi ngày giờ giây phút
        System.out.println("1 day: "+ TimeUnit.DAYS.toHours(1) + "h");
        //date: Tạo một đối tượng Date mô tả thời gian hiện tại.
        //Nhưng nó cũng lỗi thời rồi
        Date d = new Date(System.currentTimeMillis());
        System.out.println(d.getDate()+ "-"+ (d.getMonth() + 1)+ "-"+ (d.getYear() + 1900));
        //calendar
        Calendar lc = Calendar.getInstance();
        System.out.println(lc.get(Calendar.DATE) + "-" + (lc.get(Calendar.MONTH) + 1) + "-" + lc.get(Calendar.YEAR));

        lc.add(Calendar.DATE, 1);
        System.out.println(lc.get(Calendar.DATE) + "-" + (lc.get(Calendar.MONTH) + 1) + "-" + lc.get(Calendar.YEAR));

    }
}
