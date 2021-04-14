public class Test {
    public static void main(String[] args) {
        
        int[][] vars1; //2D array
        int vars2 [][]; //2D array
        int[] vars3[]; //2D array
        int vars4 [], space [][]; //a 2D AND a 3D array



        

        int [][] args2 = new int[4][];
        args2[0] = new int[5];
        args2[1] = new int[3];





        int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.println(twoD[i][j] + " ");
                System.out.println();
            }
        }

        for (int[] inner : twoD) {
            for (int num : inner)
                System.out.println(num + " ");
            System.out.println();
        }

    }
}
