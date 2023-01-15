

public class MergeSort {

    public static void main(String[] args) {
       int[] a={2, 5, 6, 3, 1};
        divide(0,4,a);
        for(int i=0;i<5;i++)
          System.out.print(" " +a[i]);
    }
    public static void divide(int l,int r,int[] arr)
    {
        if(l<r)
        {
            int mid=(l+r)/2;
            divide(l,mid,arr);
            divide(mid+1,r,arr);

            merge(l,mid,r,arr);
        }

    }
    public static void merge ( int l, int m, int r,int[] arr)
        {
            // Find sizes of two subarrays to be merged
            int n1 = m - l + 1;
            int n2 = r - m;

            /* Create temp arrays */
            int L[] = new int[n1];
            int R[] = new int[n2];

            /*Copy data to temp arrays*/
            for (int i = 0; i < n1; ++i)
                L[i] = arr[l + i];
            for (int j = 0; j < n2; ++j)
                R[j] = arr[m + 1 + j];

            /* Merge the temp arrays */

            // Initial indexes of first and second subarrays
            int i = 0, j = 0;

            // Initial index of merged subarray array
            int k = l;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            /* Copy remaining elements of L[] if any */
            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            /* Copy remaining elements of R[] if any */
            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

    }