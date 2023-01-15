public class Recursion_sumOf  {
    public static int f(int i)
    {   if(i<1)
    {
        return 0;}
       return (i+f(i-1));

    }
    public static  void main(String[] args)
    {
        System.out.println( f(8));
        System.out.println(8*9/2);

    }
}
