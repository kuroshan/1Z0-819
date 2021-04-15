import java.io.FileNotFoundException;
import java.io.IOException;

public class GalapagosTortoise extends Reptile {
    
    public void sleepInShell() throws FileNotFoundException { //CHECKED: extends from IOException
    }

    public void hideInShell() throws IllegalArgumentException { //UNCHECKED: extends from RuntimeException
    }

    public void exitInShell() throws IOException { //DOES NOT COMPILE: CHECKED: super from FileNotFoundException
    }

}
