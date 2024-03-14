package labs.Lab_02.task_8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Podaj wartość współrzędnej x:");
        double x = scanner.nextDouble();
        
        System.out.println("Podaj wartość współrzędnej y:");
        double y = scanner.nextDouble();
        
        Punkt punkt = new Punkt(x, y);
        
        System.out.println("Współrzędna x: " + punkt.getX());
        System.out.println("Współrzędna y: " + punkt.getY());
        
        scanner.close();
    }
}

class Punkt {
     private double x;
     private double y;

     public Punkt(double x, double y) {
         this.x = x;
         this.y = y;
     }

     public double getX() {
         return x;
     }

     public double getY() {
         return y;
     }
}