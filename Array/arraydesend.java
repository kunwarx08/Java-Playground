import java.util.Scanner;

public class arraydesend {
    public static void main(String[] args) {
        int temp,a,size;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        size=obj.nextInt();
        int arr[]=new int[size];
        
        System.out.println("Enter Array elements: ");
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[j]>arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Array in accending order is as follows: ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

    }
    
}
