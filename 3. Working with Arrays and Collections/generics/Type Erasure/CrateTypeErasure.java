public class CrateErasure {
    
    private Object contents;

    public Object emptyCrate(){
        return contents;
    }

    public void packCrate(Object contents) {
        this.contents = contents;
    }

    static class Robot {}

    public static void main(String[] args) {
        CrateErasure crate = new CrateErasure();
        Robot r = crate.emptyCrate(); //The compiler turns it into the following
                                      //Robot r = (Robot) crate.emptyCrate();

    }

}
