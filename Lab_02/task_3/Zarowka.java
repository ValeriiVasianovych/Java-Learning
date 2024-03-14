public class Zarowka {
    // Metoda zapalZarowke
    public void zapalZarowke() {
        System.out.println("Żarówka zapalona");
    }

    // Metoda zgasZarowke
    public void zgasZarowke() {
        System.out.println("Żarówka zgaszona");
    }

    // Metoda rozjasnijZarowke
    public void rozjasnijZarowke() {
        System.out.println("Żarówka rozjaśniona");
    }

    // Metoda przyciemnijZarowke
    public void przyciemnijZarowke() {
        System.out.println("Żarówka przyciemniona");
    }

    // Metoda main do testowania funkcji
    public static void main(String[] args) {
        Zarowka zarowka = new Zarowka();
        
        zarowka.zapalZarowke();
        zarowka.rozjasnijZarowke();
        zarowka.przyciemnijZarowke();
        zarowka.zgasZarowke();
    }
}
