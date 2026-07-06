//01-06-2026
/*  logic of the code
n = 4 
split it in different combinations like
1+1+1+1
2+2
3+1

now return the product from the combination which gives maximum product*/


import java.util.Scanner;

public class Main {

    static int maxProduct(int n) {
     
        return helper(n, false);
    }

    static int helper(int n, boolean isSplit) {
        if (n == 0)
            return 1;

        int max = isSplit ? n : 0;

        for (int i = 1; i < n; i++) {
            max = Math.max(max, i * helper(n - i, true));
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Maximum Product = " + maxProduct(n));
    }
}