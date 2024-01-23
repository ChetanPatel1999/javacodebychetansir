
public class CircleUser {
    public static void main(String[] args) {
        Circle c1=new Circle(); // object is instance of Circle class
        c1.setRadius(5);
        c1.computeArea();
        c1.computeCircumference();
        Circle c2=new Circle();
        c2.setRadius(10);
        c2.computeArea();
        c2.computeCircumference();
        Circle c3=new Circle();
        c3.setRadius(15);
        c3.computeArea();
        c3.computeCircumference();
        c3.setRadius(9);
    }
}
