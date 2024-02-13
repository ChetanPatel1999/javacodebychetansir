

abstract public  class Std {
    
    protected String name;
    protected int rno;
    
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
    abstract public void result(int per);
   
    
}