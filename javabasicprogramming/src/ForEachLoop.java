
public class ForEachLoop {
    
    void arryExample()
    {
        int a[]={12,67,89,5,6,90,78,45,23};  // array of integer element 
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        
    }
    void stringArry()
    {
        String s[]={"chetan","aman","rohit","ayushi","sweta"}; // array of string element
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
        
    }
    //wap to add array element.
    void sumArray(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
           sum=sum+arr[i]; // sum=24
        }
        System.out.println("sum of array element = "+ sum);
    }
    
    
    //example of for each loop
    void forEach_1()
    {
        int arr[]={12,34,56,78,90,3,56,1,12};
        for (int v:arr)
        {
            System.out.println(v);
        }
    }
    //example2 of for each loop
    void forEach_2()
    {
        String s[]={"chetan","aman","rohit","ayushi","sweta","hi"}; // array of string element
        for (String var :s)
        {
            System.out.println(var);
        }
        
    }
    //wap to add element by for each loop
    void addFOREach(int arr[])
    {
        int sum=0;
        for(int m : arr)
        {
            sum=sum+m;
        }
        System.out.println("sum of arr element = "+sum);
    }
    public static void main(String[] args) {
        ForEachLoop obj=new ForEachLoop();
       // obj.arryExample();
       //obj.stringArry();
      int arr[]={2,4,5,7,6,1,2};
      // obj.sumArray(arr);
      //obj.forEach_1();
      //obj.forEach_2();
      obj.addFOREach(arr);
       
    }
    
}
