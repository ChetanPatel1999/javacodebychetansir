
public class EngStd extends Std{
     private int sem;
    private String branch;
    public  EngStd(String name ,int rno ,int sem,String branch)
    {
        super(name,rno);
        this.sem=sem;
        this.branch=branch;
    }
    public void showData()
    {
        super.showData();
        System.out.println("sem = "+sem);
        System.out.println("branch = "+branch);
    }
    
    public static void main(String[] args) {
        EngStd s1=new EngStd("chetan" ,1001,2, "EC");
        s1.showData();
        s1.result(35);
        
    }
    
}
