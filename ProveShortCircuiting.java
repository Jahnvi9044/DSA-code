

public class ProveShortCircuiting {
    public static void main(String[] args) {
        int i=10;
        int j=20;
        if(++i>10 || ++j>20)
            System.out.println("jj");
        System.out.println(i+" "+j);
        System.out.println(i+j);
        System.out.println(" "+i+j+" ");
        System.out.println(20+11);
        System.out.println(20);
        System.out.println("gfgf  "+i+10+20+"  jtngg");
        System.out.println("gfgf  "+10+20+"  jtngg");
        System.out.println("gfgf  "+i+10+20);
        System.out.println(i+10+20+"  jtngg");
    }
}
