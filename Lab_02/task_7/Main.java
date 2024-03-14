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

     public void setX(double x) {
         this.x = x;
     }

     public double getY() {
         return y;
     }

     public void setY(double y) {
         this.y = y;
     }
}

public class Main {
    public static void main(String[] args) {
        Punkt punkt = new Punkt(3.5, 4.2);
        
        punkt.setX(5.7);
        punkt.setY(8.9);
        
        System.out.println("Współrzędna x: " + punkt.getX());
        System.out.println("Współrzędna y: " + punkt.getY());
    }
}
