//Which of the following code snippets about var compile without issue when used in a method? (Choose all that apply.)
public class Question {

    public void test() {
        var spring = null;
        var fall1 = "leaves";
        var evening = 2; evening = null;
        var night = new Object();
        var day = 1/0; //COMPILE, BUT DOESN'T RUN AT RUNTIME for java.lang.ArithmeticException
        var winter = 12, cold;
        var fall2 = 2; autumn = 2;
        var morning = ""; morning = null;
    }

}