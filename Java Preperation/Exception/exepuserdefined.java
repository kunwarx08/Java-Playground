class InvalidAgeException extends Exception
{
    InvalidAgeException(String msg)
    {
        System.out.println("msg");
    }
}

public class exepuserdefined {

    public static void main(String[] args) 
    {
        int a=12;
        try
        {
            vote(a);
        }        
        catch(java.lang.Exception e)
        {
            System.out.println(e);
        }
        
        public void vote(int age) throws InvalidAgeException
        {
            if(age<18)
            {
                throw new InvalidAgeException("Not Eligible For Voting");
            }
            else
            {
                System.out.println("Eligible for voting");
            }

        }
    
    
    
    }
    
}
