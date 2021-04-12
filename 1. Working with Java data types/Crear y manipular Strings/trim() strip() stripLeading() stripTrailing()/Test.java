public class Test {
    public static void main(String[] args) {
        System.out.println("abc".strip()); //abc

        char ch = '\u2000';
        System.out.println(("\t a b c\n" + ch).trim()); //a b c
        System.out.println(("\t a b c\n" + ch).strip()); //a b c, elimina los unicodes (incluido los superiores a \u0020)
        Character c = '\u2000';
        String cs = c + "Saveji" + c;
        System.out.println("trim()  : "+cs.trim());
        System.out.println("strip() : "+cs.strip());  

        String text = " abc\t ";
        System.out.println(text.trim().length()); //3
        System.out.println(text.strip().length()); //3
        System.out.println(text.stripLeading().length()); //5, borra lo que esta al inicio
        System.out.println(text.stripTrailing().length()); //4, borra lo que esta al final
    }
}
