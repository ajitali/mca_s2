public class matrixaddmanualinput {
    /*
     * This program adds two matrices of size 3x4. It assumes that the
     *  input matrices are of size 3x4.
     */

    // Function to add two matrices
    static void addMatrices(int mat1[][], int mat2[][]) {
        int result[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println("The resultant matrix is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Driver method
    public static void main(String args[]) {
        int mat1[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10,  11, 12}};
        int mat2[][] = {{13, 14, 15, 16}, {17, 18, 19, 20}, {21, 22, 23, 24}};

        System.out.println("First Matrix");
        printMatrix(mat1);
        System.out.println("\nSecond Matrix");
        printMatrix(mat2);
        System.out.println("\nAdding two Matrices:\n");
        addMatrices(mat1, mat2);
    }

    // A utility function to print a matrix
    static void printMatrix(int mat[][]) {
        for (int i = 0; i < 3; i++) {   
            for (int j = 0; j < 4; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}   

