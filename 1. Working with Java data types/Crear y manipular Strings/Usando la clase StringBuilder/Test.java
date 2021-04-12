public class Test {
    public static void main(String[] args) {
        String alpha = "";
        for (char current = 'a'; current <= 'z'; current++)
            alpha += current; //CREA 27 OBJETOS
        System.out.println(alpha);
        
        StringBuilder alphaSB = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++)
            alphaSB.append(current); //CREA SOLO UN OBJETO
        System.out.println(alphaSB);
    }
}
