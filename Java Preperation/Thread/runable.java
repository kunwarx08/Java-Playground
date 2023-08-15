class A implements Runnable
{           
    public void run()    //Taking 5 seconds due to multi threading
    {
        
        // try
        // {
        for(int i=0;i<5;i++)
        {
            System.out.println("Kunwar");
            //Thread.sleep(1000);
        }
        // }
            
        
        // catch (InterruptedException i)
        // {}   
    }
}
    
public class runable
{
    public static void main(String[] args) //throws InterruptedException
    {
        
        A r=new A(); 
        Thread t=new Thread(r);               //sequence of thread execution is not fixed
        t.start();

        for(int i=0;i<5;i++)
        {
            System.out.println("Gill");
            //Thread.sleep(1000);
        }
    }
}
