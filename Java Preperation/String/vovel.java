import java.util.*;

//code to print vovels in a string
public class vovel 
{

    public static void main(String[] args) 
    {

        char ch; // char ch; 
        int v=0;
        
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter String:");
        String str= obj.nextLine();
        int l = str.length();
      
        for (int i=0;i<l;i++)
        {
          ch=str.charAt(i);
         if(ch=='A'|| ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
          {
            v++;
          }
        }

        System.out.println("Vovels are:"+ v);    

    }
}

        

    

