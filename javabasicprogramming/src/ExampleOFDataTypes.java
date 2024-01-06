
public class ExampleOFDataTypes {
    
    boolean b; // intance varible or no static var.
    static Byte f; // class varible or static var.
    static String s;
    Byte b1;
    void showSizeRange()
    {
        System.out.println(Byte.SIZE);// its return size in bit of data type
        System.out.println(Short.SIZE);
        System.out.println(Byte.MAX_VALUE); // its return max range which can store byte
        System.out.println(Byte.MIN_VALUE); // its return min range which can store byte
    }
    
     void showMethod ()
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
     
        System.out.println("sum of "+I+" and "+J+ " = "+sum);
         System.out.println(b1);
    }
    public static void main(String[] args) {
       ExampleOFDataTypes o1=new ExampleOFDataTypes();// create object of ExampleOfDataType class
        o1.showMethod();
        //o1.showSizeRange()
        
        System.out.println(s);
       
        
      
       
    }
    
}
