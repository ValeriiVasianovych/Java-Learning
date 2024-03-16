import java.util.Scanner;

public class Zadanie123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Prosze Podać liczbę do skonwertowania na łańcuch znaków: ");
        double number = scanner.nextDouble();
        String numberAsString = String.valueOf(number);
        System.out.println("Liczba jako łańcuch znaków: " + numberAsString);
        
        System.out.print("Podaj łańcuch znaków do skonwertowania na liczby: ");
        String input = scanner.next();
        
        try {
            int intNumber = Integer.parseInt(input);
            long longNumber = Long.parseLong(input);
            float floatNumber = Float.parseFloat(input);
            double doubleNumber = Double.parseDouble(input);
            
            System.out.println("Test klasy matematycznej: ");
            System.out.println("Dla int: " + intNumber);
            System.out.println("Dla long: " + longNumber);
            System.out.println("Dla float: " + floatNumber);
            System.out.println("Dla double: " + doubleNumber);

            System.out.println("Operacje matematyczne:");
            System.out.println("Pierwiastek kwadratowy z " + doubleNumber + ": " + Math.sqrt(doubleNumber));
            System.out.println("Sinus liczby " + doubleNumber + ": " + Math.sin(doubleNumber));
            System.out.println("Cosinus liczby " + doubleNumber + ": " + Math.cos(doubleNumber));
            System.out.println("Wartość bezwzględna z " + doubleNumber + ": " + Math.abs(doubleNumber));
        } catch (NumberFormatException e) {
            System.out.println("Nie można skonwertować podanego łańcucha znaków na liczby.");
        }
        
        scanner.close();
    }
}