//10. Program to find whether a string is palindrome or not.
import java.util.*;
import java.io.*;
class palindrome {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        String reverseStr = "";
        System.out.println("Enter the number of entries:");
        String str = obj.nextLine();
        int strLength = str.length();
    for (int i = (strLength - 1); i >=0; --i) {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(str + " is a Palindrome String.");
    }
    else {
      System.out.println(str + " is not a Palindrome String.");
    }
    }
}
