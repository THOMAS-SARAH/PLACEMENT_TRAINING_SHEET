import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // amount of money
        int r1 = sc.nextInt(); // plastic bottle cost
        int r2 = sc.nextInt(); // glass bottle cost
        int r3 = sc.nextInt(); // refund on glass bottle

        int lc = 0; // milk litre count

        if (r1 < (r2 - r3)) {   // Plastic bottle is cheaper
            lc = n / r1;
        } 
        else if (n >= r2) {     // Use glass bottle
            while (n >= r2) {
                n = n - r2 + r3;
                lc++;
            }
        } 
        else {                  // Can't afford glass bottle
            lc = n / r1;
        }

        System.out.println(N);
    }
}
