
public class StringClass {
    public static void main(String[] args) {
        String s=new String();
        String s1=new String("indore");
        char ch[]={'a','b','c','d','e','f','g'};
        String s2=new String(ch,1,5);
        byte b[]={65,66,67,68,69,70};
        String s3=new String(b,1,3);
        System.out.println(s3);
    }
}
// string class constructer
// String();
// String (string);
// String (char []);
// String(char[],int,int)
// String (byte [])
// String(byte [],int,int)