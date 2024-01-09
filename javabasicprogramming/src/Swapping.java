
public class Swapping {
     void reverseNumber()
    {
        int a=345;
        int r,s,t,rev;
        r=a/100;
        s=(a/10)%10;
        t=a%10;
        rev=t*100+s*10+r;
        System.out.println("rev number of given number = "+rev);
    }
    void sumOfIndividualDigit()
    {
        int a=765;
        int r,s,t,sum;
        r=a/100;
        s=(a/10)%10;
        t=a%10;
        sum=r+s+t;
        System.out.println("sum of individual digit is = "+sum);
    }
    
   void swapTwoValueUsingThirdVarible()
    {
        // wap to swap two values using third variable .
        int a=12;
        int b=5;
        System.out.println("value print before swapping :-");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("value print after swapping :-");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
    }
    void swapTwoValueWithoutUsingThirdVarible()
    {
        // wap to swap two values withgout using third variable .
        int a=122;
        int b=55;
        System.out.println("value print before swapping :-");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value print after swapping :-");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
    }
    
    public static void main(String[] args) {
        Swapping o1= new Swapping();       
       // o1.swapTwoValueUsingThirdVarible();
       //o1.swapTwoValueWithoutUsingThirdVarible();
      // o1.sumOfIndividualDigit();
      o1.reverseNumber();
        
    }
}
