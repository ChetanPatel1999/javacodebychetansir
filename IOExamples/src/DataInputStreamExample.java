
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class DataInputStreamExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\CLASSROOM01\\Documents\\chetan patel\\Data\\demo3.txt");
        DataInputStream dis=new DataInputStream(fis);
        int v1;
        double v2;
        boolean v3;
       v1=dis.readInt();
       v2=dis.readDouble();
       v3=dis.readBoolean();
        System.out.println("id = "+v1);
        System.out.println("sallary = "+v2);
        System.out.println("marride = "+v3);
        dis.close();
        fis.close();
       
    }
 
}
