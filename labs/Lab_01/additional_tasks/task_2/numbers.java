import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Podaj liczbę N: ");
        int N = scanner.nextInt();
        
        if (N <= 0) {
            System.out.println("N musi być liczbą dodatnią.");
            return;
        }
        
        System.out.println("Podaj " + N + " liczb:");
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int liczba = scanner.nextInt();
            if (liczba > max) {
                max = liczba;
            }
            System.out.println("Największa do tej pory: " + max);
        }
        
        System.out.println("Największa liczba to: " + max);
        
        scanner.close();
    }
}
