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
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int zc = 0, oc = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                zc++;
            else if (arr[i] == 1)
                oc++;
        }
        System.out.println("zc = " + zc);
        System.out.println("oc = " + oc);

        sc.close();
    }
}
