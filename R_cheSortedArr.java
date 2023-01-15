/**
 * This is to check if the array is sorted or not
 */

public class R_cheSortedArr {
    public static void main(String[] args) {
        int[] a={4,4,5,7,9};
        f_chk(0,a);
    }
    public static void f_chk(int i,int[] a)
    {
        if(i==4)
        {
            System.out.println("sorted");
            return;
        }
        if(a[i]>a[i+1])
        { System.out.println("unsorted");
            return;}
        f_chk(i+1,a);

    }
}
