
public class Demo {
  int a,b; //non static variable (instance variable)
  
  static int p,q;  // class variable
  
    public static void main(String[] args) {
        Demo d1=new Demo();
        Demo d2=new Demo();
        Demo d3=new Demo();
        d1.a=10;d1.b=20;
        d2.a=11;d2.b=22;
        d3.a=33;d3.b=44;
        
        d1.p=100;d1.q=111;
        d2.p=200;d2.q=222;
        d3.p=300;d3.q=333;
        
        System.out.println(d1.a+","+d1.b);
        System.out.println(d2.a+","+d2.b);
        System.out.println(d3.a+","+d3.b);
                
        System.out.println(d1.p+","+d1.q);
        System.out.println(d2.p+","+d2.q);
        System.out.println(d3.p+","+d3.q);
        
    }
  
}
