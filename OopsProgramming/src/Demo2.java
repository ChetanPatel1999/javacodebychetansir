
public class Demo2 {
    int a,b;
    static int p,q;
    void show()//non static method
    {
        System.out.println(a +","+b);
        System.out.println(p+","+q);
    }
    static void disp()//static method 
    {
        //System.out.println(a +","+b);//its show error
        System.out.println(p+","+q);
    }
    public static void main(String[] args) {
        Demo2 d1=new Demo2();
         Demo2 d2=new Demo2();
        d1.a=12;d1.b=67;
        d1.p=14;d1.q=89;
        d2.a=11;d2.b=677;
        d2.p=141;d2.q=894;
        d1.show();
        d2.show();
        Demo2.disp();
    }
}
