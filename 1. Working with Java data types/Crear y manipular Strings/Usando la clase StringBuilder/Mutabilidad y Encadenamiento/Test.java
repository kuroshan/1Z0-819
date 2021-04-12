public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle"); //start+middle

        StringBuilder same = sb.append("+end"); //start+middle+end

        System.out.println(sb.toString()); //start+middle+end
        System.out.println(same.toString()); //start+middle+end





        StringBuilder a = new StringBuilder("abc");
        StringBuffer b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a); //abcdefg
        System.out.println("b=" + b); //abcdefg
    }
}
