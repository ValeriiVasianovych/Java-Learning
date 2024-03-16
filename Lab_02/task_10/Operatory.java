class Operatory {
    public static void main(String[] args) {
        logicalAndArithmeticOperators();
    }

    public static void logicalAndArithmeticOperators() {
        int a = 5;
        int b = 3;
        // Operatory arytmetyczne
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int division = a / b;
        int remainder = a % b;

        // Operatory logiczne
        boolean result1 = (a > b) && (a != b);
        boolean result2 = (a < b) || (a == b);
        boolean result3 = !(a == b);

        System.out.println("Suma: " + sum);
        System.out.println("Różnica: " + difference);
        System.out.println("Iloczyn: " + product);
        System.out.println("Dzielenie: " + division);
        System.out.println("Reszta z dzielenia: " + remainder);
        System.out.println("Wynik 1: " + result1);
        System.out.println("Wynik 2: " + result2);
        System.out.println("Wynik 3: " + result3);
    }
}