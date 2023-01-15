public class Recursion_febonacciNo {
    public static void main(String[] args)
    {
        System.out.println(febo(6));
    }
    public static int febo(int n)
    {
        if(n==1||n==0)
            return n;
        return febo(n-1)+febo(n-2);
    }
}
