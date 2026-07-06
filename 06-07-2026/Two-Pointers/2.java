//Given a string in which the same character occurs in many consecutive character elements. Task is to find the characters that have EVEN frequency and are consecutive. dusplay the sum of every frequency count.

//Solution

import java.util.*;

public class EVENCOUNT {
    public static int evenFrequencySum(String str){
        int i = 0;
        int sum = 0;

        while (i<str.length()){
            int count = 1;
            int j = i+1;

            while(j < str.length() && str.charAt(i) == str.charAt(j)){
                count++;
                j++;
            }

            if(count % 2 == 0){
                sum += count;
            }

            i=j;
        }

        return sum;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String z = sc.nextLine();
        System.out.println(evenFrequencySum(z));
    }
    
}
