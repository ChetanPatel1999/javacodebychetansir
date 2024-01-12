
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
    
    //wap to print day name according to number.
    void SwitchCase()
    {
        int num=1;
        switch(num)
        {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;    
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("plese eneter corract number");
        }
            
        }
        //wap to print state name acording to given short name.
        void switchCase1()
        {
            String s="up";
            switch(s)
            {
                case "mp":
                    System.out.println("madhyapradesh");
                    break;
                case "up":
                    System.out.println("uttarpradesh");
                    break;
                default:
                    System.out.println("please enter correct short name of state");
            }
        }
        //wap to make calculater.
        void switchCase2()
        {
            System.out.println("press + for addition :-");
            System.out.println("press - for sub :-");
            System.out.println("press * for mul :-");
            System.out.println("press / for div :-");
            char ch='+';
            switch (ch)
            {
                case '+':
                    
                   //addition
                case '-':
                    //sutraction
                case '*':
                    //multiplication
            }
        }
        
        
        
    public static void main(String[] args) {
        ExampleOfSelectionStetement obj = new ExampleOfSelectionStetement();
        //obj.chckeVoterEligiblity();
        //obj.checkNumbers();
       // obj.findGreatest();
       //obj.checkPositiveNegetive();
       //obj.printDayName();
       //obj.SwitchCase();
      // obj.switchCase1();
      
    }
    
}
