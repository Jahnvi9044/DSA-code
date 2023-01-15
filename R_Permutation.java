
import java.util.*;
public class R_Permutation {

    static String s[];
    static int k;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        String  st="abc";
        s=new String[6];
         k=0;
        per(0,st);
        for(String d:s)
        {
            System.out.println(d);
        }
    }
    public static void per(int index,String st)
    {
        if(index>=st.length())
        {   s[k]=st;
            k++;
         //   System.out.println(st);


        }
else{
        for(int i=index;i<st.length();i++)
        {
            st= swap(i,index,st);
            per(index+1,st);
            st=swap(i,index,st);



        }}
    }
    public static String  swap(int i,int j,String st)
    {
        char ch[]=st.toCharArray();
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        String f="";
        for(int a=0;a<st.length();a++)
        {f=f+ch[a];

        }
       // System.out.println("f:"+f);

       // System.out.println("st:"+st);
         return f;
    }
}

