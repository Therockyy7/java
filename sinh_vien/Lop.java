


public class Lop {
    String name_Of_class;
    String name_Cousre;
    public Lop(String name_Of_class, String name_Cousre){
        this.name_Cousre = name_Cousre;
        this.name_Of_class = name_Of_class;
    }
    public String getLop(){
        return this.name_Of_class;
    }
    public void setLop(String ten_Lop){
        this.name_Of_class = ten_Lop;
    }
    public String getKhoa(){
        return this.name_Cousre;
    }
    public void setKhoa(String ten_Khoa){
        this.name_Cousre = ten_Khoa;
    }
}
