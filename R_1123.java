
import java.util.*;
public class R_1123 {
    static String[] s;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(count(1123));
        s=new String [count(1123)+1];
        code(1123,"",0);
        for(String a:s)
        System.out.println(a);

    }
    public static int  count(int n)
    {int no=0;
        for(int i=n;i!=0;i/=10)
        {
            no++;
        }
        if(no==3)
            no--;
        return no;
    }
    public static void code(int n,String st,int k) {
        if(n<=0)
        {
            System.out.println(st);
          //  s[k]=st;

            return ;
        }
        int d=n%10;
        char ch=(char)(d+96);
        st=ch+st;
        code(n/10,st,k);
        st=st.substring(1);
        if(n>9)
        {
            int d1=n%100;
            char ch1=(char)(d1+96);
            st=ch1+st;
            code(n/100,st,k+1);
            st=st.substring(1);
        }


    }

}
