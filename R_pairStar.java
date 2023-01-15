

public class R_pairStar {
    public static void main(String[] args) {
        String st="hellokatee";
        System.out.println(fr(st,0,st.length(),""));
    }
    public static String fr(String st,int i,int n,String st2)
    {   //This is the base case
         if(i==n) return st2;

        st2=st2+st.charAt(i);
        if(i!=n-1)
        {if(st.charAt(i)==st.charAt(i+1))
            st2=st2+"*";}
        return fr(st,i+1,n,st2);
    }
}
