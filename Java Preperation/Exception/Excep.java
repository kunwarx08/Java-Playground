// public class Excep
// {
//     public static void main(String[] args) {
//         int a=10,b=0,c;
//         c=a/b;
//         System.out.println(c);
//     }
// }
public class Excep
{
    public static void main(String[] args) {
        int a=10,b=0,c;
        try
        {
            c=a/b;
            System.out.println(c);
        }
        catch(java.lang.Exception e)
        {
        System.out.println("Exception Details:" + e);
        }

    System.out.println("Main method Executed");
        
    }
}