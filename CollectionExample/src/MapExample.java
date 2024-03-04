import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class MapExample {
    public static void main(String[] args) {
        // if want to store subject name and marks.
        //ArrayList<String> sub=new ArrayList<>();
       // HashMap<String,Integer> sub= new HashMap<>();
       //LinkedHashMap<String,Integer> sub= new LinkedHashMap<>();
       TreeMap<String,Integer> sub= new TreeMap<>();
        sub.put("hindi",50);
        sub.put("english",70);
        sub.put("math",35);
        sub.put("science",67);
        System.out.println(sub);
        System.out.println(sub.get("hindi"));
    }
}
