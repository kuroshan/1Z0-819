public class Mouse {

    final static int MAX_LENGTH = 1;

    int length;

    public void grow(int inches) {
        if (length < MAX_LENGTH) {
            int newSize = length + inches;

            length = newSize;
        }
    }

}