class A extends Thread
{
   synchronized public void num()
   {
    String n=Thread.currentThread().getName();
    for(int i=0;i<5;i++)
        {
            System.out.println(n);
        }
        try 
            {
                Thread.sleep(1000);
            }
            catch(Exception io)
            {

            }
    }
   public void run()
    {
        this.num();
    }
}

public class sync 
{
    public static void main(String[] args) 
    {
        
        A t1=new A();
        A t2=new A();
       
        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start(); t2.start();
        
    }
    
}