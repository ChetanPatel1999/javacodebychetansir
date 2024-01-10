
public class ExampleOfSelectionStetement {
    // if / if else/ if else if / switch case
    
    //wap to check voter is eligible to cast vote or not.(age >=18 )
    void chckeVoterEligiblity()
    {
        int age=16;// 10 23 45 16
        if (age>=18)
        {
            System.out.println("yor are eligible for cast vote");
        }
        else
        {
            System.out.println("you are not eligible for casting vote");
        }
        
    }
    //wap to check given two numbers are equal or not.
    void checkNumbers()
    {
        int num1=78;
        int num2=7;
        if (num1==num2)
        {
            System.out.println("both numbers are same");
        }
        else
        {
            System.out.println("both numbers are different");
        }
    }
    //wap to find greatest number between two numbers.
    void findGreatest()
    {
        int num1 =3444;
        int num2 = 899;
        if(num1>num2)
        {
            System.out.println("greatest num = "+num1);
        }
        else
        {
            System.out.println("greatest num = "+num2);
        }
    }
    
    // wap to check given number is positive or negetive or zero
    
    void checkPositiveNegetive()
    {
        int num=-789;
        if(num>0)
        {
            System.out.println("num is positive");
        }
        else if(num<0)
        {
            System.out.println("num is negetive");
        }
        else                // else not contain condition
        {
            System.out.println("num is zero"); 
        }
    }
    // wap to print days name according two numbers.
    void printDayName()
    {
        int day=7;
        
        if(day==1)
        {
            System.out.println("monday");
        }
        else if (day==2)
        {
            System.out.println("tuesday");
        }
        else if (day==3)
        {
            System.out.println("wednesday");
        }
        else if (day==4)
        {
            System.out.println("thursday");
        }
        else if (day==5)
        {
            System.out.println("Friday");
        }
        else if (day==6)
        {
            System.out.println("saturday");
        }
        else if (day==7)
        {
            System.out.println("sunday");
        }
        else
        {
            System.out.println("please enter corract number");
        }
    }
    public static void main(String[] args) {
        ExampleOfSelectionStetement obj = new ExampleOfSelectionStetement();
        //obj.chckeVoterEligiblity();
        //obj.checkNumbers();
       // obj.findGreatest();
       //obj.checkPositiveNegetive();
       obj.printDayName();
    }
    
}
