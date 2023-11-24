package QuanLySV;

import java.util.ArrayList;
import java.util.Collections;

public class DanhSachSV {
    private ArrayList<SInhVien> dssv;

    public DanhSachSV (){
        this.dssv = new ArrayList<SInhVien>();
    }

    public DanhSachSV(ArrayList<SInhVien> dssv) {
        this.dssv = dssv;
    }
 
    public void themSV(SInhVien SV){
        this.dssv.add(SV);
    }

    public void inDanhSach(){
        for (SInhVien sInhVien : dssv) {
            System.out.println(sInhVien);
        }
    }
    public boolean emty(){
        return this.dssv.isEmpty();
    }
    public int soLuongSV(){
        return this.dssv.size();
    }

    public void clearDS(){
         this.dssv.clear();
    }

    public boolean findSV(SInhVien sv){
        for(SInhVien out : dssv){
            if(sv.getMssv().equals(out.mssv)){
                return true;
            }
        }
        return false;
       
    }

    public String romveSV(SInhVien sv){
        for(SInhVien out : dssv){
            if(sv.mssv.equals(out.mssv)){
                dssv.remove(out);
                return "Đã xóa!";
            }
        }
        return "Nhập sai mssv!";
    }

    public void findNameSV(String nameSV){
        for(SInhVien out : dssv){
            if(out.getHoVaTen().indexOf(nameSV) >= 0){
                System.out.println(out);
            }
        }
    }

    public void xapXepThatToCao(){
        Collections.sort(dssv, (a,b) -> (int) (a.getDtb() - b.getDtb()));
        inDanhSach();
    }
}
