
public class MedStd extends Std {
    private int prof;
    private String spec;
    public MedStd(String name ,int rno,int prof,String spec)
    {
        super(name,rno);
        this.prof=prof;
        this.spec=spec;
    }
    public void showData()
    {
        super.showData();
        System.out.println("prof = "+prof);
        System.out.println("spec = "+spec);
    }
    void result(int per)
    {
        if(per>40)
        {
            System.out.println("student pass");
         
        }
        else
        {
            System.out.println("student fail");
        }
    }
    
    public static void main(String[] args) {
        MedStd s1=new MedStd("aman",1002,2, "artho");
        s1.showData();
        
       
        
        
        
        
    }
}
