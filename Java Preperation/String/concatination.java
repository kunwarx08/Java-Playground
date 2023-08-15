// public class concatination

// {public static void main(String[] args)
// {
    
// String fn="Kunwardeep";
// String ln="Singh";
// String x="Gill";
// String s=fn.concat(ln); //For 2 strings only  //String var_name=str1.concat(str2);
// System.out.println(s);
// System.out.println(fn+ln+x);//for more than 2 string concatination we use + operator

// }                 
    
// }


class concatination{
    public static void main(String[] args) {
        StringBuffer obj=new StringBuffer("Kunwardeep");
        System.out.println(obj.append("Singh"));
    }
}
