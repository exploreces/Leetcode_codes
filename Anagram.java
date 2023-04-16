/*import java.util.*;
public class Anagram {

    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] store = new int[26];
        for(int i =0;i<s.length();i++)
{        store[s.charAt(i) - 'a']++;


    }

    for(int n : store) if (n!=0) {
        return false;
    }
    return true;
}


public static void main(String[] args) {
    String s = "agentleman";
    String t ="elegantman";
    System.out.print(isAnagram( s,  t));
}
}
*/
 /*import java.util.Arrays;

public class Anagram {
  
  public static boolean isAnagram(String s1, String s2) {
    // Remove all non-alphabetic characters and convert to lowercase
    String str1 = s1.replaceAll("[^a-zA-Z]", "").toLowerCase();
    String str2 = s2.replaceAll("[^a-zA-Z]", "").toLowerCase();
    
    // Check if the two strings are of different lengths
    if (str1.length() != str2.length()) {
      return false;
    }
    
    // Convert the strings to char arrays and sort them
    char[] charArray1 = str1.toCharArray();
    Arrays.sort(charArray1);
    char[] charArray2 = str2.toCharArray();
    Arrays.sort(charArray2);
    
    // Compare the sorted char arrays
    return Arrays.equals(charArray1, charArray2);
  }
  
  public static void main(String[] args) {
    String s1 = "Clint Eastwood";
    String s2 = "Old West Action";
    
    if (isAnagram(s1, s2)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}
*/

import java.util.*;
/**
 * Anagram
 */

public class Anagram {

    public static boolean isAnagram(String s, String t){

        String str1 = s.replaceAll("[a-zA-Z]", " ").toLowerCase();
        String str2 = t.replaceAll("[a-zA-Z]", " ").toLowerCase();

        if(str1.length() !=str2.length()){
            return false;
        }
       
         char[]arr1 = str1.toCharArray();
         Arrays.sort(arr1);

         char[]arr2 = str2.toCharArray();
         Arrays.sort(arr2);

         return Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args) {
        String s = "Hello";
        String t = "lloexh";

        if(isAnagram(s,t)){
            System.out.print("true");
        }
        else{
            System.out.print("false");

        }

        
    }
}

