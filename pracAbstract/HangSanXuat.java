package pracAbstract;

public class HangSanXuat {
    String tenHangSanXuat;
    String tenQuocGia;
    public HangSanXuat(String teHangSanXuat, String tenQuocGia){
        this.tenHangSanXuat = teHangSanXuat;
        this.tenQuocGia = tenQuocGia;
    }
    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }
    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }
    public String getTenQuocGia() {
        return tenQuocGia;
    }
    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }
}
