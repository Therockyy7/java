package filemaneger.ghimotdoituongvaofile;

import java.io.Serializable;
import java.util.Objects;

import buildCompareTo.SinhVien;

public class SInhVien implements Comparable<SInhVien>, Serializable{
    String mssv;
    String hoVaTen;
    int namSinh;
    float dtb;

   

    
    public SInhVien(String mssv) {
        this.mssv = mssv;
    }

    public SInhVien(int namSinh, String hoVaTen, String mssv, float dtb) {
        this.namSinh = namSinh;
        this.hoVaTen = hoVaTen;
        this.mssv = mssv;
        this.dtb = dtb;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public String getMssv() {
        return mssv;
    }

    public float getDtb() {
        return dtb;
    }

    public void setSinhVien(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }

    @Override
    public String toString() {
        return "SInhVien [mssv=" + mssv + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh + ", dtb=" + dtb + "]";
    }

    @Override
    public int compareTo(SInhVien o) {
       return this.mssv.compareTo(o.mssv);
    }

    // @Override
    // public boolean equals(Object obj) {
    //     //Dòng code này kiểm tra xem hai đối tượng có tham chiếu đến cùng một đối tượng không. Nếu có, thì trả về true.
    //     if (this == obj){
    //         return true;
    //     }
    //     if (obj == null){
    //         return false;
    //     }
    //     //Dòng code này kiểm tra xem hai đối tượng có cùng kiểu hay không. Nếu không, thì trả về false.
    //     if (getClass() != obj.getClass()){
    //         return false;
    //     }
    //     //Dòng code này ép kiểu đối tượng thứ hai thành đối tượng SinhVien
    //     SinhVien other = (SinhVien) obj;
    //     //Dòng code này so sánh thuộc tính mssv của hai đối tượng. Nếu chúng bằng nhau, thì trả về true. Ngược lại, trả về false.
    //     return Objects.equals(this.mssv, other.mssv);
    // }
    
    
    
} 