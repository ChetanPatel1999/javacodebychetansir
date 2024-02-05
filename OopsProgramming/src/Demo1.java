
public class Demo1 {
    private int a,b;
    Demo1(int x,int y)
    {
        a=x;
        b=y;
    }
    void show()
    {
        System.out.println(this.a);
        System.out.println(this.b);
    }
    public static void main(String[] args) {
        Demo1 d1=new Demo1(22,33);
        Demo1 d2=new Demo1(56,78);
        d1.show();
        d2.show();
    }
}
