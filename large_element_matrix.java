//Program to find the largest element in an NXN matrix.
import java.util.*;
import java.io.*;
class large_element_matrix {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter the number of entries:");
        int n = obj.nextInt();
        int[][] a=new int[10][10];
        int i,j ;
        
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                {
                    System.out.println("Enter the [" + (i)+"]["+(j)+"] element :");
                 a[i][j]=obj.nextInt();
                }
        int largest=a[0][0];
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                {
                     if(a[i][j]>largest)
                        largest=a[i][j];
                }
        System.out.println("largest:"+largest);        
    }
}
