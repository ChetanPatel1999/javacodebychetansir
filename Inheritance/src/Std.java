

public  class Std {
    
    protected String name;
    protected int rno;
    final protected int PASSING_MARKS=33;
    
    public Std(String name,int rno )
    {
        this.name=name;
        this.rno=rno;
    }
    public void showData()
    {
        System.out.println("name = "+name);
        System.out.println("rno = "+rno);
    }
    void result(int per)
    {
        if(per>PASSING_MARKS)
        {
     
            System.out.println("student pass");
         
        }
        else
        {
            System.out.println("student fail");
        }
    }
    
}