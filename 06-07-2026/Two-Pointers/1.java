//Given a string str, remove all occurrences of the character 'G' using the two-pointer technique. Modify the string in-place and print the resulting string.

//solution

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int r = 0;
        int w = 0;

        while(r< arr.length){
            if(r+1 < arr.length && arr[r] == 'E' && arr[r+1] == 'F'){
                r += 2; 
            }

            else if(arr[r] == 'G'){
                r++;
            }

            else{
                arr[w++] = arr[r++];
            }
        }

        System.out.print(new String (arr,0,w));
    }
}

