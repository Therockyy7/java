public class id_idol {
    String name;
    int age;
    double tall,weight;

    public void Gioi_thieu_ten()
    {
        System.out.println("Xin chao toi ten la: "+ name);
    }

    public String du_tuoi(){
        String ans;
        if(age >= 18){
            ans = "du tuoi coi stream";
        }else{
            ans = "khong du tuoi coi stream";
        }
        return ans;
    }
}
