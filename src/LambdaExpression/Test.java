package LambdaExpression;

public class Test {
    public static void main(String[] args) {
        Add myInterface = (a, b) -> a * b;
        System.out.println(myInterface.add(10, 20));
    }
}
