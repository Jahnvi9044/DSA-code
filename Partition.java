import java.util.*;

public class Partition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2 ,4 ,2 ,1 ,3 ,1 ,3, 2,};
      //  System.out.println(partition(arr,0,arr.length-1));
        quick(arr,0,arr.length-1);
        for(int i:arr)
            System.out.print(i+" ");
    }

    public static void quick(int[] arr,int l,int r)
    {
        if(l<r)
        {
            int p=partition(arr,l,r);
            quick(arr,l,p-1);
            quick(arr,p+1,r);
        }
    }
    public static int partition(int[] arr,int si,int ei)
    {
        System.out.println();
        int pivot=arr[si];
        System.out.println(pivot);
        int count=0;
        for(int i=si+1;i<=ei;i++)
        {
           // System.out.println("arr[i]="+arr[i]);
            if(arr[i]<pivot)
                count++;
           // System.out.println("Cou="+count);
        }
        //System.out.println("count="+count
        System.out.println(si+" "+ei);
        int temp=arr[si];
        arr[si]=arr[count+si];
        arr[count+si]=temp;

        int i=si,j=ei;
        while(i<(count+si) && j>(count+si))
        {
            if(arr[i]>=pivot)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;

            }
            else i++;

        }
        System.out.println(count+si);
        for(int i1=si;i1<ei;i1++)
        System.out.print(arr[i1]+"  ");

        return (count+si);

    }
}
