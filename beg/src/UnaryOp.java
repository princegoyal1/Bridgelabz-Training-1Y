public class UnaryOp {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(a++);
        System.out.println(a);

        System.out.println(++b);
        System.out.println(b);

        int x = a++;
        int y = ++b;
        System.out.println(x);
        System.out.println(y);

        System.out.println(a);
        System.out.println(b);

    }
}
