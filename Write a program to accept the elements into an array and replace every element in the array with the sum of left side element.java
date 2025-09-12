import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int sum = 0;      
        System.out.print("0");
        for (int i = 0; i < n - 1; i++) {
            int num = sc.nextInt();
            sum = sum + num;    
            System.out.print(" " + sum);
        }
        sc.close();
    }
}
