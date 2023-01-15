/**
 * This program is to print the no of subset with sum k
 */
import java.util.*;
public class Recursion_PrintNoOfsunset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,1};
        ArrayList<Integer> a=new ArrayList<>();
        System.out.println(fset(0,a,0,arr,3,2));

    }
    public static int fset(int i,ArrayList<Integer> a,int sum, int[] arr,int n,int k)
    {
        //Base Case
        if(i==n)
        {
            if(sum==k)
            {
                return 1;


            }
            return 0;

        }
        a.add(arr[i]);
        sum=sum+arr[i];
        int l=fset(i+1,a,sum,arr,n,k);
        a.remove(a.size()-1);
        sum=sum-arr[i];
       int r= fset(i+1,a,sum,arr,n,k);
       return (l+r);
    }
}
