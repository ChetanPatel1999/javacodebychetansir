
public class Test {
   private  int a,b;
   Test (){}
  Test(int x,int y)
  {
      a=x;
      b=y;           
  }
  void setdata(int x,int y)
  {
      a=x;
      b=y;
  }
  void showdata()
  {
      System.out.println(a+","+b);
  }
    public static void main(String[] args) {
        Test t1=new Test(12,45);
        Test t2 =new Test();
        t1.showdata();
        t1.setdata(66,33);
        t1.showdata();
        t1.setdata(1,2);
        t1.showdata();
        t2.setdata(34, 89);
        t2.showdata();
        
      
    }
}
