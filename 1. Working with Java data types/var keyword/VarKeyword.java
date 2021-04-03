//VAR ES SOLO PARA VARIABLES LOCALES
//VAR TIENE QUE INICIALIZARSE EN LA MISMA LINEA DONDE FUE DECLARADO
public class VarKeyword {

    var tricky = "Hello"; //DOES NOT COMPILE: is not allowed here

    {
        var a; //DOES NO COMPILE
        var b = 1;
    }

    public void whatTypeAmi() {
        var name = "Hello";
        var size = 7;
    }

    public void reassignment() {
        var number = 7; //INFIERE QUE ES DE TIPO INT
        number = 4;
        number = "five"; //DOES NOT COMPILE: incompatible types: String cannot be converted to int
    }

    public void integers() {
        var apples = (short)10;

        apples = (byte)5; //siempre que el tipo de data (IZQUIERDA > DERECHA) se promueve al de la IZQUIERDA
                          //para el ejemplo apples se mantiene en short

        apples = 1_000_000; //DOES NOT COMPILE: incompatible types: possible lossy conversion from int to short
    }

    public void doesThisCompile(boolean check) {
        var question; //DOES NOT COMPILE: cannot infer type for local variable question
        question = 1;
        var answer; //DOES NOT COMPILE: cannot infer type for local variable answer
        if (check) {
            answer = 2;
        } else {
            answer = 3;
        }
        System.out.println(answer);
    }

    public void twoTypes() {
        int a, var b = 3; //DOES NOT COMPILE
        var n = null; //DOES NOT COMPILE
        var a = 2, b = 3; //DOES NOT COMPILE: 'var' is not allowed in a compound declaration
    }

    public void typeReference() {
        var n = "myData";
        n = null;
        var m = 4;
        m = null; //DOES NOT COMPILE: incompatible types: <null> cannot be converted to int
        var o = (String)null; //SI ESTA PERMITIDO EL CASTING ESPLICITO en la declaracion y asignacion
    }

    public int addition(var a, var b) { //DOES NOT COMPILE: a y b son parametros de metodo, no variables locales
        return a + b;
    }

    

}