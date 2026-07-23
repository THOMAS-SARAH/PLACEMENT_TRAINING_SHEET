// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        
        int B = sc.nextLong();
        int N  = sc.nextInt();
        
        int[] zombies = new int[N];
        for(int i = 0; i< N; i++){
            zombies[i] = sc.nextInt(i);
        }
        Arrays.sort(zombies);
        
        long energy = B;

        for (int z : zombies) {
            if (energy < z) {
                System.out.println("NO");
                return;
            }
            energy -= (z % 2) + (z / 2); 
        }

        System.out.println("YES");*/
        
        int b = 10;
        int n = 6;
        int[] arr = {1,2,3,4,5,6};
        for(int i = 0; i < arr.length; i++){
            b-=(arr[i]%2)+(arr[i]/2);
            System.out.println(b);
        }
        if(b>0){
            System.out.println("YES");
        }
        else{
            System.out.println("No");
        }
        
        
    }
}


//OUTPUT
/*9
8
6
4
1
-2
No*/
