
public class demo {
    static int[] calculate(int n)
    {
        int cube=n*n*n;
        int square=n*n;
        int arr[]={cube,square};
        return arr;
    }
    public static void main(String[] args) {
        int res[]=calculate(5);
        System.out.println("square= "+res[1]+"\ncube= "+res[0]);
      
    }
 
}
