package examples.if_else;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = value.nextLine();
        
        if (name.equals("Peter")) {
            System.out.println("Hello Peter!");
          } else {
            System.out.println("It's not Peter!");
        }
    } 
}
