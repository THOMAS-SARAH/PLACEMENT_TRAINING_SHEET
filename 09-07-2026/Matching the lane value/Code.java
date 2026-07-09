// Online Java Compiler
// Use this editor to write, compile and run your Java code online

/* A simple algorithm for your code is:

### Algorithm

1. Start.
2. Read the inputs:

   * `n` (number of terms)
   * `a`, `b` (first arithmetic progression)
   * `c`, `d` (second arithmetic progression)
3. Repeat from `i = 0` to `n - 1`:

   * Calculate the current value of the first sequence:

     * `lane1 = b + (a × i)`
4. For each `lane1`, repeat from `j = 0` to `n - 1`:

   * Calculate the current value of the second sequence:

     * `lane2 = d + (c × j)`
5. Compare `lane1` and `lane2`.

   * If they are equal:

     * Print the common value.
     * Stop the program.
6. If no common value is found after checking all pairs:

   * Print `"No amount is same"`.
7. Stop.

### Time Complexity

* Outer loop runs **n** times.
* Inner loop runs **n** times for each outer iteration.
* Therefore, **Time Complexity = O(n²)**.
* **Space Complexity = O(1)** since only a few variables are used.

### Logic in Simple Words

* Generate every value of the first arithmetic sequence.
* Compare it with every value of the second arithmetic sequence.
* If both sequences contain the same value, print it immediately.
* If no common value exists after all comparisons, print `"No amount is same"`.
*/

import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt(); // no of elements
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            int lane1 = b + (a*i);
            
            for(int j = 0; j < n; j++){
                int lane2 = d+(c*j);
                
                if(lane1 == lane2){
                    System.out.println(lane1);
                    return;
                }    
                
            }
            
            
        }
        
        System.out.println("No ammount is same"); 
    }
}


// values for test case analysis

/*50
  20
  2
  9
  19

  82
  */
