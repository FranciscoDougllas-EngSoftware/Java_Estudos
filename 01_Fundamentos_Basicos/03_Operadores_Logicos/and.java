public class and {
    public static void main(String[] args){
        int a, b;
        boolean c, d;
        a = 10;
        b = 4;
        c = true;
        d = false;
        System.out.println(a + " " + b + " " + c + " " + d);

        System.out.println(a == b && c == d);
        System.out.println(a == b || c == d);
        System.out.println(!(a == b && c == d));
    }
}
