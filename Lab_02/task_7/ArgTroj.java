public class ArgTroj {
    public static void main(String[] args) {
        int liczba = 10;
        
        String wynik = (liczba > 5) ? "Większa od 5" : "Mniejsza lub równa 5";
        
        System.out.println(wynik);
        
        int x = 20;
        int y = 30;
        int wieksza = (x > y) ? x : y;
        System.out.println("Większa liczba: " + wieksza);
    }
}