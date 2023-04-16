import java.util.Arrays;

public class concatenation_ {

    public static int[] concatenate(int[]nums){
        int n = nums.length;
        int ans[] = new int [2*n];
        for(int i  =0; i<2*n;i++){
            if(i<n){
                ans[i] = nums[i];
            }
            else{
                ans[i] = nums[i-n];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        
        int ans[] ={1,2,3};
        int []sorted = concatenate(ans);
        System.out.println("result array is " +Arrays.toString(concatenate(ans)));

        // just sorting that not the part of this question

        Arrays.sort(sorted);
        System.out.println("if sorted then" + Arrays.toString(sorted));

    }
    
}
