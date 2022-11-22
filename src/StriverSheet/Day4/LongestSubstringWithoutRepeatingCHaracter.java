package StriverSheet.Day4;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCHaracter {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static   int lengthOfLongestSubstring(String s) {

        int i=0;
        int j=0;

        HashMap<Character,Integer> map=new HashMap<>();
        int max_length=0;

        while (j<s.length()){
            map.put(s.charAt(j),1+map.getOrDefault(s.charAt(j),0));
            if(map.get(s.charAt(j))==1){
                max_length=Math.max(max_length,(j-i+1));
                j++;
            }else {
                while(i<=j && s.charAt(i)!=s.charAt(j)){
                    map.remove(s.charAt(i));
                    i++;
                }
                if(i<=j){
                    map.remove(s.charAt(i));
                    i++;
                }

            }
        }

        return max_length;
    }
}
