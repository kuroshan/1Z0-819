public class Eagle extends Bird {
    
    public int fly(int height) { //SOBRECARGA
        System.out.println("Bird is flying at "+height+" meters");
        return height;
    }

    /*
    public void eat(int food) { //SOBREESCRITURA
        System.out.println("Bird is eating "+food+" units of food");
    }
     */

    public int eat(int food) { //DOES NOT COMPILE
        System.out.println("Bird is eating "+food+" units of food");
        return food;
    }

}
