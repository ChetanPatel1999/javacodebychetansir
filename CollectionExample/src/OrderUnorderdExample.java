
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;


public class OrderUnorderdExample {
    public static void main(String[] args) {
        ArrayList<String> cities=new ArrayList<>();
       // HashSet<String> cities=new HashSet<>();
      // TreeSet<String> cities=new TreeSet<>();
       // LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("indore");
        cities.add("dewas");
        cities.add("ujjain");
        cities.add("rewa");
        cities.add("ratlam");
        cities.add("ujjain");
        System.out.println(cities);
        // iterate list collection by for loop and get(int) method
        for(int i=0;i<cities.size();i++)
        {
            System.out.println(cities.get(i));
        }
        // iterete list collection by for each loop
        for(String s:cities)
        {
            System.out.println(s);
        }
        
                
                
    }
 
}
