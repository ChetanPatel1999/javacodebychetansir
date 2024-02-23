import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class CheckedUncheckedException {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        int a=12;
        int b=5;
        int c=a/b;
        System.out.println(" result = "+ c);
        
        int arr[]={12,34,56};
        System.out.println(arr[4]);
        
        FileOutputStream ob=new FileOutputStream("abc.txt");
        Class.forName("abc");
                
    }
}
