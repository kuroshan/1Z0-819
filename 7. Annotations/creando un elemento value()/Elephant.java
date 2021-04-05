public abstract class Elephant {
    @Injured("Legs") public void fallDown(){}
    @Injured(value="Legs") public abstract int trip();
    @Injured String injuries[];
}
