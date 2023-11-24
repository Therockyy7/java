package pracAbstract;

public class MayBay extends PhuongTienDiChuyen{
    private String loaiNhienLieu;
    public MayBay(String loaiNhienLieu, HangSanXuat hangSanXuat) {
        super("May Bay", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
        //TODO Auto-generated constructor stub
    }
    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }
    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }
    @Override
    public double layVanToc() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'layVanToc'");
        return 100;
    }

    public void catCanh(){
        System.out.println("Cat canh: ");
    }
    public void haCach(){
        System.out.println("Ha canh: ");
    } 
    
}
