import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int a, b;
        float x, y;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        x = sc.nextFloat();
        y = sc.nextFloat();
        System.out.println((a + b) + " " + (a - b));
        System.out.printf("%.1f %.1f", (x + y), (x - y));
        sc.close();
    }
}
