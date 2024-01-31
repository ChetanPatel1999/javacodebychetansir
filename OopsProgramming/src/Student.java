
public class Student {
  private int rno;
  private String name; 
  private int per;
  private static int totalpass;
  private static int totalfail;
  
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
          totalpass++;
      }
      else
      {
          System.out.println("Student fail");
          totalfail++;
      }
      System.out.println("_______________________________________");
  }
  public static void showOverallresult()
  {
      System.out.println("=================================");
      System.out.println("totalpass student = "+totalpass);
      System.out.println("totalfail student = "+totalfail);
         
  }
  public static void showGread(Student obj)
  {
      if(obj.per>80)
      {
          System.out.println("gread = A");
      }
      else if(obj.per>60)
      {
          System.out.println("Gread = B");
      }
      else
      {
          System.out.println("Gread = C");
      }
  }
  public static void great()
  {
      System.out.println("thanks for using my student class");
  }
  
  public static void showAvrage(Student obj1,Student obj2)
  {
      System.out.println("avrage marks of "+obj1.rno+","+obj2.rno+" = "+((obj1.per+obj2.per)/2)); 
  }
}
