public class MusicTest2 {
    public static void tune(Instrument i) {
        i.play(new Note("Middle B"));
    }
    public static void main(String[] args) {
        Instrument [] orchestra = new Instrument [] {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()
        };
        for (Instrument i : orchestra) {
            tune(i);
        }
    }
}
