package organizationManager.GUI;

import javax.management.relation.Role;

import organizationManager.DTO.BeeCology;
import organizationManager.DTO.Colony;
import organizationManager.DTO.FPTUniversity;
import organizationManager.DTO.University;

public class Tester {
    public static void main(String[] args) {
        Colony obj1 = new BeeCology(2000, "honey", "land");
        System.out.println(obj1);
        obj1.grow();
        obj1.reproduce();

        University obj2 = new FPTUniversity(100000, "FPT", "Cantho");
        System.out.println(obj2);
        obj2.enroll();
        obj2.educate();

        BeeCology df = new BeeCology(3000, "wasp", "land");
        System.out.println(df);
        df.createWorker();
        

        FPTUniversity df2 = new FPTUniversity(100000, "FPT", "Hanoi");
        System.out.println(df2);
        df2.createWorker();
    }
}
