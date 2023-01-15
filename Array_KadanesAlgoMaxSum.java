import java.util.*;

public class Array_KadanesAlgoMaxSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2, -3, 4, -1, -2, 1, 5, -3};

            System.out.print(maxSum(arr));

    }

    public static int maxSum(int[] arr)
    {  int sum=0,maxsum=Integer.MIN_VALUE,n=arr.length;
        int a=0,b=0;
        for(int i=0;i<n;i++)
        {sum+=arr[i];
            if(maxsum<sum)
                maxsum=sum;
            if(sum<0)
                sum=0;
        }
      return maxsum;
    }
}
