public class Squirrel {

    private int weight;
    private String species;

    public Squirrel(int weight, String species) {
        this.weight = weight;
        this.species = species;
    }
    
    public int getWeight() {
        return weight;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString(){ return "{" + weight + ", " + species + "}"; }

}
