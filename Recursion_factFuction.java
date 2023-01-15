import java.util.Scanner;
public class Recursion_factFuction {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(fact(n));


    }
    public static int fact(int n)
    {   if(n==1) return 1;
        return (n*fact(n-1));
        //return ((n==1)?1:(n+fact(n-1)));

    }
}
