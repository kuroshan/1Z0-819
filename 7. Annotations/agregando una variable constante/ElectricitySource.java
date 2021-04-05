public @interface ElectricitySource {
    public int voltage();
    int MIN_VOLTAGE = 2; //DEFAULT IS PUBLIC, STATIC AND FINAL
    public static final int MAX_VOLTAGE = 18;
}
