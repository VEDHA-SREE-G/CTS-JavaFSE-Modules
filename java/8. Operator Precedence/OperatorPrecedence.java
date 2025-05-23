public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;
        int result3 = 100 / 10 + 5 * 2;
        int result4 = 100 / (10 + 5) * 2;
        System.out.println("Operator Precedence");
        System.out.println("Result1 (10 + 5 * 2): " + result1);
        System.out.println("Result2 ((10 + 5) * 2): " + result2);
        System.out.println("Result3 (100 / 10 + 5 * 2): " + result3);
        System.out.println("Result4 (100 / (10 + 5) * 2): " + result4);
        System.out.println("Order Of Operators : P(Parenthesis) E(Exponents) M(Multiplication) D(Division) A(Addition) S(Subtraction)");
    }
}
