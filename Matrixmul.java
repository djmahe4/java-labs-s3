import java.util.*;
public class Matrixmul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter order of first matrix:");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        System.out.println("Enter order of second matrix:");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        if (c1==r2){
            int[][] a=new int[r1][c1];
            int[][] b=new int[r2][c2];
            System.out.println("Enter elements of first matrix");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter elements of second matrix");
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    b[i][j]=sc.nextInt();
                }
            }
            int[][] c=new int[r1][c2];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c1;k++){
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("Resultant matrix is");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    System.out.print(c[i][j]+"\t");
                }
                System.out.println();
            }
        }
        else System.err.println("Impossible to compute");
        sc.close();
    }
}
