public class MusicTest3 {
    public static void tune(Instrument i) {
        i.play(new Note(" Middle A"));
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