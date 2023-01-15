
public class R_chkPal {
   static  String st="naman";
    public static void main(String[] args)
    {
        int i=f(0,st.length());
        if(i==1)
            System.out.println("Palindrom");
        else System.out.println("Not a pal");


    }

     static int f(int i,int n)
    {if(i>n/2)
        return 1;
        if(chk(i,n-1-i)==0) return 0;
        return(f(i+1,n));

    }
    static int chk(int i,int n)

    {
        if(st.charAt(i)==st.charAt(n))
    return 1;
        else
            return 0;

    }
}
