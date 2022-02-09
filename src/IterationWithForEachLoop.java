public class IterationWithForEachLoop {
    public static void main(String[] args)
    {
        // Jagged Array initialization

        int[][] arr; //declare
        arr = new int[2][]; //1st dimension size must
        arr[0] = new int[]{1,2};
        arr[1] = new int[]{3,4,5};

        // another one
        int [][]a = {{1,2},{3,4,5},{7,8,9}};

        //iterating with for-each loop
        for (int[] x: a) {     //data type : integer array 'int[] ; not 'int'
            for (int y: x) {   //data type : int
                System.out.printf("%d ",y);
            }
            System.out.println();
        }

        // 3D array initializing
        int [][][] a3 = {{{1,2},{3,4,5,6},{7,8,9}},{{1,2},{3,4,5,6},{7,8,9}}};

        for (int [][]x : a3) {      //data type - 2D array : int [][]
            for (int []y : x) {     //data type - 1D array : int[]
                for (int z : y) {   //data type : int
                    System.out.printf("%d ",z);
                }
                System.out.println();
            }
        }


        //iterating string with For-Each loop
        String[] str = {"AR","Nhi"};

        for (String s: str) {
            System.out.println(s);
        }
    }
}
