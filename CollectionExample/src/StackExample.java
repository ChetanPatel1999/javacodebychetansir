
import java.util.Stack;


public class StackExample {
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push("indore");
        st.push("ujjain");
        st.push("rewa");
        st.add("dewase");
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.push("ratlam");
        System.out.println(st);
        st.pop();
        System.out.println(st);
    }
}
