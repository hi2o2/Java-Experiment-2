// Program to find the sum of elements in an array
Ans:
import java.util.*;
import java.io.*;
class aarraysum {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter the number of entries:");
        int n = obj.nextInt();
        int a[]=new int[10];
        int i ,sum=0;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the " + (i+1)+ " element :");
            a[i]=obj.nextInt();
            sum+=a[i];
        }
        System.out.println("\n Sum ="+sum);
    }
}
