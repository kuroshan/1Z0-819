public class Warm implements IsWarmBlooded, IsColdBlooded {

    @Override
    public boolean hasScales() {
        return false;
    }
    
    @Override
    double getTemperature() {//DOES NOT COMPILE: attempting to assign weaker access privileges; was public
        return 0;
    }
    
}
