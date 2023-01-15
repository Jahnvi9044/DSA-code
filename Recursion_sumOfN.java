public class Recursion_sumOfN {
    public static void f(int i,int n,int sum)
    {   if(i>n)
    {  System.out.println(sum);
        return;}

        f(i+1,n,sum+i);

    }
    public static  void main(String[] args)
    {
        f(1,76,0);
        System.out.println(76*77/2);

    }
}
