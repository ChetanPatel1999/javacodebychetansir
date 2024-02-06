
public class Student {
  private int rno;
  private String name; 
  private int per;
  private static int totalpass;
  private static int totalfail;

    public Student(int rno, String name, int per) {
        this.rno = rno;
        this.name = name;
        this.per = per;
    }

    public Student(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }

    public Student(int rno) {
        this.rno = rno;
    }

    public Student() {
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
  /*
  public static void showAvrage(Student obj1,Student obj2)
  {
      System.out.println("avrage marks of "+obj1.rno+","+obj2.rno+" = "+((obj1.per+obj2.per)/2)); 
  }
   public static void showAvrage(Student obj1,Student obj2,Student obj3)
  {
      System.out.println("avrage marks of "+obj1.rno+","+obj2.rno+","+obj3.rno+" = "+((obj1.per+obj2.per+obj3.per)/3)); 
  }
   public static void showAvrage(Student obj1,Student obj2,Student obj3,Student obj4)
  {
      System.out.println("avrage marks of "+obj1.rno+","+obj2.rno+","+obj3.rno+","+obj4.rno+" = "+((obj1.per+obj2.per+obj3.per+obj4.per)/4)); 
  }*/
  public static void showAvrage(Student... obj1)
  {
     int sum=0;
     for (int i=0;i<obj1.length;i++)
     {
         sum=sum+obj1[i].per;
     }
      System.out.println("avarge percentage = "+(sum/obj1.length));
  }
}
