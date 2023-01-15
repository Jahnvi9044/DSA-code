
import java.util.*;
public class DecimalToAnyBase {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    int base=sc.nextInt();
    int n=sc.nextInt();
    int d=0;
    int no=0;
    int k=1;
    for(int i=n;i!=0;i=i/base)
    {
        d=i%base;
        no=d*k+no;
        k*=10;

    }
        System.out.println(no);

    int sum=0;
    int p=0;
    for(int i=no;i!=0;i/=10)
    {
        d=i%10;
        sum+=d*Math.pow(8,p++);

    }
        System.out.println("Reconversion = "+sum);

}}
