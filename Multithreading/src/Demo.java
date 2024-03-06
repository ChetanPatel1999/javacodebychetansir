
import java.util.Scanner;


public class Demo extends Thread{
    public void show()
    {
        String s=getName();
           System.out.println(s+"statement = 1");
           System.out.println(s+"statement = 2");
           if(s.equals("bb"))
           {
              Scanner sc=new Scanner(System.in);
              int a;
              a=sc.nextInt(); 
           }
           System.out.println(s+"statement = 3");
           System.out.println(s+"statement = 4");
    }
    public void run()
    {
        show();
    }
    public static void main(String[] args) {
        Demo t1=new Demo();t1.setName("aa");
         Demo t2=new Demo();t2.setName("bb");
          Demo t3=new Demo();t3.setName("cc");
           Demo t4=new Demo();t4.setName("dd");
           t4.setPriority(10);
           t1.start();
           t2.start();
           t3.start();
           t4.start();
        
    }
}
