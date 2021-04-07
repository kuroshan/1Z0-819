public class Test {
    
    public static void main(String[] args) {
    
        int owl = 5;
        int food;
        
        if (owl < 2) {
            food = 3;
        } else {
            food = 4;
        }
        System.out.println(food); //4
        
        food = owl < 2 ? 3 : 4;
        food = (owl < 2) ? 3 : 4;

        

        int stripes = 7;
        System.out.println((stripes > 5) ? 21 : "Zebra");
        int animal = (stripes < 9) ? 3 : "Horse"; //DOES NOT COMPILE



        int sheep = 1;
        int zzz = 1;
        int sleep = zzz<10 ? sheep++ : zzz++;
        System.out.println(sheep+","+zzz); //2,1

        sheep = 1;
        zzz = 1;
        sleep = zzz>=10 ? sheep++ : zzz++;
        System.out.println(sheep+","+zzz); //1,2
        
    }

}
