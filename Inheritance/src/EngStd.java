
public class EngStd extends Std{
     private int sem;
    private String branch;
    public void setEngStdData(int sem,String branch)
    {
        this.sem=sem;
        this.branch=branch;
    }
    public void showEngStdData()
    {
        System.out.println("sem = "+sem);
        System.out.println("branch = "+branch);
    }
    
    public static void main(String[] args) {
        EngStd s1=new EngStd();
        s1.setStdData("aman",1002);
        s1.setEngStdData(2, "EC");
        s1.showStdData();
        s1.showEngStdData();
         s1.result(35);
        
    }
    
}
