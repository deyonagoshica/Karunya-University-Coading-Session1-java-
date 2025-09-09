import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String[] parts = date.split("/");
        if (parts.length == 3) {
            int dd = Integer.parseInt(parts[0]);
            int mm = Integer.parseInt(parts[1]);
            int yyyy = Integer.parseInt(parts[2]);
            boolean isValid = true;
            if (yyyy < 1900 || yyyy > 9999) {
                isValid = false;
            } else if (mm < 1 || mm > 12) {
                isValid = false;
            } else {
                int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
                if ((yyyy % 4 == 0 && yyyy % 100 != 0) || (yyyy % 400 == 0)) {
                    daysInMonth[1] = 29;
                }
                if (dd < 1 || dd > daysInMonth[mm - 1]) {
                    isValid = false;
                }
            }
            if (isValid) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Invalid");
        }
    }
}
