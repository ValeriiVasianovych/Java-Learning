import java.util.Scanner;

// Deklaracja klasy numbers.
public class numbers {

    // Definiowanie metody main.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tworzenie obiektu Scanner.
        System.out.print("Podaj liczbę N: ");
        int N = scanner.nextInt();

        // Wczytywanie liczby N.
        if (N <= 0) {
            System.out.println("N musi być liczbą dodatnią.");
            return;
        }

        // Sprawdzenie, czy N jest dodatnie.
        System.out.println("Podaj " + N + " liczb:");
        
        // Wyświetlenie komunikatu o podaniu N liczb.
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int liczba = scanner.nextInt();
            if (liczba > max) {
                max = liczba;
            }
            System.out.println("Największa do tej pory: " + max);
        }
        // Inicjalizacja zmiennej max na minimalną wartość int.
        System.out.println("Największa liczba to: " + max);
        
        scanner.close();
    }
}