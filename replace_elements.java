import java.util.Arrays;

// replacing elements with the largest element present in the right side of the loop.

public class replace_elements  {

    public static int [] replace(int [] arr){
       
       int rightmax = -1;                                   
       for(int i = arr.length-1; i>=0;i--){
          int newmax =Math.max(rightmax,arr[i]);
          arr[i] = rightmax;
          rightmax=newmax;

       } 
       return arr;
    }

    public static void main(String[] args) {
        int[]arr = {17,18,5,4,3,1};
        System.out.print(Arrays.toString(replace(arr)));
    }
    
    
}
