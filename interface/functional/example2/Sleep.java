//NO es interface funcional
// no tiene metodo abstracto
public interface Sleep {

    private void snore() {

    }

    default int getZzz() {
        return 1;
    }

}