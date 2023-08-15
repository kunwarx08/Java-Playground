import java.io.File;
 
class file {
    public static void main(String[] args)
    {
        try{
        // File name specified
        File obj = new File("myfile.txt");
        obj.createNewFile();
          System.out.println("File Created!");
    }
        catch(java.lang.Exception e)
    
    {
    }

    }
}
