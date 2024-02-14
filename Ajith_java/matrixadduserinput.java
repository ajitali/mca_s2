import java.util.Scanner;
class matrix{
    int row,col;
    int[][] m;
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        row =sc.nextInt();
        System.out.println("Enter number of columns:");
        col =sc.nextInt();
        m = new int[row][col];
        System.out.println("Enter elements of the matrix: ");
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                m[i][j]=sc.nextInt();
    }
    void  display()
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
                System.out.print(m[i][j]+" ");
            
            System.out.println();
        }
    }
    void add(matrix a,matrix b)
    {
        if((a.row==b.row) && (a.col == b.col))
        {
            row = a.row;
            col = a.col;
            m = new int[row][col];
            for(int i=0;i<row;i++)
                for(int j=0;j<col;j++)
                    m[i][j] = a.m[i][j] + b.m[i][j];
        }
        else
            System.out.println("Matrices are not compatible to add!");
    }
}
public class matrixadduserinput {
    public static void main(String[] args) {
        matrix m1=new matrix();
        matrix m2=new matrix();
        matrix m3=new matrix();
        System.out.println("Enter the first matrix : ");
        m1.read();
        System.out.println("Enter the second matrix : ");
        m2.read();
        System.out.println("The first matrix is : ");
        m1.display();
        System.out.println("The second matrix is : ");
        m2.display();
        System.out.println("Sum of two matrix is : ");
        m3.add(m1,m2);
        m3.display();
    }
}
