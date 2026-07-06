//01-7-2026
//convert the time from 24 hr clock to standard 12hr clock

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a*b;
        System.out.println(c);
        int d = c%12;   // logic used is mod operator in product
        System.out.println(d);
    }
}