private final interface Crawl { //DOES NOT COMPILE
    String distance;
    private int MAXIMUM_DEPTH = 100; //DOES NOT COMPILE
    protected abstract boolean UNDERWATER = false; //DOES NOT COMPILE

    private void dig(int depth); //DOES NOT COMPILE
    protected abstract double depth(); //DOES NOT COMPILE
    public final void surface(); //DOES NOT COMPILE
    
}
