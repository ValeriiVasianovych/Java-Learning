class Rzutowanie {
    public static void main(String[] args) {
        int intValue = 10;
        double doubleValue = intValue;

        System.out.println("Wartość doubleValue: " + doubleValue);

        double doubleValue2 = 15.75;
        int intValue2 = (int) doubleValue2;

        System.out.println("Wartość intValue2: " + intValue2);
    }
}