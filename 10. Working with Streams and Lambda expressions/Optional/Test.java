import java.util.Optional;

public class Test {

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score : scores) sum += score;
        return Optional.of((double)sum/scores.length);
    }

    public static void main(String[] args) {
        System.out.println(average(90, 100)); //Optional[95.0]
        System.out.println(average()); //Optional.empty

        Optional<Double> opt = average(90, 100);
        if (opt.isPresent())
            System.out.println(opt.get()); //95.0
        
        Optional<Double> optExcep = average(); 
        System.out.println(optExcep.get()); //RUNTIME: NoSuchElementException: No value present

        



        String value = "test";
        Optional o1 = (value == null) ? Optional.empty() : Optional.of(value);

        Optional o2 = Optional.ofNullable(value);





        //


    }
}
