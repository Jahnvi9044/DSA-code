import java.util.*;




public class Array_sort012 {

public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int[] arr={0 ,1, 2, 0, 1, 2, 0};
    sort012( arr);
    for(int i:arr) {
        System.out.print(i+" ");
    }


}
        public static void sort012(int[] arr)
        {
            int n = arr.length;
            int i = 0, j = 0, k = n - 1;
            while(i<=k)
            {
                if(arr[i]==0)
                {swap(i,j,arr);
                    i++;
                    j++;


                }
                else if(arr[i]==1)
                i++;
                else if(arr[i]==2)
                {
                    swap(i,k,arr);
                    k--;
                }
            }

        }

    public static void swap(int i ,int j,int[] arr)
    {  int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}