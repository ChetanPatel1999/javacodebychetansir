class Twotable extends Thread
{
    public void print2()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("2 * "+i+ " = "+ i*2);
        }
    }
    public void run()
    {
        print2();
    }
}
class Threetable extends Thread
{
    public void print3()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("3 * "+i+ " = "+ i*3);
        }
    }
     public void run()
    {
        print3();
    }
}
public class MTdemo {
    public static void main(String[] args) {
        Twotable ob1= new Twotable();
        Threetable ob2= new Threetable();
        //ob1.print();
        //ob2.print();
        ob1.start();
        ob2.start();
    }
}
