public class River {
    int Depth = 1;
    float temp = 50.0;
    public void flow() {
        for (int i = 0; i < 1; i++) {
            int depth = 2;
            depth++;
            temp--;
        }
        System.out.println(depth);
        System.out.println(temp); }
    public static void main(String[] args) {
        new River().flow();
    } }
//Which statements about the following class are true? (Choose all that apply.)