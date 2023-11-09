import java.util.Scanner;

public class restart 
{
    public static void main(String[] args) 
    {
    //     int arr[]={1,2,3,4,5};
    //     System.out.println(arr[2]);
    int size,i;
    Scanner r = new Scanner(System.in);
    System.out.println("Enter size of array:");
    size=r.nextInt();
    int arr[]= new int[size];
    
    for(i=0;i<size;i++){
        arr[i]=r.nextInt();
    }
    
    System.out.println("Entered elements are:");
    for(i=0;i<size;i++){
       System.out.println(arr[i]);;
    }
    
    }
}
