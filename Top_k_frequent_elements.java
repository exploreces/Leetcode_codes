
import java.util.*;

/*Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 *  Input: nums = [1,1,1,2,2,3], k = 2
        Output: [1,2]
 */

/*public class Top_k_frequent_elements {
    
    public static int[] top_frequency (int []arr, int k)
    {


        Map <Integer,Integer> counts = new HashMap<>();    // creation of map
        for(int num:arr){
        counts.put(num, counts.getOrDefault(num,0) +1);

     }

     PriorityQueue<Map.Entry<Integer,Integer>>pq = new PriorityQueue<>((a,b)-> b.getValue() - a.getValue());
     pq.addAll(counts.entrySet());


    int[] result =new int[k];
    for(int i =0;i<k;i++){
        result[i] = pq.poll().getKey();
    }
    return result; 
            



                
         }


         public static void main(String[] args) {
         
        int[] arr = {1, 1, 1, 2, 2,4,4,5,3, 3};
        int k = 5;
        int[] result =top_frequency (arr,  k);
        System.out.println(Arrays.toString(result));

            
         }

    }

 */

 /**
  * Top_k_frequent_elements
  */

 public class Top_k_frequent_elements {
 
    public static int[] top_frequency(int[] arr, int k){

        Map<Integer, Integer> counts = new HashMap<>();
        for(int nums:arr){
            counts.put(nums, counts.getOrDefault(nums,0) +1);

        }
    
        PriorityQueue<Map.Entry<Integer,Integer>>tf = new PriorityQueue<> ((a,b)->b.getValue() - a.getValue());
       tf.addAll(counts.entrySet());

       int [] result = new int[k];
       for(int i =0;i<k;i++){
        result[i] = tf.poll().getKey();
    }
    return result; 

    }

    public static void main(String[] args) {
         
        int[] arr = {1, 1, 1, 2, 2,4,4,5,3, 3};
        int k = 3;
        int[] result =top_frequency (arr,  k);
        System.out.println(Arrays.toString(result));

            
         }

    }
 