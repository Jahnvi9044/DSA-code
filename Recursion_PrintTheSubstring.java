import java.util.ArrayList;

public class Recursion_PrintTheSubstring{

    static String st="abc";
    static ArrayList<String> arr=new ArrayList<>();
    public static void main(String[] args)
    { fsub(st,"");
        System.out.println(arr);

    }
    public static void fsub(String input,String output)
    {
        if(input.length()==0)
        {   if(output.equals(""))
           {    output="{}";
               arr.add(output);}
            else if(contigous(output))
            arr.add(output);
           //System.out.println(output);
            return;
        }
        fsub(input.substring(1),output);
        fsub(input.substring(1),output+input.charAt(0));
    }
    public static boolean contigous(String a)
    {   char ch=a.charAt(0);
        int index=st.indexOf(ch);
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=st.charAt(index))
            {
                return false;
            }
            index++;
        }
        return true;
    }
}
