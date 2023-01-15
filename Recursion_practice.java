
import java.util.*;
public class Recursion_practice {
    static int[] arr={3,6,8,2,4,5};
    static String st="NITIN";
    public static void main(String[] args)
    {//f2(1, 5);
    System.out.println( fsum1(5));
     fsum(5,0);
        System.out.println(fact(5));
        fact1(5,1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        fswap(0,arr.length);
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(fpal(0,st.length()));

    }
    public static void f(int i,int n)
    {if(i>n)
        return;
        System.out.print(i+" ");
        f(i+1,n);

    }
    //printing 1 to n using backtrack
    public static void fr(int n)
    {
        if(n<1)
            return;
        fr(n-1);
        System.out.print(n+" ");
    }
    //printing from n to 1
    public static void f1(int n)
    {
        if(n<1)
            return;
        System.out.println(n);
        f1(n-1);
    }
    //printing n to 1 using backtracking
    public static void f2(int i,int n)
    {
        if(i>n)
            return;
        f2(i+1,n);
        System.out.println(i);
    }
    //printing the sum of an array using parameter
    public static void fsum(int n,int sum)
    {
        if(n<1)
        {
            System.out.println(sum);
            return;

        }
        fsum(n-1,n+sum);
    }
    //printing sum using some different method
    public static int fsum1(int n) {
        if (n == 1)
            return 1;

        return (n + fsum1(n - 1));


    }
    //Calculates the factorial
    public static int fact(int n)
    {
        if(n==1)
            return 1;
        return (n*fact(n-1));
    }
//factorial using parameter
    public static void fact1(int n,int f)
    {
        if(n==1)
        {
            System.out.println(f);
            return;
        }
        fact1(n-1,f*n);


    }
    //fuction to swap an array
    public static void fswap(int i,int n)
    {if(i==n/2)
        return;
        swap(i,n-i-1);
        fswap(i+1,n);


    }
    public static void swap(int a,int b)
    {
        arr[a]=arr[a]+arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]=arr[a]-arr[b];
    }
    //Checking whether a string is a palindrome or not
    public static boolean fpal(int i,int n)
    {
        if(i>n/2)
            return true;
        if ( ! (st.charAt(i)==st.charAt(n-i-1)))
            return false;
        else
            return fpal(i+1,n);


    }





    }

