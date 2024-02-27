
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataOutputStreamExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\CLASSROOM01\\Documents\\chetan patel\\Data\\demo3.txt");
        DataOutputStream dos= new DataOutputStream(fos);
        int empid=1001;
        double sal=1200.500;
        boolean marride=true;
        dos.writeInt(empid);
        dos.writeDouble(sal);
        dos.writeBoolean(marride);
        dos.close();
        fos.close();
    }
 
}
