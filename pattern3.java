import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, rows, col;
        n = sc.nextInt();
        for (rows = 1; rows <= n; rows++) {
            int val = (rows % 2 == 1) ? 1 : 0;
            for (col = 1; col <= n; col++) {
                System.out.print(val);
                val = 1 - val;
            }
            System.out.println();
        }
    }
}
