public class Product implements Comparable<Product> {

    private int id;
    private String name;

    public int hashCode() { return id; }

    //NO HAY CONSISTENCIA CON compareTo()
    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) return false;
        var other = (Product) obj;
        return this.id == other.id;
    }

    //NO HAY CONSITENCIA CON equals()
    public int compareTo(Product obj) {
        return this.name.compareTo(obj.name);
    }
    
}
