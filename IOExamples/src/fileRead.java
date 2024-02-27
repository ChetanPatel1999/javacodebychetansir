import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class fileRead {
    public static void main(String[] args) throws FileNotFoundException, IOException {
      FileReader fr=new FileReader("C:\\Users\\CLASSROOM01\\Documents\\chetan patel\\Data\\trial.txt");  
      char ch[]=new char[20];
      fr.read(ch);
      for(char c:ch)
      {
          System.out.print(c);
      }
        System.out.println();
      fr.close();
    }
}
