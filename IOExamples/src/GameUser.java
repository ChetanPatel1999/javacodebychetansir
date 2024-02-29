
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class GameUser {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Scanner sc =new Scanner(System.in);
        int h,v;
        String s;
        Game g=null;
        System.out.println("if you want to new game enter : new ");
        System.out.println("if you want to old game enter : old ");
        s=sc.next();
        if(s.equals("new"))
        {
             g=new Game(); 
        }
        else if(s.equals("old"))
        {
           FileInputStream fos=new FileInputStream("C:\\Users\\CLASSROOM01\\Documents\\chetan patel\\Data\\game.txt");
           ObjectInputStream oos=new ObjectInputStream(fos);
           g=(Game)oos.readObject();
           fos.close();
           oos.close();
        }
        else
        {
            System.out.println("enter only new or old");
        }
        System.out.print("enter x pos : ");
        h=sc.nextInt();
        System.out.print("enter y pos : ");
        v=sc.nextInt();
        g.moveobject(h, v);
        g.display();
        FileOutputStream fos=new FileOutputStream("C:\\Users\\CLASSROOM01\\Documents\\chetan patel\\Data\\game.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(g);
        oos.close();
        fos.close();
        System.out.println("save game......");
        System.out.println("end game ........");
        
        
    }
  
}
