
public class LoopExampale {
    //for loop example
        
        void forLoop()
        {
            System.out.println("its for loop");
            for (int i=5 ;i<=10 ;i++ )
            {
                System.out.println("welcome to my home");
            }
          System.out.println("after for loop");
        }
        //wap to print 1 to 10 numbers
        void printNumber1_10()
        {
            for (int i=1;i<=10;i++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        //wap to print 100 to 1 numbers
        void printNumber100_1()
        {
            for (int i=100;i>=1;i--)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        //home work
        //wap to print "hello word" 10 times.
        //wap to print number between 50 to 100
        //wap to print numbers 78 to 34.
        //wap to print even numbers between 1 to 20.
        //wap to print odd numbers between 1 to 20.
        
        // while loop example
        void whileLoop()
        {
            int i=1;
            while(i<=10)
            {
                System.out.println("hi this is while");
                i++;
            }
            System.out.println("after while loop");
        }
        
        //wap to print 1 to 10 numbers.
        void while_1_To_10_NumberPrint()
        {
            int i=1;
            while(i<=10)
            {
                System.out.print(i+" ");
                i++;
            }
            System.out.println();
        }
        //wap to print even numbers 1 to 20
        void evenNumbers()
        {
            int i=1;
            System.out.print("Even number 1 to 20 : ");
            while(i<=20)
            {
                if(i%2==0)
                {
                    System.out.print(i+ " ");
                }
                i++;
            }
            System.out.println();
        }
        //wap to print odd numbers 1 to 20
        void oddNumbers()
        {
            int i=1;
            System.out.print("Odd number 1 to 20 : ");
            while(i<=20)
            {
                if(i%2==1)
                {
                    System.out.print(i+ " ");
                }
                i++;
            }
            System.out.println();
        }
        //do while loop example
        void doWhileExample()
        {
            int i=1;
            do
            {
                System.out.println("hi this is do while loop");
                i++;
            }
            while(i<=5);
            System.out.println("after do while loop");
        }
        // example of break statment
        void breakExample()
        {
            for(int i=1;i<=10;i++)
            {
               
                System.out.println(i); // 1 2 3 4 5
                 if(i==7)
                 {
                     break;
                 }
            }
            System.out.println("after for loop");
        }
        //while loop with break
        void breakExample2()
        {
            int i=5;
            while(i<=10)
            {
                if(i>7)
                {
                    
                    System.out.println(i);
                    System.out.println("hi i am break");
                    break;
                }
                i++;
            }
        }
        //continue in for and while
        //continue keyword continue only one iteration.
        void continueExaple()
        {
            for (int i=1;i<=10;i++)
            {
                  if(i%2==0)
                {
                    continue;
                } 
                System.out.println(i);
                
            }
            System.out.println("after for loop");
        }
    public static void main(String[] args) {
        LoopExampale obj=new LoopExampale();
        //obj.forLoop();
       // obj.printNumber100_1();
       // obj.printNumber1_10();
       //obj.whileLoop();
       //obj.while_1_To_10_NumberPrint();
       //obj.evenNumbers();
       // obj.oddNumbers();
       //obj.doWhileExample();
       //obj.breakExample();
       //obj.breakExample2();
       obj.continueExaple();
    }
    
}
