import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        sc.close();
        int quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;    
        }

        System.out.println(quotient); }
}
