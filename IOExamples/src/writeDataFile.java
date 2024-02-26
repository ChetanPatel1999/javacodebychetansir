
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class writeDataFile {
    public static void main(String[] args) throws Exception{
        // open a stream to write data in file
        FileOutputStream fos= new FileOutputStream("C:\\Users\\CLASSROOM01\\Documents\\chetan patel\\Data\\sample.txt",true);//its append new contain
        // data wirte in a file
        fos.write(65);
        fos.write(66);
        fos.write(67);
        fos.write(68);
        fos.write(69);
        
        // close the file
        fos.close();
    }
}
