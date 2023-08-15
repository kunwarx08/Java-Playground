class A extends Thread
{
    public void run()
    {
        String n=Thread.currentThread().getName();
        for(int i=0;i<3;i++)
        {
            System.out.println(n);
        }
    }
}

public class join 
{
    public static void main(String[] args) 
    {
        A t1=new A();
        A t2=new A();
        A t3=new A();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        
        t2.start();
        t1.start();
        try
        {
        t2.join();
        }
       catch(InterruptedException ie)
        {}
        t3.start();
        

        for(int i=0;i<3;i++)
        {
            System.out.println("Main Thread");
        }

        
    }
    
}
