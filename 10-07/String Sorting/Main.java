import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        String key = sc.nextLine();
        
        String result = " ";
        
        for( int  i =0; i < key.length(); i++){
            char ch = key.charAt(i);
            
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == ch){
                    result += ch;
                }
            }
        }
        
        System.out.println(result);
    }
}
