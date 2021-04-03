import java.io.FileInputStream;
import java.io.InputStream;

public class Test {

    public static void main(String[] args) {
        
        InputStream is1 = new FileInputStream("test.tmp");

        var is2 = new FileInputStream("test.tmp");

    }
    
}
