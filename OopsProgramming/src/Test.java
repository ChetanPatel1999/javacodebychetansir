
public class Test {
   private  int a,b,c;
   Test(){}
   Test(int x)
   {
       a=x;
   }
   Test(int x,int y)
  {
      this(x);//this call one arg constructer
      b=y; 
  }
   Test(int x,int y,int z)
  {
      this(x,y);// this call two arg constructor
      c=z;
  }
  void showdata()
  {
     
      System.out.println(a+","+b+","+c);
  }
    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test(45,78);
        Test t3=new Test(1,2,3);
        t1.showdata();
        t2.showdata();
        t3.showdata();
              
        
        
      
    }
}
