
import java.util.LinkedList;


public class LinkedListExamnple {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add("indore");
        list.add("ujjain");
        list.add("mhow");
        list.add("rewa");
        System.out.println(list);
        list.addFirst("dewase");
        System.out.println(list);
        list.addLast("satna");
        System.out.println(list);
        list.add(2,"rau");
        System.out.println(list);
        list.remove(1);
        list.remove(4);
        System.out.println(list);
    }
}
