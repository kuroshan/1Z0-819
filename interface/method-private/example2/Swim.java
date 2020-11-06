public interface Swim {

    private static void breathe(String type) {
        System.out.println("Inhale");
        System.out.println("Perform stroke: " + type);
        System.out.println("Exhale");
    }

    static void butterfly() {
        breathe("butterfly");
    }

    static void freeStyle() {
        breathe("freeStyle");
    }

    default void backstroke() {
        breathe("backstroke");
    }

    private void breaststroke() {
        breathe("breaststroke");
    }
    
}
