
public class ExampleOFDataTypes {
    
    static boolean n;
    
     void show ()
    {
        byte a=15;
        int I=14,J=9,sum;
        float f=45.67F;
        double d=89.56;
        boolean bool=false;
        char ch='r';
        
        sum=I+J;
        System.out.println("value of a = "+a);
        System.out.println("value of I = "+I);
        System.out.println("value of bool = "+bool);
        System.out.println("value of ch = "+ch);
        System.out.println("value of n = "+n);
        System.out.println("sum of "+I+" and "+J+ " = "+sum);
    }
    public static void main(String[] args) {
        ExampleOFDataTypes o1=new ExampleOFDataTypes();// create object of ExampleOfDataType class
       o1.show();
      
       
    }
    
}
