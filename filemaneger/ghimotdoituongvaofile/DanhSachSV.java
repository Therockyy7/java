package filemaneger.ghimotdoituongvaofile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
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
        /*
         * Trong mã ASCII, các ký tự được biểu diễn bằng các số nguyên. Khi sử dụng phép trừ  a - b  trong biểu thức lambda, nó tương đương với việc lấy giá trị mã ASCII của ký tự  a  trừ đi giá trị mã ASCII của ký tự  b .
         *  Khi kết quả là một số âm, nghĩa là giá trị mã ASCII của  a  nhỏ hơn giá trị mã ASCII của  b , và khi kết quả là một số dương, nghĩa là giá trị mã ASCII của  a  lớn hơn giá trị mã ASCII của  b . 
 
            Vì vậy,     khi sử dụng  a - b  trong phương thức sort(), nó sẽ sắp xếp danh sách từ thấp lên cao, vì giá trị mã ASCII của  a  nhỏ hơn giá trị mã ASCII của  b .
            Để sắp xếp từ cao xuống thấp, chúng ta phải đổi vị trí  a  và  b  thành  b  và  a , như là  b - a , để kết quả trả về là một số âm khi giá trị mã ASCII của  b  lớn hơn giá trị mã ASCII của  a .
         */
        Collections.sort(dssv, (a, b) -> (int) (a.getDtb() - b.getDtb()));
        inDanhSach();
    }

    public void ghiDulieuXuongFile(File file){
            OutputStream os;
            try {
                os = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(os);
                
                for(SInhVien sInhVien : dssv){
                    oos.writeObject(sInhVien);
                }

                oos.flush();
                oos.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch(IOException a){
                a.printStackTrace();
            }
            
    }
}
