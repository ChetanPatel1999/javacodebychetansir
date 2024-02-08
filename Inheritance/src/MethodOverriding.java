class A
{
    public void show()
    {
        System.out.println("class A");
    }

   
}
class B extends A
{
    // void show();
   public void show()// method override of class A
    {
        System.out.println("class B");
       
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        B ob=new B();
        ob.show();
    }
}
