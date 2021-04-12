public class Test {
    
}

class Mutable {
    private String s;
    public void setS(String newS) { s = newS; } //Setter makes it mutable
    public String getS() { return s; }
}

final class Immutable {
    private String s = "name";
    public String getS() { return s; }
}
