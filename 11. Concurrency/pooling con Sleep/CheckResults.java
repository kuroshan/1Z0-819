public class CheckResults {
    
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException{
        
        new Thread(() -> {
            for (int i = 0; i < 50000; i++) {
                CheckResults.counter++;
            }
        }).start();

        while (CheckResults.counter < 10000) {
            System.out.println("Not reached yet");
            Thread.sleep(1000);
        }
        System.out.println("Reached!");

    }

}
