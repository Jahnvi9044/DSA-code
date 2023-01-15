
import java.util.*;
public class TheKeypadProblem {
    public static void main(String[] args)
    {Scanner sc = new Scanner(System.in);
        String[] p=keypad(12);
        for(int i=0;i<p.length;i++)
       System.out.print(p[i]+" ");
    }
    public static String[] keypad(int n)
    {
        // Write your code here

        if(n<=0)
        {
            return new String[]{" "};
        }
        String[] smallAns=keypad(n/10);
        String[] ans=new String[smallAns.length*helper(n%10).length];
        int m=0;
        char[] ch=helper(n%10);
        for(int i=0;i<smallAns.length;i++)
        {
            for(int j=0;j<ch.length;j++)
            {
                ans[m]=smallAns[i]+ch[j];
                m++;
            }
        }
        return ans;
    }
     public static char[] helper(int n)
    {  if( n==2)
        return new char[]{'a','b','c'};
        else if( n==3)
        return new char[]{'d','e','f'};
        else if(n==4)
        return new char[]{'g','h','i'};
        else if(n==5)
        return new char[]{'j','k','l'};
        else if(n==6)
        return new char[]{'m','n','o'};
         else if(n==7)
        return new char[]{'p','q','r','s'};
         else if(n==8)
        return new char[]{'t','u','v'};
         else if(n==9)
        return new char[]{'w','x','y','z'};
         else return new char[]{};
    }


}
