package controlerGenaric;

public class Print<T> {
    T thingToString;
    public Print(){

    }
    public Print(T thingTP){
        this.thingToString = thingTP;
    }

    public void printST(){
        System.out.println(thingToString);
    }
    @Override
    public String toString() {
        return "Print [thingToString=" + thingToString + "]";
    }
    
}
