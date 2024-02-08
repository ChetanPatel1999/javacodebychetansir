
public class MedStd extends Std {
    private int prof;
    private String spec;
    public void setMedStdData(int prof,String spec)
    {
        this.prof=prof;
        this.spec=spec;
    }
    public String toString()
    {
        String s;
        s=spec;
        return s;
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
        MedStd s1=new MedStd();
        s1.setStdData("chetan",1001);
        s1.setMedStdData(2, "artho");
        s1.showStdData();
        System.out.println(s1.toString());
       
        
        
        
        
    }
}
