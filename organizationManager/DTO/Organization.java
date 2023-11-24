package organizationManager.DTO;

public abstract class Organization {
    int size;
    protected Organization() {
    }
    
    protected Organization(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public abstract void communicateByTool();
  

    @Override
    public String toString() {
        return "The organization's size is"+ size;
    }
}
