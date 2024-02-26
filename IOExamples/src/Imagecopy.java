import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Imagecopy {
    public static void main(String[] args) throws FileNotFoundException, IOException {
      FileInputStream fis=new FileInputStream("C:\\Users\\CLASSROOM01\\Pictures\\Screenshots\\pic.png");
      int n=fis.available();
      byte b[]=new byte [n];
      fis.read(b);
      fis.close();
      FileOutputStream fos = new FileOutputStream("C:\\Users\\CLASSROOM01\\Documents\\chetan patel\\Data\\piccopy.png");
      fos.write(b);
      fos.close();
      System.out.println("image copy successfully");
    }
}
