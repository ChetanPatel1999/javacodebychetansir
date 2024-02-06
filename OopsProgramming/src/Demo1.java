
public class Demo1 {
    private int a,b;
    Demo1(int a,int b)
    {
       this.a=a;
        this.b=b;
    }
    boolean equals(Demo1 temp)
    {
        if(a==temp.a && b==temp.b)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void show()
    {
      
        System.out.println(this.a);
        System.out.println(this.b);
    }
    public static void main(String[] args) {
        Demo1 d1=new Demo1(22,33);
        Demo1 d2=new Demo1(22,33);
        Demo1 d3= new Demo1(12,33);
        boolean b=d1.equals(d2);
        boolean b1=d1.equals(d3);
        String s1= new String("indore");
        String s2= new String("indore");
        String s3=new String("ujjain");
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        
        
    }
}
