import java.util.ArrayList;

public class Nightingale {

    @SuppressWarnings("deprecation")
    public void wakeUp() { SongBird.sing(10); }

    @SuppressWarnings("unchecked")
    public void goToBed() { SongBird.chirp(new ArrayList()); }

    public static void main(String[] args) {
        var birdy = new Nightingale();
        birdy.wakeUp();
        birdy.goToBed();
    }
}
