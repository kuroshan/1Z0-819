public class Test {
    public static void main(String[] args) {
        String string = "animals";
        System.out.println(string.substring(3)); //mals
        System.out.println(string.substring(string.indexOf('m'))); //mals
        System.out.println(string.substring(3, 4)); //m
        System.out.println(string.substring(3, 7)); //mals
        System.out.println(string.substring(3, 3)); //empty string
        System.out.println(string.substring(3, 2)); //RUNTIME: StringIndexOutOfBoundsException: begin 3, end 2, length 7
        System.out.println(string.substring(3, 8)); //RUNTIME: StringIndexOutOfBoundsException: begin 3, end 8, length 7
    }
}
