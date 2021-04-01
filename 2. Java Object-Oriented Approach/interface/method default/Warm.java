public class Warm implements IsWarmBlooded, IsColdBlooded {

    @Override
    public boolean hasScales() {
        return false;
    }
    
    @Override
    public double getTemperature() {//esta obligado a sobreescribir por tuplicidad de metodos default en las interfaces
        return 0;
    }
    
}
