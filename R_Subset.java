

import java.util.*;
public class R_Subset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(subsetSum(arr));}
    public static ArrayList<Integer> subsetSum(int[] arr){
        int n=arr.length;
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<Integer> a1=new ArrayList<Integer>();
        fsum(0, a,arr, n,0,a1);
            System.out.println();
    return a1;}

    public static void fsum(int i,ArrayList<Integer> a,int[] arr,int n,int sum,ArrayList<Integer> a1)
    {  if(i==n)
    {
       // System.out.println(a);
        System.out.print(sum+" ");
        a1.add(sum);

        sum=0;
        return;

    }
        fsum(i+1,a,arr,n,sum,a1);
       a.add(arr[i]);
        sum=sum+arr[i];
        fsum(i+1,a,arr,n,sum,a1);
        a.remove(a.size()-1);
        sum=sum-arr[i];


    }
}
