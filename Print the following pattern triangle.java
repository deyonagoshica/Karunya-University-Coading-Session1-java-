import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,rows,colm;
        n=sc.nextInt();
        for(rows=1;rows<=n;rows++){
            for (colm=1;colm<=rows;colm++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
