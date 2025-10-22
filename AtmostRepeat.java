import java.util.*;
public class AtmostRepeat {
    public static String repeat(String s){
        HashSet<Character> set=new HashSet<>();
        int start=0;
        int maxLen=0;
        int maxStart=0;
        if (s == null || s.length() == 0) return "";
        for(int end=0;end<s.length();end++){
            char ch=s.charAt(end);
            while(set.contains(ch)){
                set.remove(s.charAt(start));
                start++;

            }
            set.add(ch);
            
            if(end-start+1>maxLen){
                maxLen=end-start+1;
                maxStart=start;
            }

            

        }
        return s.substring(maxStart,maxStart+maxLen);
        
    }
     public static void main(String[] args) {
        String s = "abcbde";
        String res = repeat(s);
        System.out.println("Longest substring without repeating: " + res);
    }
}
