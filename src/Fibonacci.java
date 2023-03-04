public class Fibonacci {
    public static void main (String args[]) {
        int a,b,d;
        a=0;
        b=1;
        long c=30;
        System.out.println(a);
        System.out.println(b);
        for (int i=2; i<c; i++){
            d= a+b;
            a=b;
            b=d;
            System.out.println(d);
        }

    }


}
