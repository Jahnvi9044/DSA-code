
import java.util.*;

public class R_subset2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,2};
        ArrayList<Integer> a=new ArrayList<>();
        List<List<Integer>> l=new ArrayList<>();
        fsub(0,arr,a, l);
       // Collections.sort(l,new );
        //Arrays.sort(l);
        System.out.println(l);
    }
    public static void fsub(int i,int[] arr,ArrayList<Integer> a,List<List<Integer>> l)
    {
         if(i==arr.length)
         {
             if(!l.contains(a))
           //  System.out.println(a);
             l.add(new ArrayList (a));

             return;
         }
        fsub(i+1,arr,a, l);
         a.add(arr[i]);
        fsub(i+1,arr,a, l);
             a.remove(a.size()-1);


    }
}
