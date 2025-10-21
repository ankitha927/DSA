import java.util.*;
public class WiORepeat {
    public static int remove(String s){
        int start=0,end=0,maxLen=0;
        HashSet<Character> set=new HashSet<>();
        while(end<s.length()){
            char ch=s.charAt(end);
            if(!set.contains(ch)){
                set.add(ch);
                end++;
                maxLen=Math.max(maxLen,end-start);
            }
            else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxLen;

    }

      public static void main(String[] args) {
        String s = "abcabcbb";
        int res = remove(s);
        System.out.println("Length of longest substring: " + res);
    }
}
