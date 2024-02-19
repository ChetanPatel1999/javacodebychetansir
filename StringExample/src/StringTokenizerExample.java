
import java.util.StringTokenizer;
public class StringTokenizerExample {
    public static void main(String[] args) {
        String s="hi,i;am,a;good,boy";
        StringTokenizer s1=new StringTokenizer(s,";,o");
        System.out.println(s1.countTokens());
        while(s1.hasMoreTokens())
        {
            System.out.println(s1.nextToken());
        }
        System.out.println(s1.countTokens());
    }
}
// String nextToken()// its return token
// boolean hasMoreToken()// its check more token is avilable or not
// int countTokens()// how many token are remaining
// 