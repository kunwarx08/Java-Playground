class reverse{
  public static void main(String[] args) {
    
    int l,i;
    String r="Kunwar";
    String r2="";
    l=r.length();//6


    for(i=l-1;i>=0;i--)
    {
      r2=r2+r.charAt(i);
    }
    System.out.println(r2);
  }
}



// class reverse
// {
//   public static void main(String[] args) {
//     StringBuffer r=new StringBuffer("Kunwar");
//     System.out.println(r.reverse());
//   }
// }