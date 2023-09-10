import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        int size,i;
        int sum=0;
        System.out.println("Enter Size of array");
        Scanner obj=new Scanner(System.in);
        size=obj.nextInt();
       
        int arr[]=new int[size];
        System.out.println("Enter Elements of array: ");

        for(i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        for(i=0;i<size;i++){
            System.out.println(arr[i]+" ");
            sum+=arr[i];
            obj.close();
        }
        System.out.println("Sum of array is: "+sum);
    }
    
}
