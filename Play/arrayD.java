import java.util.Scanner;

public class arrayD {
    public static void main(String[] args) {
        int size,i;
        System.out.println("Enter Size of array");
        Scanner obj=new Scanner(System.in);
        size=obj.nextInt();
       
        int arr[]=new int[size];
        System.out.println("Enter Elements of array: ");

        for(i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println("Added array elements are: ");
        for(i=0;i<size;i++){
            System.out.println(arr[i]+" ");
            obj.close();
        }

    }
}
