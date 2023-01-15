package String;

import java.util.*;

public class StringPoolTest {
    public static void main(String[] args)
    {  Scanner sc=new Scanner(System.in);
        String st1="abc";
        String st2="abc";
        System.out.println((st1==st2)?"true":"false");
        String n=new String("abc");
        System.out.println((st1==n)?"true":"false");
        System.out.println("When we say st==st1 then hashCode of String are compared and not the acteal Strings " );
        System.out.println("HashCode of the String st1 and st2 are same st1: "+st1.hashCode()+"  st2: "+st2.hashCode());
        st1=st1+"ab";
        st1=st1.substring(0,3);
        System.out.println(st1.hashCode());
        System.out.println("Enter 2  Strings ");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //Chk palin
        String s3="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            s3=s3+s1.charAt(i);

        }
        System.out.println((s3==s1)?true:false);
        System.out.println("s1="+s1+" s3="+s3);
        System.out.println("s1="+s1.hashCode()+" s3="+s3.hashCode());

        System.out.println("Checking array");
        int arr[]={1,2,3,4};
        int arr1[]={1,2,3,4};
        System.out.println((arr==arr1)?true:false);
        System.out.println("arr="+arr+" arr1="+arr1);

        int a=5;
        int b=5;
        System.out.println("You can never get the address of a variable in java unless its areal object(refernce to a real object)");


        System.out.println("Again checking array");
        int[] ar1=new int[3];
        ar1[0]=1;
        ar1[1]=2;
        ar1[2]=3;
        int[] ar2=new int[3];
        ar2[0]=1;
        ar2[1]=2;
        ar2[2]=3;
        System.out.println((ar1==ar2)?true:false);
        System.out.println("ar1="+ar1+" ar2="+ar2);

       //Observation
        System.out.println("OBSERVATION");
        System.out.println("Array and String are non-Primitive ,that is when ever you create them they are stored \nin heap no matter you give same value\n" +
                "to 2 differen variables(refences) they will have\n different locations unless you are equating the reference.\n" +
                "In case of Strings the things are a bit different \n,when you say String st=\"abc\" this means a string is declare\n in heap but there is a location in heap called" +
                "String pool ,st is declared there .Now if you declare another String st2=\"abc\" \nthen both st and st2 will point to same location where abc is stored in the Stringpool\n");

    }

}
