public class MultidimensionalArray {
    public static void main(String[] args) {

        System.out.println("Name: Kunwardeep Singh\n URN: 2004948\n CRN: 2021138\n Class: D2ITB1\n");
        
        
        // create a 2d array 
        int[][] a = {
        {1, 2, 3},
        {4, 5, 6, 9},
        {7},
        };
        
        // calculate the length of each row 
        System.out.println("Length of row 1: " + a[0].length); 
        System.out.println("Length of row 2: " + a[1].length); 
        System.out.println("Length of row 3: " + a[2].length);
        }
        

}
