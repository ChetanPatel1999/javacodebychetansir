
public class DemoString {
    int a,b;

    public DemoString(int a, int b) {
        this.a = a;
        this.b = b;
    }
     public DemoString(int a) {
        this.a = a;
        
    }
      public DemoString() {
       
    }
    void setdata(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void show()
   {
      System.out.println(a+","+b);
   }
   
    public static void main(String[] args) {
        DemoString o=new DemoString();
      
                
    }
    
}
