package organizationManager.DTO;

public class University extends Organization{
    protected String name;
    
    public University() {
    }

    public University(int size, String name) {
        super(size);
        this.name = name;
    }
    public void enroll(){
        System.out.println("The registration for enrollment is only valid when the University has received all enrollment documents and enrollment fees");
    }
    public void educate(){
        System.out.println("Provide education at university standard");
    }
    @Override
    public void communicateByTool() {
        System.out.println("In the university, people communicate by voice.");
    }

    @Override
    public String toString() {
        return "encourage the advancement and development of knowledge";
    }
    
}
