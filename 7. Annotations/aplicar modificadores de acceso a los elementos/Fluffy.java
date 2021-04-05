public @interface Fluffy {
    int cuteness(); //DEFAULT IS PUBLIC AND ABSTRACT
    public abstract int softness() default 11;
    protected Material material(); //DOES NOT COMPILE
    private String friendly(); //DOES NOT COMPILE
    final boolean isBunny(); //DOES NOT COMPILE
}
