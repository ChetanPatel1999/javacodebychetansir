
import java.util.Scanner;

public class UserInput {
    void intValue()
    {
        int a,b,ans;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter frist value : ");
        a=sc.nextInt();// nextInt method is used to take integer value from keybord
        System.out.print("enter second value : ");
        b=sc.nextInt();
        ans=a+b;
        System.out.println("sum = "+ ans);
    }
    void floatValue()
    {
        float a,b,ans;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter frist value : ");
        a=sc.nextFloat();// nextFloat method is used to take float value from keybord
        System.out.print("enter second value : ");
        b=sc.nextFloat();
        ans=a+b;
        System.out.println("sum = "+ ans); 
    }
    void demo()
    {
        Scanner sc=new Scanner(System.in);
        byte b;
        b=sc.nextByte();
        System.out.println("b = "+b);
        
        boolean bool;
        bool=sc.nextBoolean();
        System.out.println("bool = "+bool);
    }
    void stringValue()
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.print("Enter a string value : ");
       // s=sc.next();// it used to take string from user or keybord only one word
        s=sc.nextLine(); //it is take sentance from user
        System.out.println("s = "+s);
    }
    void charValue()
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.print("Enter a char : ");
        ch=sc.next().charAt(0);
        System.out.println("ch = "+ ch);
    }
    public static void main(String[] args) {
        
        //UserInput ob=new UserInput();
        //ob.intValue();
        //ob.floatValue();
        //ob.demo();
       // ob.stringValue();
       // ob.charValue();
        Scanner sc=new Scanner(System.in);
        boolean b;
       // b=sc.hasNextInt();// we can check data type 
       //b=sc.hasNextByte();
       // b=sc.hasNext();
       b=sc.hasNextFloat();
        System.out.println("b= "+ b);
       
        
    }
 
}
