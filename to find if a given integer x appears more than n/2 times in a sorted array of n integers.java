import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int count = 1, majority = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i-1]) count++;
            else count = 1;
            if (count > n/2) { majority = arr[i]; break; }
        }
        if (majority != -1) System.out.println("The majority element is : " + majority);
        else System.out.println("No majority element found in the array");
    }
}
