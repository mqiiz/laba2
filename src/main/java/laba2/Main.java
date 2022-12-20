package laba2;

public class Main {
    public static void main(String[] args) {
        double a = ExpressionParsing.resolve(("((4+4)*(5-2))/6"));
        System.out.println(a);
    }
}