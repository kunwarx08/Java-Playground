import java.util.*;  
class cgpa{  
    public static void main(String args[])  
    {     
     Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Number of Theory Subjects:");
         int s = sc.nextInt(); 

         int[] subject = new int[10];  
         System.out.println("Enter Marks of Theory Subjects out of 100");  
         for(int i=1; i<=s; i++)  
         {   
         subject[i]=sc.nextInt();  
         }  

          
         for(int i=1; i<=s; i++)  
         {      
         System.out.println("Marks of Theory Subject: "+i+" = "+ subject[i]); 
         }
    
    
     
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter Number of Practical Subjects:");
     int x = scan.nextInt(); 

     int[] subjectp = new int[10];  
     System.out.println("Enter Marks of Practical Subjects");  
     for(int i=1; i<=x; i++)  
     {   
     subjectp[i]=scan.nextInt();  
     }  

      
     for(int i=1; i<=x; i++)  
     {      
     System.out.println("Marks of Pracical Subject: "+i+" = "+ subjectp[i]); 
     }
    


    } 
}