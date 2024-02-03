
public class Recurtion {
    static int i;
   static void fun()
    {
        
        System.out.println("this is fun method");
        i++;
        if(i<5)
         {
            fun();
         }
    }
    public static void main(String[] args) {
        fun();
    }
}
