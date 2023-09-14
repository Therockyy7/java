public class Quan_lySV {
    public static void main(String[] args) {
        day_Of_birth ngay1 = new day_Of_birth(1, 2, 2004);
        Lop lop1 = new Lop("12A", "Cong nghe may tinh");
        sinh_Vien sv1 = new sinh_Vien(0001,"Tran Nguyen Hoang Phuc",ngay1, 9, lop1 );

        System.out.println("ten khoa:");
        System.out.println("sv1: "+ sv1.lay_ten_khoa());

        

    }
}
