class InvalidAgeException extends java.lang.Exception
{
    InvalidAgeException(String msg)
    {
        System.out.println(msg);
    }
}

class userdefinedexception 
{
     public static void vote(int age) throws InvalidAgeException
     {
        if(age<18)
        {
            throw new InvalidAgeException("Not Eligible for Voting");
        }

        else
        {
            System.out.println("Eligible for voting");
        }
     }
    public static void main(String[] args)
     {
        try
        { 
            vote(12);
        }
    catch(InvalidAgeException e)
    {
        System.out.println(e);
    }
}
     
}