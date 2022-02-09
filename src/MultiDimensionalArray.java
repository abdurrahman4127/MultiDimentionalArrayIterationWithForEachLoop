/*
array :  dataType[] arrayName = new dataType[size];
array : arrayName = new dataType[]{arrayElements};
Jagged/Irregular Array : dataType[][] arrayName = new dataType[size][size];
3D Array : datatype [][][] arrayName = {{{1,2},{3,4,5,6},{7,8,9}},{{1,2},{3,4,5,6},{7,8,9}}};
*/

public class MultiDimensionalArray {
    public static void main(String[] args)
    {
    /*  printing :
        1 2
        3 4 5 6
        7 8 9
    */

        // Jagged array
        int[][] array = {{1,2}, {3,4,5,6}, {7,8,9}};

        for (int i=0; i<array.length; i++) {  // size of 1st dimension
            for (int j=0; j<array[i].length; j++) { // size of rest of dimension
                System.out.printf("%d ",array[i][j]);
            }
            System.out.println();
        }



        // just declare variable
        int[][] a;
        a = new int[3][];      //finding row ; must fill out 1st []
        a[0] = new int[]{1,2};
        a[1] = new int[]{3,4,5,6};
        a[2] = new int[]{7,8};

        for (int i=0; i<a.length; i++) {  // size of 1st dimension
            for (int j=0; j<a[i].length; j++) { // size of rest of dimension
                System.out.printf("%d ",a[i][j]);
            }
            System.out.println();
        }



        //3D array : look for the curly braces
        int [][][] A3 = {{{1,2},{3,4,5,6},{7,8,9}},{{1,2},{3,4,5,6},{7,8,9}}};
        System.out.println("length of 'A3' = " + A3.length);             // 2
        System.out.println("length of 'A3[0]' = " + A3[0].length);       // 3
        System.out.println("length of 'A3[0][1]' = " + A3[0][1].length); // 4
        System.out.println("length of 'A3[1][2][2]' = " + A3[1][2][2]);  // 9
    }
}
