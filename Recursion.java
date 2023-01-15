
public class Recursion
{ static void name(int st)
{
    if(st>5)
       return;
    System.out.println("Jahnvi");
    name(st+1);
}
public static void main(String args[])
{
    name(1);
}

}
