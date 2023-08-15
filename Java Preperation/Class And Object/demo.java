class sample
{
    int a=10 ; String b="Kunwar"; //class variables
    void show() //class methods
    {
        System.out.println(a+" "+b);
    }
}

public class demo 
{
    public static void main(String[] args) 
    {
     sample r = new sample();  //object created
     r.show();   //function called with reference to object 
    }
}
