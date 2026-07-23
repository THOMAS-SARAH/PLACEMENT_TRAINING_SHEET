public class Main{
    public static void main(String[] args){
        String b = "132";
        int n= 8;
        
        int[] arr = {1,0,3,4,5,6,7,8};
        StringBuilder sb = new StringBuilder(b);
        System.out.println(sb.toString());
        for(int i=0; i<sb.length();i++){
            char ch = sb.charAt(i);
            int d = ch -'0';
            if(arr[d]>d){
                d=arr[d];
                sb.setCharAt(i,(char)(d+'0'));
                
            }
            else{
                break;
            }
        }
        
        System.out.println(sb.toString());
    }
}
