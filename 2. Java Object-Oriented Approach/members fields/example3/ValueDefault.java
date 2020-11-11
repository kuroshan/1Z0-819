public class ValueDefault {
    
    byte by;
    short sh;
    int in;
    long lo;
    float fl;
    double dou;
    char ch;
    String st;
    boolean bo;
    
    public static void main(String[] args) {
        ValueDefault vd = new ValueDefault();
        System.out.println(vd.by); //0
        System.out.println(vd.sh); //0
        System.out.println(vd.in); //0
        System.out.println(vd.lo); //0L : EQUIVALE A 0
        System.out.println(vd.fl); //0.0f : EQUIVALE A 0.0
        System.out.println(vd.dou); //0.0d : EQUIVALE A 0.0
        System.out.println(vd.ch); //'\u0000' : EQUIVALE A NUL
        System.out.println(vd.st); //null
        System.out.println(vd.bo); //false
    }


}