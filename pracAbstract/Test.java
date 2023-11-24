package pracAbstract;

public class Test {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("Toyota", "Japan");
        HangSanXuat h2 = new HangSanXuat("Suyuki", "Japan");
        HangSanXuat h3 = new HangSanXuat("Hyundai", "Korean");

        MayBay p1 = new MayBay("Gas", h1);
        PhuongTienDiChuyen p2 = new Oto("Gas", h2);

        System.out.println("lay hang san xuat");
        System.out.println("p1: "+h2.getTenHangSanXuat());

        System.out.println("Bat dau: ");
        p1.batDau();

        System.out.println("Lay van toc: ");
        System.out.println("p1" + p1.layVanToc());
        System.out.println("p2: "+ p2.layVanToc());
        
        System.out.println("May bay: ");
        p1.catCanh();
        System.out.println("Hang: "+ h2.getTenHangSanXuat());
        
    }
}
