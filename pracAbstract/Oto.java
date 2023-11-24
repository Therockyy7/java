package pracAbstract;

public class Oto extends PhuongTienDiChuyen {
    // public Oto(String loai) {
    //     super(loai);
    //     //TODO Auto-generated constructor stub
    // }
    
        // PhuongTienDiChuyen pt = new Oto(loaiPhuongTien, null);

        
    
    private String loaiNhienLieu;

    public Oto(String loaiNhienLieu, HangSanXuat hangSanXuat){
        super("Oto", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }
    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }
    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }
    @Override
    public double layVanToc() {
        
        return 60;
    }
}
