
public class LablingOfLoops {
    
   //example of simple pattern
    void pattern()
    {
        P:   for (int i=1;i<5;i++)//outer for loop
        {
           
            q:  for(int j =1;j<5;j++) //inner for loop
            {
                 if (j==2)
                {
                   break q;
                }
                  System.out.print(j);
            }
            System.out.println();
        }
    }
    void pattren2()
    {
        int i=1;
        P:   while (i<5)//outer for loop
        {
           
            q:  for(int j =1;j<5;j++) //inner for loop
            {
                 if (j==2)
                {
                   break P;
                }
                  System.out.print(j);
            }
            i++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LablingOfLoops obj=new LablingOfLoops();
        //obj.pattern();
        obj.pattren2();
    }
}
