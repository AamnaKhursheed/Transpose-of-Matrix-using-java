import java.util.Scanner;

public class tuna{
    public void transposematrix() {
        Scanner sc = new Scanner(System.in);
        int matrix[][]=new int[10][10];

        int m,n;
        System.out.print("Enter the Rows of the matrix : ");
        m=sc.nextInt();
        System.out.print("Enter the Columns of the matrix : ");
        n=sc.nextInt();
        System.out.println("Enter the Matrix Elements . . . : ");
        for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
        matrix[i][j]=sc.nextInt();
        }
        }
        int transpose[][]=new int [10][10];
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
        transpose[j][i] = matrix[i][j];
        }
        }
        System.out.println("Transpose of the given number is :");

        for(int i=0; i<m; i++) {
        for(int j=0; j<n;j++) {
        System.out.printf("%d\t",transpose[i][j]);
        }
        System.out.println();
        }
        }

        }