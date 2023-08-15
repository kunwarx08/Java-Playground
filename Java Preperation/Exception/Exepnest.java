public class Exepnest {
    public static void main(String[] args) 
    {
    try
    {
        try 
        {                       //high risk statement in nested try and catch
        int a[]={10, 20, 30};
        System.out.println(a[6]);
        }
        catch (ArrayIndexOutOfBoundsException ae)
        {
        System.out.println(ae);
        }
        System.out.println(10/0); //less risky statements below nested try
    }
    catch(ArithmeticException e)
    {
        System.out.println(e);
    }
    
    System.out.println("Nested Try Exception Handled");
        
    }
}
