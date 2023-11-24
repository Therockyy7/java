package controlerGenaric;

import java.util.ArrayList;
import java.util.List;

public class ThingToString {
    public static void printList(List<?> myList){
        System.out.println(myList);
    }
    public static void main(String[] args) {

        Print<Integer> ip = new Print<Integer>(5);
        ip.printST();
        Print<String> sp = new Print<String>("Hello");
        ip.printST();
        List<String> listName = new ArrayList<>();
        listName.add("Tuấn ngáo");
        listName.add("huy ngáo");
        listName.add("linh ngáo");
        listName.add("hoang ngáo");
        listName.add("Tphuc ngáo");

    }
}
