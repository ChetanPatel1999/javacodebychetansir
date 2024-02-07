
public class MedStd extends Std {
    private int prof;
    private String spec;
    public void setMedStdData(int prof,String spec)
    {
        this.prof=prof;
        this.spec=spec;
    }
    public void showMedStdData()
    {
        System.out.println("prof = "+prof);
        System.out.println("spec = "+spec);
    }
    
    public static void main(String[] args) {
        MedStd s1=new MedStd();
        s1.setStdData("chetan",1001);
        s1.setMedStdData(2, "artho");
        s1.showStdData();
        s1.showMedStdData();
        
    }
}
