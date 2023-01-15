

public class Recursion_reverseArr {
     static int[] a={11,2,3,6,7,8};
    public static void main(String[] args)
    {rev(0,a.length);
        for(int i:a) System.out.print(i+" ");
    }
    public static void rev(int i,int n)
    { if(i>n/2)return;
        swap(i,n-1-i);
        rev(i+1,n );
    }
    public static void  swap(int m,int b)
    {
        a[m]=a[m]+a[b];
        a[b]=a[m]-a[b];
        a[m]=a[m]-a[b];
    }

}
