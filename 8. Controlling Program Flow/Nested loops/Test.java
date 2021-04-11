public class Test {
    public static void main(String[] args) {
        
        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        for (int[] mySimpleArray : myComplexArray) {
            for (int i = 0; i < myComplexArray.length; i++) {
                System.out.println(mySimpleArray[i]+"\t");
            }
            System.out.println();
        }




        int hungryHippopotamus = 8;
        while (hungryHippopotamus > 0) {
            do {
                hungryHippopotamus -= 2;
            } while (hungryHippopotamus > 5);
            hungryHippopotamus--;
            System.out.println(hungryHippopotamus + ", ");
        }
    }
}
