
public class ReportCard {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student s4=new Student();
        s1.setdata(1001,"chetan patel",89);
        s2.setdata(1002, "rohit patel", 12);
        s3.setdata(1003, "aman patel", 45);
        s4.setdata(1004, "raj patel", 67);
       // s1.reportcard();
      //  s2.reportcard();
       // s3.reportcard();
      //  Student.showOverallresult();
      //s1.showGread();
     // s2.showGread();
     // s3.showGread();
      //  Student.showGread(s1);
       // Student.showGread(s2);
      //  Student.showGread(s3);
      //  Student.great();
       Student.showAvrage(s1,s2);
       Student.showAvrage(s1, s2,s3);
       Student.showAvrage(s1, s2, s3,s4);
       
        
        
    }
 
}
