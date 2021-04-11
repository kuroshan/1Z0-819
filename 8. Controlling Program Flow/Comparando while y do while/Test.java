public class Test {
    public static void main(String[] args) {
        int llama = 0;

        while (llama > 10) {
            System.out.println("Llama!");
            llama--;
        }

        if (llama > 10) {
            do {
                System.out.println("Llama!");
                llama--;
            } while (llama > 10);
        } else {
            llama++;
        }
    }
}
