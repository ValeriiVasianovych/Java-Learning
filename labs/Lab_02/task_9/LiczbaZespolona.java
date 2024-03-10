public class LiczbaZespolona {
    private double re; // Część rzeczywista
    private double im; // Część urojona

    public LiczbaZespolona(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public double obliczModul() {
        return Math.sqrt(re * re + im * im);
    }

    public double obliczKat() {
        return Math.atan2(im, re);
    }

    public void wyswietlLiczbeZesp() {
        if (im >= 0) {
            System.out.println(re + " + " + im + "i");
        } else {
            System.out.println(re + " - " + (-im) + "i");
        }
    }

    public static void main(String[] args) {
        LiczbaZespolona liczba = new LiczbaZespolona(3, 4);
        liczba.wyswietlLiczbeZesp();
    }
}
