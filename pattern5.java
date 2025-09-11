import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            int num;
            if (row % 2 == 1) { 
                num = 1;
            } else {
                num = 2; 
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(num);
                num += 2;
            }
            System.out.println();
        }
    }
}
