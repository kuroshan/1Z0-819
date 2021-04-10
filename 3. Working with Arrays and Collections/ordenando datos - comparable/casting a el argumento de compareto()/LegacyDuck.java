public class LegacyDuck implements Comparable {
    private String name;
    public int compareTo(Object obj) {
        LegacyDuck d = (LegacyDuck) obj; //cast because no generic
        return name.compareTo(d.name);
    }
    
}
