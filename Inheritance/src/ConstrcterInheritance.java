class parent{
    parent()
    {
        System.out.println("p - 0"); 
    }
    parent(int a)
    {
        System.out.println("p - 1");
    }
    parent(int a,int b)
    {
        System.out.println("p - 2");
    }
}
class child extends parent{
    child()
    {
        super(34);
        System.out.println("c - 0");
    }
    child(int a)
    {
        super(12,45);
        System.out.println("c - 1");
    }
      child(int a,int b)
    {
        super(34,56);
        System.out.println("c - 2");
    }
        child(int a,int b,int c)
    {
        this(12,34);
        System.out.println("c - 3");
    }
}

public class ConstrcterInheritance {
    public static void main(String[] args) {
        child ob=new child(1,2,4);
    }
}
