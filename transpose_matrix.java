//7. Program to find transpose of a matrix.
import java.util.*;
import java.io.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter the number of entries:");
        int n = obj.nextInt();
        int[][] a=new int[10][10];
        int[][] c=new int[10][10];
        int i,j ;
        
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                {
                System.out.println("Enter the [" + (i)+"]["+(j)+"] element of matrix A :");
                 a[i][j]=obj.nextInt();
                }
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                {
                c[i][j]=a[j][i];
                }
        System.out.println("Transpose is:");
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                {
                    System.out.println("a["+i+"]["+j+"]:"+c[i][j]);
                }

    }
}
