
public class GenricExample <T>{
    void show(T a)
    {
        System.out.println(a); 
    }
    public static void main(String[] args) {
       GenricExample<Integer> ob1=new GenricExample<>();
       ob1.show(12);
       GenricExample<Double> ob2=new GenricExample<>();
       ob2.show(12.67);
       GenricExample<String> ob3=new GenricExample<>();
       ob3.show("chetan");
       
        GenricExample ob4=new GenricExample();
        ob4.show(45.67);
        
       
       
    }
}
