
import java.util.Stack;


public class StackExample {
    public static void main(String[] args) {
        Stack <String>st=new Stack<>();
        st.push("indore");
        st.push("ujjain");
        st.push("dewase");
        System.out.println(st);
        System.out.println("__________________________________");
        Stack<Integer> st1=new Stack<>();
        st1.push(12);
        st1.push(56);
        st1.push(67);
        System.out.println(st1);
        System.out.println("__________________________________");
        Stack <Double>st2=new Stack<>();
        st2.push(34.56);
        st2.push(67.89);
        st2.push(3.67);
        System.out.println(st2);
        for (Double b:st2)
        {
            System.out.println(b);
        }
       
    }
}
