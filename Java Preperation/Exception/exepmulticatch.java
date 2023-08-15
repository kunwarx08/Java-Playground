public class exepmulticatch {
    public static void main(String[] args) {
        
        try
        {
        int a=10,b=2,c;
        c=a/b;
        System.out.println(c);
        
        int arr[]={10,20, 30};
        System.out.println(arr[6]);
        
        String str="ankit";
        System.out.println(str.toUpperCase());
        }
   
    catch(ArrayIndexOutOfBoundsException a)
    {
    System.out.println("Array Exception");
    }
    catch(ArithmeticException e)
    {
    System.out.println("Arithmetic Exception");
    }

System.out.println("Executed the program");

}}