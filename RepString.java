import java.util.*;
public class RepString {
    public static int rep(String s,int k){
        int start=0,maxFreq=0,maxLen=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int end=0;end<s.length();end++){
            char ch=s.charAt(end);
            map.put(ch,map.getOrDefault(ch,0)+1);

            maxFreq=Math.max(maxFreq , map.get(ch));

            while((end - start+1)-maxFreq>k){
                char startch=s.charAt(start);
                map.put(startch,map.get(startch)-1);
                start++;
            }
             maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        int result = rep(s, k);
        System.out.println("Longest length: " + result);
    }
}
