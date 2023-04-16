import java.util.HashMap;

/*Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]] */

import java.util.*;

public class group_anagrams {

    public  static List<List<String>>isAnagram(String[]strs){
        List<List<String>> A = new ArrayList<>();
        if(strs.length ==0)return A;

        HashMap< String, List<String>> map = new HashMap<>();
        
        for(String s : strs)
        {
            int[] hash = new int[26];
            for(char c : s.toCharArray())
            {
                hash[c-'a']++;
            }

            String key = new String(Arrays.toString(hash));
            map.computeIfAbsent(key, k->new ArrayList<>());
            map.get(key).add(s);
        }    
    

        A.addAll(map.values());
        return A;
    }

    
    public static void main(String[] args) {
         String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(isAnagram(strs));


    }
}
