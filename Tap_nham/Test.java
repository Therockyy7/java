import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
      
    
        void foo(int i) {
            System.out.println("int version");
        }
    
        void foo(String s) {
            System.out.println("String version");
        }
    
        public static void main(String args[]) {
            Test t = new Test();
            char ch = 'p';
            t.foo(ch);
        }
    
    
}