public class PrintTheOne {

    public static void main(String[] args) {
        System.out.println("begin,");
        OnlyOne fisrtCall = OnlyOne.ONCE; //prints contructing,
        OnlyOne secondCall = OnlyOne.ONCE; //doesn't print anything
        System.out.println("end");
    }
    
}
