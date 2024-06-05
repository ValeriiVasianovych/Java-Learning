public class MatFunc {
    public static void main(String[] args) {
        double a = 36.0;
        double b = 20.0;

        double poweredValue = Math.pow(a, b);
        double squareRoot = Math.sqrt(a);

        System.out.println("Square root of " + a + " is " + squareRoot);
        System.out.println(a + " raised to the power of " + b + " is " + poweredValue);
    }
}