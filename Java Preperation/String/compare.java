// public class compare {
//     public static void main(String args[]) //compareTo used to compare lexographiclly
//     {
//         String string1 = new String("Geeksforgeeks"); 
//         String string2 = new String("Practice");
//         String string3 = new String("Geeks");
//         String string4 = new String("Geeks");
//         String string5 = new String("geeks");
  
//         // Comparing for String 1 != String 2
//         System.out.println("Comparing " + string1 + " and " + string2
//                            + " : " + string1.compareTo(string2));
  
//         // Comparing for String 3 = String 4
//         System.out.println("Comparing " + string3 + " and " + string4
//                            + " : " + string3.equals(string4));
  
//         // Comparing for String 4 != String 5
//         System.out.println("Comparing " + string4 + " and " + string5
//                            + " : " + string4.equals(string5));

//         // str1.equalsIgnoreCase(str2); 
                           
//         System.out.println("Comparing " + string4 + " and " + string5
//                            + " : " + string4.equalsIgnoreCase(string5)+" (Ignoring Case Sesitive)");
  
//         // Comparing for String 1 != String 4
//         System.out.println("Comparing " + string1 + " and " + string4
//                            + " : " + string1.equals(string4));
//     }
// }




public class compare 
{
    public static void main(String args[]) //compareTo used to compare lexographiclly
    {
        String string1 = new String("Ramu"); 
        String string2 = new String("Shamu");
        String string3 = new String("ramu");
  
        System.out.println(string1.compareTo(string2));

        System.out.println(string1.equals(string2));
                           
        System.out.println(string1.equalsIgnoreCase(string3)+" (Ignoring Case Sesitive)");
    }
}