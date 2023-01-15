
import java.util.Scanner;
public class Recursion_sumFunction {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(sum(n));
        System.out.println("To verify:"+n*(n+1)/2);

    }
    public static int sum(int n)
    {   if(n==1) return 1;
        return (n+sum(n-1));
        //return ((n==1)?1:(n+fact(n-1)));

    }
}
