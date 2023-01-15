
import java.util.*;
public class Recursion_subsetQuestions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int[] arr={1,2,1};
    ArrayList<Integer> a=new ArrayList<>();
    fset(0,a,0,arr,arr.length,sc.nextInt());

    }
    public static void fset(int i,ArrayList<Integer> a,int sum,int[] arr,int n,int k)
    {
        //base Case
        if(i==n)
        {
            if(sum==k)
            {System.out.println(a);
            }
          return;

        }
        a.add(arr[i]);
        sum+=arr[i];
        fset(i+1,a,sum,arr,n,k);

        sum-=arr[i];
        a.remove(a.size()-1);
        fset(i+1,a,sum,arr,n,k);


    }


}
