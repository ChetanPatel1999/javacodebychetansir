
public class Operators {
 void airthmatic()
 {
     int a=5;
     int b=12;
     System.out.println("add = "+(a+b));
     System.out.println("sub = "+(a-b));
     System.out.println("mul = "+ (a*b));
     System.out.println("div = "+(a/b));
     System.out.println("modules = "+ (a%b));
             
 }
 void comparision()
 {
     int a=12;
     int b=8;
     System.out.println("less than = "+ (a<b));//false
     System.out.println("greater than  ="+(a>=b));//true
     System.out.println("less than equal to = "+ (a<=b));//false
     System.out.println("greater than equal to ="+(a>b));//true
     System.out.println("double equal = "+(a==b));//false
     System.out.println("not equal to = "+ (a!=b));//true
     
             
 }
 void increamentDecreament()
 {
     /*int a=12;
     a++;
     ++a;
     System.out.println("a =" + a);*/
     
    /* int a=12,b;
     b=++a;//pre increment frist incremnet value than assign in b
     System.out.println("a = "+a);
     System.out.println("b = "+b);*/
     int a=12,b;
     b=a++;//post increment  frist value assign in b than increment value
     System.out.println("a = "+a);
     System.out.println("b = "+b);
 }
 void assignmentOpera()
 {
     int a=12;
     int b=5;
    // b+=b;// b=b+b compound assign.
     //a*=b;
    // b%=a;
     a%=b;
     System.out.println("a = "+a);
     System.out.println("b = "+b);
 }
 void bitwise()
 {
     int a=7;
     int b=3,ans;
    // ans = a&b;
    //ans=a|b;
   // ans =a^b;
   //  ans=a<<b;
   // ans =a>>b;
   ans=~a;
     System.out.println("ans = "+ans);
     
 }
 void logical()
 {
     int a=89;
     int b=7;
     boolean ans;
     //ans= !(a<b);
     //ans= !((a<788) && (b<9) && (2<8));
     ans=(((a<78) || (b<9)) && (2<8));
     System.out.println("ans = "+ans);
 }
    public static void main(String[] args) {
        Operators obj=new Operators();
        //obj.airthmatic();
       // obj.comparision();
       //obj.increamentDecreament();
       //obj.assignmentOpera();
      // obj.bitwise();
      obj.logical();
    }
}


