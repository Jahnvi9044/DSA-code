import java.util.*;
public class R_Noof0 {
    public static int count(int input){

        System.out.println(input);
        if(input==0)
        {return 0;

        }
        if(input%10==0)
        {
            System.out.println(input);
            System.out.println(input%10);
            System.out.println(input/10);

            return 1 + count(input / 10);
        }
        else
            return count(input/10);
    }

    public static void main(String[] args) {
        System.out.println( count(01020));
    }

}
