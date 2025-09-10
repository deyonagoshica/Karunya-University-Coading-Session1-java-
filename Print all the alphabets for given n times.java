import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        } }
}
