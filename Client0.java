//
// Client to test CLString class operations
//
import java.util.*;

public class Client0 {
    public static void main(String[] args) {
        String st1 = "howdy ";
        String st2 = "there! ";
        System.out.println("Java Strings: " + "st1: " + st1 + "st2: " + st2);
        
        CLString c1 = new CLString(st1);
        CLString c2 = new CLString(st2);
        
        System.out.println("c1.length(): " + c1.length());
        System.out.println("c1.toString(): " + c1.toString());
        System.out.println("c2.toString(): " + c2.toString());
        System.out.println("(c1.concat(c2)).length(): " + c1.concat(c2).length());        
        System.out.println("(c1.concat(c2)).toString(): " + c1.concat(c2).toString());        
    }
}
        