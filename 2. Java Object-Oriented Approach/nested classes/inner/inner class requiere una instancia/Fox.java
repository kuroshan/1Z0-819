public class Fox {
    private class Den {}
    public void goHome() {
        new Den();
    }
    public static void visirFriend() {
        new Den(); //DOES NO COMPILE: non-static variable this cannot be referenced from a static context
    }
}