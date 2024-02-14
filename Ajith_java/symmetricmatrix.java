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
    void issymmetric()
    {
        int f=0;
        if(row==col)
        {
        for(int i=0;i<row;i++)
            for(int j=0;j<=i;j++)
                if(m[i][j] != m[j][i])
                {
                    f=1;
                    break;
                }
        if(f==0)
            System.out.println("The matrix is symmetric.");
        else
            System.out.println("The matrix is not symmetric.");
        }
        else
        System.out.println("The matrix is not squarematrix so not symmetric.");
    
    }
}


public class symmetricmatrix {
    public static void main(String[] args) {
        matrix m=new matrix();
        System.out.println("Enter the matrix : ");
        m.read();
        System.out.println("The matrix is : ");
        m.display();
        m.issymmetric();
    }
}
