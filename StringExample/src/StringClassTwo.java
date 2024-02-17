
public class StringClassTwo {
    public static void main(String[] args) {
        String s1=new String("bro");
        String s2= new String("Bro");
        int n=s1.compareTo(s2);
        int n1=s1.compareToIgnoreCase(s2);
        System.out.println(n);
        System.out.println(n1);    
    }
 
}
// non static comparision methods
// boolean equals()// its retuen true if both string contain same
// boolean equalsIgnorCase()//
// int compareTO()
// s1> s2 return positive differnce
// s2 > s1 return nefgative differnce
// s1 ==s2 return Zero


   

