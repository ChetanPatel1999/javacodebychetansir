import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class WriteFileExample2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\CLASSROOM01\\Documents\\chetan patel\\Data\\sample.txt");
        String s="this msg  by weite(byte[]) method";
        byte b[]=s.getBytes();
       // fos.write(b);
        fos.write(b,9,15);
        fos.close();
        
    }
}
