//Program to find the second largest element in an array.
import java.util.*;
import java.io.*;
class secondlargest {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter the number of entries:");
        int n = obj.nextInt();
        int a[]=new int[10];
        int i,j,temp ;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the " + (i+1)+ " element :");
            a[i]=obj.nextInt();
        }
        int b[]=new int[10];
        b=a;
        for(i=0;i<n-1;i++)
	        {for(j=0;j<n-i-1;j++)
		        {if (b[j]>b[j+1])
			    {temp=b[j];
			    b[j]=b[j+1];
			    b[j+1]=temp;
}}}      
