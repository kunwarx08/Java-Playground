import java.util.Scanner;

public class arraybiggestno {
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

        //Logic is this.
        int max=arr[0]; 
        for(i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max: "+max);
}
}