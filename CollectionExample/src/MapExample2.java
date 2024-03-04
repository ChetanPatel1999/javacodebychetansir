 import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class MapExample2 {
    public static void main(String[] args) {
        // if want to store number and their factorial value
        HashMap<Integer,Integer> sub= new HashMap<>();
       //LinkedHashMap<Integer,Integer> sub= new LinkedHashMap<>();
       //TreeMap<Integer,Integer> sub= new TreeMap<>();
        sub.put(4,24);
        sub.put(3,6);
        sub.put(6,720);
        sub.put(5,120);
        sub.put(2,2);
        sub.put(1,1);
        System.out.println(sub);
    }
  
}
