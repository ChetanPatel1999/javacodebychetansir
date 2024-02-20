
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("start main fcution________");
        int x,y,z=0;
       try
       {
        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);
        z=x/y;
       }
       catch(Exception e)
       {
           System.out.println("some thing wrong");
       }
        System.out.println("result = "+z);
        System.out.println("end main fuction_________");
        
    }
 
}
