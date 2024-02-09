class base{
   int data=12;
   public void  info()
   {
       System.out.println("BASE CLASS");
   }
}
class derived extends base{
    int data =67;
    public void info()
    {
        System.out.println("DERIVED CLASS");
    }
    public void show()
    {
        System.out.println("data = "+data);// 67 derived class data will be print
        System.out.println("data = "+super.data); // 12 access base class data using super
        info();
        super.info();
    }
}
public class SuperExample {
    public static void main(String[] args) {
        derived ob=new derived();
        ob.show();
    }
}
