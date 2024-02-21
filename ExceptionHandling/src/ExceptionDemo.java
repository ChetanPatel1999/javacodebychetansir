
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("start main fcution________");
        int x=0,y=0,z=0;
       try
       {
        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);
        z=x/y;
       }
       catch(ArrayIndexOutOfBoundsException | NumberFormatException e )
       {
           System.out.println("error ocured");
       }
       catch(ArithmeticException e)
       {
          // System.out.println("division by zero error");
           z=x/2;
       }
       catch(Exception e)
       {
           System.out.println("some thing wrong");
       }
       finally
       {
           System.out.println("this is always run");
       }
        System.out.println("result = "+z);
        System.out.println("end main fuction_________");
        
    }
 
}
