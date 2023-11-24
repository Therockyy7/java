package ke_thua.interfaceLearn;

public class Test {
    public static void main(String[] args) {
        
        MayTinhCasioFX500 mFx500 = new MayTinhCasioFX500();
        MayTinhVinacal500 mVC500 = new MayTinhVinacal500();
        
        System.out.println("5+3= "+ mFx500.cong(5,3));
        System.out.println("4*5= "+ mFx500.nhan(4,5));
        System.out.println("4 / 0= "+ mFx500.chia(4, 0));
        
    }
}
