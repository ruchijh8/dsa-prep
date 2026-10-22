package arrays;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram{

    public static void main(String[] args) {

        String s; String t;
        boolean result;

        s = "cat"; t="car";
        result = isAnagramUsingHashMapUnicode(s,t);
        System.out.println(result);


        s = "cat"; t="tac";
        result = isAnagramUsingHashMapUnicode(s,t);
        System.out.println(result);


        s = "aa"; t="bb";
        result = isAnagramUsingHashMapUnicode(s,t);
        System.out.println(result);

        s = "a"; t="ab";
        result = isAnagramUsingHashMapUnicode(s,t);
        System.out.println(result);


        s = "é"; t="é";
        result = isAnagramUsingHashMapUnicode(s,t);
        System.out.println(result);
        result = isAnagram(s,t);
        System.out.println(result);
    }

    public static boolean isAnagramUsingHashMapUnicode(String s, String t){


        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        if(sArray.length != tArray.length)
            return false;

        Map<Character, Integer> countMap = new HashMap<>();

        for (char sCharData : sArray) {
//            countMap.put(sCharData,  countMap.getOrDefault(sCharData, 0) + 1);
            countMap.merge(sCharData, 1, Integer::sum);
        }

        for (char cCharData : tArray){
//            countMap.put(cCharData, countMap.getOrDefault(cCharData,0) - 1);
                countMap.merge(cCharData, -1, Integer::sum);

            if (countMap.get(cCharData) < 0)
                return false;

        }

        return true;
    }

    public static boolean isAnagram(String s, String t){

        int[] charArray = new int[26];
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        if(sArray.length != tArray.length)
            return false;

        for (char sCharData : sArray) {
            charArray[sCharData - 'a']++;
        }

        for (char cCharData : tArray){
            charArray[cCharData - 'a']--;

            if(charArray[cCharData - 'a'] == -1)
                return false;
        }

        return true;
    }

}