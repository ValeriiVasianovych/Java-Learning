package labs.Lab_01.task_2;

public class main {
    public static void main(String[] args) {
        System.out.println("Liczba argumentów: " + args.length);
        System.out.println("Argumenty wywołania:");
        for (int i = 0; i < args.length; i++) {
            System.out.println((i+1) + ": " + args[i]);
        }
    }
}
