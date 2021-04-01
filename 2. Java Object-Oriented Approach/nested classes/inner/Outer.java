public class Outer { //Outer.class, Outer$Inner.class
    private String greeting = "Hi outer";

    protected class Inner {
        public int repeat = 3;
        private String greeting = "Hi inner";
        public void go() {
            for (int i = 0; i < repeat; i++) {
                System.out.println(greeting);
            }
        }
    }
    public void callInner() {
        Inner inner = new Inner();
        inner.go();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.callInner();
        
        Inner inner = outer.new Inner();
        inner.go();
    }
}