import java.util.*;

public class Recursion_PrintTheSubsequence {

     static String  st ="";
     static ArrayList<String> arr=new ArrayList<>();
    public static void main(String[] args)

    { Scanner sc=new Scanner(System.in);
        st=sc.next();
        fsub(st,"");
        System.out.println(arr);

    }
    public static void fsub(String input,String output)
    {
        if(input.length()==0)
        {   if(output.equals(""))
            output="{}";

            arr.add(output);
        //    System.out.println(output);
            return;
        }
        fsub(input.substring(1),output);
        fsub(input.substring(1),output+input.charAt(0));
    }
}
