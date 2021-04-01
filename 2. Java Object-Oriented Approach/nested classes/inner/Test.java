public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.callInner();

        //Inner inner = outer.new Inner(); //error: cannot find symbol
        //inner.go();
    }
    
}
