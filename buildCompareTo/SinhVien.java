package buildCompareTo;

public class SinhVien implements Comparable<SinhVien>{
    private int maSinhVien;
    private String hoVaTen;
    private String tenLop;
    private double diemtrungBinh;
    public Object mssv;

    public SinhVien(int mssv, String name, String tenlop, double DTB){
        this.maSinhVien = mssv;
        this.hoVaTen = name;
        this.tenLop = tenlop;
        this.diemtrungBinh = DTB;

    }

    public double getDiemtrungBinh() {
        return diemtrungBinh;
    }
    public void setDiemtrungBinh(double diemtrungBinh) {
        this.diemtrungBinh = diemtrungBinh;
    }
    public String getHoVaTen() {
        return hoVaTen;
    }
    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }
    public int getMaSinhVien() {
        return maSinhVien;
    }
    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }
    public String getTenLop() {
        return tenLop;
    }
    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getTen(){
        String s = getHoVaTen();
        s.trim();
        if(s.indexOf(" ") >= 0){
            int x = s.lastIndexOf(" ");
            return s.substring(x + 1);
        }else {
            return s;
        }
    }
    
    @Override
    public int compareTo(SinhVien o) {
        // TODO Auto-generated method stub
        //return this.maSinhVien - o.maSinhVien;// xếp theo mssv
        String tenDuocSo = this.getTen();
        String tenSoSanh = o.getTen();
        return tenDuocSo.compareTo(tenSoSanh);// compare to này là của họ viết sẳn cho mình

    }

}
