public class Example1 {
    
    private void printZooInfo(boolean isWeekend) {
        final int giraffe = 5;
        final long lemur;
        if(isWeekend) lemur = 5;
        giraffe = 3; //DOES NOT COMPILE: cannot assign a value to final variable giraffe
        System.out.println(giraffe+""+lemur); //DOES NOT COMPILE: variable lemur might not have been initialized

        final StringBuilder cobra = new StringBuilder();
        cobra.append("Hssssssss");
        cobra.append("Hssssss!!!!");

        cobra = new StringBuilder(); //DOES NOT COMPILE: cannot assign a value to final variable cobra
    }
}
