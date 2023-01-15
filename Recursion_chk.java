
import java.util.*;
public class Recursion_chk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(bool("aabb "));
    }

    public static boolean bool(String st)
    {
        int i=0;
        while(true)
        {
            if(st.charAt(i)=='a'&&(st.charAt(i+1)!=' '||st.charAt(i+1)!='a'))
                i++;
            else if(i+3<=st.length())
            {  System.out.println("true");
                if(st.charAt(i)=='a'&& st.substring(i,i+3)=="bb")
                    i=i+1;


            else if(st.substring(i,i+2)=="bb"&&(st.charAt(i+2)=='a'||st.charAt(i+2)==' '))
                i=i+2;}
            else if(st.charAt(i)==' ')
            System.out.println(i);
            else break;

        }

      if(i>=st.length()-1)
        return true;
      else return false;

    }
}
