
import java.util.Scanner;
public class throwExample {
    public static void main(String[] args) {
        int price,quantity,totalbill;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter price : ");
        price=sc.nextInt();
        try
        {
            if(price<0)
            {
              InvalidPriceException ob=new InvalidPriceException();
                throw ob;
            }
            System.out.println("perfect run try block");
        }
        catch(InvalidPriceException e)
        {
            System.out.println("price is negetive");
            System.out.println("we taken minimum price 100");
            price=100;
        }
        System.out.print("enter Quantity : ");
        quantity=sc.nextInt();
        totalbill=quantity*price;
        System.out.println("total bill = "+ totalbill);
    }
}
