public interface IsWarmBlooded {

    /** 
    * por defecto todos los metodos son de acceso "public"
    */

    boolean hasScales();

    default double getTemperature() { //no puede ser abstract, final, static
        return 10.0;
    }

}