
public class Circle {
    //define propertice using data member
    private double radius,area,circumference; // non static
    //operation on propertice using methods (member fuction)
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public void computeArea()
    {
        area=3.141*radius*radius;
        System.out.println("area = "+area);
    }
    public void computeCircumference()
    {
        circumference=2*3.141*radius;
        System.out.println("circumference = "+circumference);
    }
}
