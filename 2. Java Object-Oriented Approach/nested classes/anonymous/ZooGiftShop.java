public class ZooGiftShop {

    abstract class SaleTodayOnlyAbstract {
        abstract int dollarsOff();
    }

    interface SaleTodayOnlyInterface {
        int dollarsOff();
    }

    public int pay() {
        return admission(5, new SaleTodayOnlyAbstract() {//PARAMETER CLASS ANONYMOUS
                            int dollarsOff() { return 3;}
                        });
    }

    public int admission(int basePrice, SaleTodayOnlyAbstract saleA) {

        SaleTodayOnlyInterface saleI = new SaleTodayOnlyInterface() { //VARIABLE CLASS ANONYMOUS
            public int dollarsOff() { return 3;} //LA INTERFACE TIENE EL NIVEL DE ACCESO PUBLIC
        }; //Don't forget the semicolon!

        return basePrice - saleA.dollarsOff() - saleI.dollarsOff();
    }
}