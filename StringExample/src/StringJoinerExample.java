
import java.util.StringJoiner;
public class StringJoinerExample {
    public static void main(String[] args) {
        String s1="python",s2="php",s3="java";
        StringJoiner joi =new StringJoiner(",","==>","<==");
        joi.add(s1);
        joi.add(s2);
        joi.add(s3);
        joi.add("C/Cpp");
        System.out.println(joi);
    }
}
//  void add(string )// add string in StringJoiner object
// Stringjoiner("string")
//StringJoiner(string,prefixs,sufix)