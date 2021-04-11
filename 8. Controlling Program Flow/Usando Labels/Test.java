public class Test {
    public static void main(String[] args) {
        
        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};

        OUTER_LOOP: for (int[] mySimpleArray : myComplexArray) {
            INNER_LOOP: for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.println(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }
    }
}
