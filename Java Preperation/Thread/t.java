//package Thread;

class A extends Thread
{           
    @Override
    public void run()    //Taking 5 seconds due to multi threading
    {
        
        try
        {
        for(int i=0;i<5;i++)
        {
            System.out.println("Kunwar");
            Thread.sleep(1000);
        }
        }
            
        
        catch (InterruptedException i)
        {}   
    }
}
    
public class t
{
    public static void main(String[] args) throws InterruptedException
    {
        
        A x=new A();    //sequence of thread execution is not fixed
        x.start();

        for(int i=0;i<5;i++)
        {
            System.out.println("Gill");
            Thread.sleep(1000);
        }
    }
}


// class A extends Thread
// {           

//     public void fun()    //will take 10 seconds due to single thread main fun acting as simple function
//     {
//         try
//         {
//         for(int i=0;i<5;i++)
//         {
//             System.out.println("Kunwar");
//             Thread.sleep(1000);
//         }
//         }
            
        
//         catch (InterruptedException i)
//         {}   
//     }
// }
    
// public class t
// {
//     public static void main(String[] args) throws InterruptedException
//     {
        
//         A x=new A();             //sequence of thread execution is not fixed
//         x.fun();

//         for(int i=0;i<5;i++)
//         {
//             System.out.println("Gill");
//             Thread.sleep(1000);
//         }
//     }
// }

