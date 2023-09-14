

public class sinh_Vien {
    int mssv;
    String name_Sv;
    day_Of_birth ngay_Sinh;
    double diemTB;
    Lop lop;
     
    public sinh_Vien(int mssv, String name_Sv, day_Of_birth ngay_Sinh, double diemTB, Lop lop){
        this.mssv = mssv;
        this.name_Sv = name_Sv;
        this.ngay_Sinh = ngay_Sinh;
        this.diemTB = diemTB;
        this.lop = lop;
    }

    public int getMssv(){
        return this.mssv;
    }
    public void setMssv(int MS){
        this.mssv = MS;
    }

    public String getName_Sv(){
        return this.name_Sv;
    }
    public void setName_Sv(String name){
        this.name_Sv = name;
    }
    public day_Of_birth getNgay_Sinh(){
        return this.ngay_Sinh;
    }
    public void setNgay_Sinh(day_Of_birth ngay_snh){
        this.ngay_Sinh = ngay_snh;
    }
    public double getDiemTB(){
        return this.diemTB;
    }
    public void setDiemTB(double diem){
        this.diemTB = diem;
    }
    public Lop getLop(){
        return this.lop;
    }
    public void setLop(Lop lp){
        this.lop = lp;
    }

    public String lay_ten_khoa(){
        return this.lop.name_Cousre;
    }
    }

