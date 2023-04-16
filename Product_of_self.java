
import java.util.*;

/*  Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer. 

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
*/

public class Product_of_self {
    public static int[] product(int[]arr){
        
        int n = arr.length;
        int[]ans = new int[n];

        
//calculating left side
        ans[0] = 1;
        for(int i =1;i<n;i++){
            ans[i] = ans[i-1]* arr[i-1];

        }
// calculating right side

        int rightProduct = 1;
        for (int i = n-1; i >= 0; i--) {
            ans[i] = ans[i] * rightProduct;
            rightProduct *= arr[i];
        }
        
        return ans;



    
}

public static void main(String[] args) {
    int[]arr ={1,2,3,4};
    System.out.print( Arrays.toString(product(arr)));

}
}
