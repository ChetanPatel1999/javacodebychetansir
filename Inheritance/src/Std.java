

public class Std {
    
    protected String name;
    protected int rno;
    
    public void setStdData(String name,int rno )
    {
        this.name=name;
        this.rno=rno;
    }
    public void showStdData()
    {
        System.out.println("name = "+name);
        System.out.println("rno = "+rno);
    }
    
}