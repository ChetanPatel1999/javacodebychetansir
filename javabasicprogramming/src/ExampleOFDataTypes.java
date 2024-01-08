
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
       // o1.showMethod();
        //o1.showSizeRange()
       // System.out.println(s);
       float var =12.34F;
       double d=45.67;
       long num1 = 78L;
      // float num2=78.90;// we cant assign double literals into float data type variable  
     //int num3=34.56; // we cant assign double literals into int data type variable 
     double d9=45;//implicit convertion  
     float d1=(float)45.89;// expicit convertion
       int num4=(int)89.8; // explicit convertion
       int na='A';//implicit convertion
     // int f="hi";//inconvertat type
     // int h=true;
       
    }
    
}
