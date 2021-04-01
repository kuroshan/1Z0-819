public class CatMethodHide implements Walk, Run {

    public int getSpeed() {
        return 1;
    }

    public int getWalkSpeed() {
        return Walk.super.getSpeed();
    }

    public static void main(String[] args) {
        System.out.println(new CatMethodHide().getWalkSpeed());
    }
    
}
