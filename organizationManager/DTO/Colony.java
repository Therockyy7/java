package organizationManager.DTO;

public class Colony extends Organization{
    protected String place;
    
    public Colony() {
    }

    public Colony(int size, String place) {
        super(size);
        this.place = place;
    }

    public void grow(){
        System.out.println("an annual cycle of growth that begins in spring");
    }

    public void reproduce(){
        System.out.println("Colony can reproduce itself through a process");
    }
    @Override
    public void communicateByTool() {
        System.out.println("the colony communicate by sound");
    }

    @Override
    public String toString() {
        return "the colony size is" + size +", the cology's place is"+ place;
    }
    
}
