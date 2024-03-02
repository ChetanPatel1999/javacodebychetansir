
public class demo1 {
   void show(Object a)
   {
       System.out.println(a);
   }
    public static void main(String[] args) {
        demo1 o1=new demo1();
        o1.show(12);
        demo1 o2=new demo1();
        o2.show(34.78);
        demo1 o3=new demo1();
        o3.show("chetan");
    }
}
