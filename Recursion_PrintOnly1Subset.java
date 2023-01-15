/**
 * This program prints only 1 subset with sum K
 * ---->So to do that just return after printing for the first time
 */
import java.util.*;
public class Recursion_PrintOnly1Subset
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

       int[] arr={1,2,1};
       ArrayList<Integer> a=new ArrayList<>();
       fset(0,a,0,arr,3,sc.nextInt());

    }
    public static boolean fset(int i,ArrayList<Integer> a,int sum,int[] arr,int n,int k)

    {
     //base case
     if(i==n)
     {
         if(sum==k)
         {  System.out.println(a);
         return true;}
         return false;


     }
     a.add(arr[i]);
     sum=sum+arr[i];
    if( fset(i+1,a,sum,arr,n,k)==true )return true;
    sum=sum-a.get(a.size()-1);
    a.remove(a.size()-1);
     if(fset(i+1,a,sum,arr,n,k)==true)return true;
     return false;//if(there is no such subset present in the array
    }

}
