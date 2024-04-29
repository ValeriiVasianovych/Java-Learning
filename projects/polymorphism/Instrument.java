public class Instrument {
    public void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }
    
    public String what() {
        return "Instrument";
    }
    
    public void adjust() {
        System.out.println("Adjusting instrument");
    }
}
