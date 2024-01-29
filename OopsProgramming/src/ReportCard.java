
public class ReportCard {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        s1.setdata(1001,"chetan patel",89);
        s2.setdata(1002, "rohit patel", 12);
        s3.setdata(1003, "aman patel", 45);
        s1.reportcard();
        s2.reportcard();
        s3.reportcard();
        Student.showOverallresult();
        
        
    }
 
}
