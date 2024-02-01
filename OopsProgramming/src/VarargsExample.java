
public class VarargsExample {
    static void  add(int... var)
    {
        int sum=0;
        for(int i:var)
        {
         sum=sum+i;
        }
         System.out.println("sum = "+sum);
    }
    /*
    static void  add(double... var )
    {
        double sum=0;
        for(double i:var)
        {
         sum=sum+i;
        }
         System.out.println("sum = "+sum);
    }*/
     static void  add(String... var )
    {
        String sum="";
        for(String i:var)
        {
         sum=sum+i;
        }
         System.out.println("sum = "+sum);
    }
    public static void main(String[] args) {
        add(12,5,7);
        
        
        
    }
}
