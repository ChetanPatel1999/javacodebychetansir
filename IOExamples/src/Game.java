import java.io.Serializable;
public class Game implements Serializable{
    public int xpos;
    public int ypos;
    
    void moveobject(int xpos,int ypos)
    {
        this.xpos=this.xpos+xpos;
        this.ypos=this.ypos+ypos;
    }
    void display()
    {
        System.out.println("xpos = "+xpos);
        System.out.println("ypos = "+ypos);
    }
}
