import java.util.*;
public class Length_lastword {
    public static int  count( String str){
        int count =0;
        int i =str.length()-1;

        while (str.charAt(i) == ' ') {
            i -= 1;
        }
        while( i>=0 && str.charAt(i) !=' '){
           count++;
            i--;


        }

       
        return count;
    }

    public static void main(String[] args) {
        
        String str = "hello wonderful , how are you ";
        System.out.print(count(str));
    }
    
}
