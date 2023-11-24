package buildCompareTo;

public class Test {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(15, "Trần nguyễn hoàng phúc", "SE180456", 9);
        SinhVien sv2 = new SinhVien(20, "Mai văn bình", "SE18023", 6);

        
        System.out.println(sv1.compareTo(sv2));
        System.out.println(sv1.getHoVaTen());
    }
}
