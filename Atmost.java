import java.util.*;
public class Atmost {
    public static  int atmost(String s,int k){
        int start=0;
        int maxLen=0;
        HashMap<Character,Integer> map=new HashMap<>();

        for(int end=0;end<s.length();end++){
            char ch=s.charAt(end);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.size()>k){
                char startCh=s.charAt(start);
                map.put(startCh,map.get(startCh)-1);
                if(map.get(startCh)==0){
                    map.remove(startCh);
                }
                start++;
            }
            maxLen=Math.max(maxLen,end-start+1);

        }
        return maxLen;


    }
    
    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        int res = atmost(s, k);
        System.out.println("Length of longest substring: " + res);
    }
}
