public class Produkt {
    private String nazwa;
    private double cena;
    private int iloscWMagazynie;

    public Produkt(String nazwa, double cena, int iloscWMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscWMagazynie = iloscWMagazynie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public int getIloscWMagazynie() {
        return iloscWMagazynie;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setIloscWMagazynie(int iloscWMagazynie) {
        this.iloscWMagazynie = iloscWMagazynie;
    }

    public void wyswietlInformacje() {
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Cena: " + cena + " PLN");
        System.out.println("Ilość w magazynie: " + iloscWMagazynie);
    }

    public void aktualizujStanMagazynowy(int nowaIlosc) {
        this.iloscWMagazynie = nowaIlosc;
    }

    public void sprzedaj(int ilosc) {
        if (ilosc <= iloscWMagazynie) {
            iloscWMagazynie -= ilosc;
            System.out.println("Sprzedano " + ilosc + " sztuk produktu " + nazwa);
        } else {
            System.out.println("Nie można sprzedać więcej produktu, niż jest dostępne w magazynie.");
        }
    }

    public static void main(String[] args) {
        Produkt produkt = new Produkt("Example", 100.0, 10);
        produkt.wyswietlInformacje();
    }
}
