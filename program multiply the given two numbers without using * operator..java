import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int result = 0;
        for (int i = 0; i < Math.abs(b); i++) { 
            result += a;
        }
        if (b < 0) {
            result = -result;
        }

        System.out.println(result);
    }
}
