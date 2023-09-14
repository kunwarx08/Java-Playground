import java.util.Scanner;

public class arraySearch {
    public static void main(String[] args) {
        int x=0,n,count=0,size;
        System.out.println("Enter Size of Array: ");
        Scanner obj=new Scanner(System.in);
        size=obj.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Elements of Array: ");
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println("Enter number to search");
        n=obj.nextInt();

        for(int i=0;i<size;i++){
            if(n==arr[i]){
                x++;
            } 
        count++;
        }
        if(x>0)
        System.out.println("Element is found at "+count+"th position");
    }   
        
    
}
