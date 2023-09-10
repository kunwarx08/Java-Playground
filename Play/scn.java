import java.util.Scanner;
 
 public class scn {
    public static void main(String[] args) {
    
        System.out.println("Enter Data: ");
        Scanner obj = new Scanner(System.in);
            int a=obj.nextInt();
            System.out.println("Data Entered: "+a);
            obj.close();
    }
}
