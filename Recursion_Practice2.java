import java.util.*;
public class Recursion_Practice2 {
    static int[] arr={1,2,3};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // abc == [{},ab,a,ac,bc,c,b,abc]
        String st="abc";

        ArrayList<Integer> a=new ArrayList<>();
        fset1(0,a);
        fset(st,"");

    }
   public static void fset(String input,String output)
    {
        if(input.equals(""))
        {   if(output.equals(""))
            System.out.println("{}");
            else
            System.out.println(output);
            return;
        }
        fset(input.substring(1),output);
        fset(input.substring(1),output+input.charAt(0));
    }


    public static void fset1(int i,ArrayList<Integer> a)
    {if(i==3)
    {
        System.out.println(a);
        return;
    }
      a.add(arr[i]);
        fset1(i+1,a);
         a.remove(a.size()-1);
         fset1(i+1,a);

    }
}
