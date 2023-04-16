
import java.util.*;
public class word_pattern {

    public static boolean pattern( String pattern,String s){
        String[] arr= s.split("\s");

        if(arr.length != pattern.length()){
            return false;
        }

        HashMap<Character,String> chartoword = new HashMap<>();
        HashMap<String, Character> wordtochar = new HashMap<>();

        for(int i =0;i<pattern.length();i++){
            if(chartoword.containsKey(pattern.charAt(i)) && !chartoword.get(pattern.charAt(i)).equals(arr[i])) {
                return false; 
            }  

        if(wordtochar.containsKey(arr[i]) && !wordtochar.get(arr[i]).equals(pattern.charAt(i))) {
            return false;
        
    }
            chartoword.put(pattern.charAt(i),arr[i]);
            wordtochar.put(arr[i],pattern.charAt(i));

}

return true;    
    }


    public static void main(String[] args) {
        
        String pattern ="abba";
        String s ="dog dog dog dog";

        System.out.print(pattern(pattern,s));
    }
}
