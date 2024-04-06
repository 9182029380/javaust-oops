package has;

class A {
    public static int add(int a, int b) {
        return a + b;
    }

    private static double add(double a, int b) {
        return (a + b);
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(2, 3, 5));
    }
}
