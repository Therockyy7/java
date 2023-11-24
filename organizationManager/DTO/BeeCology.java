package organizationManager.DTO;

public class BeeCology extends Colony implements Role {
    protected String type;
    

    public BeeCology() {
    }

    public BeeCology(int size, String place, String type) {
        super(size, place);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void createWorker() {
        System.out.println("Worker bees perform all the work of the bees");
    }

    @Override
    public String toString() {
        return "The cology's type is "+ type+ ", size is about" + size +", and the place is" + place;
    }

    
    
}
