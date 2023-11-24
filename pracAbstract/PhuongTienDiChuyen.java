package pracAbstract;

public abstract class  PhuongTienDiChuyen {
    protected String loaiPhuongTien;
    protected HangSanXuat hangSanXuat;
    public PhuongTienDiChuyen(String loai, HangSanXuat hangSanXuat){
        this.loaiPhuongTien = loai;
        this.hangSanXuat = hangSanXuat;
    }

    public String getLoaiPhuongTien() {
        return loaiPhuongTien;
    }
    public void setLoaiPhuongTien(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }
    
    public String layTenHangSanXuat(){
        return this.hangSanXuat.getTenHangSanXuat();
    }
    public void batDau(){
        System.out.println("Bat dau: ");
    }
    public void tangToc(){
        System.out.println("Tang toc: ");
    }
    public void dungLai(){
        System.out.println("Dung lai: ");
    }

    protected abstract double layVanToc();

    public void tess(){
        System.out.println("SAAAAAAA");
    }
}

