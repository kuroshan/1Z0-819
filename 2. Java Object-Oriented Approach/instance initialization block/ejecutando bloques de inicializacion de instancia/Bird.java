public class Bird {

    public static void main(String[] args) {

        //NO es bloque de inicializacion de instancia porque esta dentro de un metodo
        { 
            System.out.println("Feathers"); 
        }
    }

    //bloque de inicializacion de instancia
    { 
        System.out.println("Snowy");
    }

}