
import java.util.*;
public class Encode_Decode {

    public String encode(List<String>str){
        StringBuilder encodedString = new StringBuilder();

        for(String strs : str){
            encodedString.append(strs.length()).append("#").append(strs);

        }
        return encodedString.toString();


    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;

            int length = Integer.valueOf(str.substring(i, j));
            i = j + 1 + length;
            list.add(str.substring(j + 1, i));
        }
        return list;
    
}
        public static void main(String[] args) {
            
        }
}
