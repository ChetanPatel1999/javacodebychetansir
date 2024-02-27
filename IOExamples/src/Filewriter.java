import java.io.FileWriter;
import java.io.IOException;
public class Filewriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw= new FileWriter("C:\\Users\\CLASSROOM01\\Documents\\chetan patel\\Data\\sample3.txt",true);
        String s="this is wrriten in file using file writer class object";
       // fw.write(s);
       fw.write(s, 5, 6);
        fw.close();
        System.out.println("succesfully write");
                
    }
}
