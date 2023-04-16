/**
 * Contains_Duplicate
 */
import java.util.*;
public class Contains_Duplicate {

    public static boolean duplicate(int nums[]){
       
        HashSet<Integer> unique = new HashSet<Integer>();
        for(int i =0;i<nums.length;i++){
            if(unique.contains(nums[i])){
                return true;

            }
            unique.add(nums[i]);

        }
        return false;

    }

    public static void print_duplicates(int[]numss){
        for(int i = 0; i<numss.length;i++){
           for(int j =i+1;j<numss.length;j++){
            if (numss[i] == numss[j]){
                j++;
                System.out.println(numss[i] );
                
            }
            
           
           }
        }
        System.out.print( "  if true then duplicates data present!! elseif false  then no duplicates");
    }


    public static void main(String[] args){

        int arr[] = {1,2,3,4,5,7,7,9,0};
        System.out.println(duplicate(arr));
        print_duplicates(arr);

    }

    
}