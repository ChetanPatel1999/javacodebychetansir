
public class Student {
  private int rno;
  private String name; 
  private int per;
  
  public void setdata(int a,String b,int c)
  {
     rno=a;
     name=b;
     per=c;
  }
  public void reportcard()
  {
      System.out.println("Reportcard of student.......");
      System.out.println("roll number : "+rno);
      System.out.println("name of student : "+name);
      System.out.println("percentage of student : "+per);
      if(per>33)
      {
          System.out.println("Student pass");
      }
      else
      {
          System.out.println("Student fail");
      }
      System.out.println("_______________________________________");
  }
  
  
}
