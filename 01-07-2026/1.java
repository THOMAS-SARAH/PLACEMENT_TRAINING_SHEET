//01-07-26
//basics of java

//Alice and Bob pizza question - total no. of pizzas orders with distinct flavours
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of pizzas");
        int n = sc.nextInt();  // total number of pizzas
        System.out.println("Enter the number of distinct flavours of pizzas");
        int k = sc.nextInt();  // no. of distinct flavours of pizza

        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt(); // enter the sequence of the distict flavours ordered

        if (k == 1) {
            System.out.println(0);
            return;
        }

        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, ans = 0;

        for (int right = 0; right < n; right++) {
            map.put(a[right], map.getOrDefault(a[right], 0) + 1);

            while (map.size() > k - 1) {
                map.put(a[left], map.get(a[left]) - 1);
                if (map.get(a[left]) == 0)
                    map.remove(a[left]);
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        System.out.println(ans);
    }
}