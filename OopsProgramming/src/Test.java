
public class Test {
   private  int x,y;
   Test(int a,int b)
   {
       x=a;
       y=b;
   }
   void show()
   {
       System.out.println(x+","+y);
   }
 
    public static void main(String[] args) {
     Test t1;
     Test t2=new Test(34,67);
     Test t3=t2; 
     t1=t2;
     t2.show();
     t3.show();
     t1.show();
     t3=new Test(12,13);
     t3.show();
    }
}
