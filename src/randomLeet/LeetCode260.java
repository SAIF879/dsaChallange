package randomLeet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode260 {

    public static int[] singleNumber(int[] nums) {

        HashMap<Integer , Integer> map = new HashMap<>();
        int counter = 0;
        map.put(nums[0],counter);
        for (int i = 0 ; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                counter++;
                map.put(nums[i], counter);
            }
            else  {
                counter =1;
                map.put(nums[i],counter);
            }
        }

        int result[] = new int[2];
        int i = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue()==1){
            result[i] = entry.getKey();i++;
            }
        }
        return result;
    }


    public static void main(String[] args) {

        //Given an integer array nums, in which exactly two elements appear only once and all the
        // other elements appear exactly twice. Find the two elements that appear only once.
        // You can return the answer in any order.

        int nums[] = {1,2,1,3,2,5};
        //Output: [3,5]
        //Explanation:  [5, 3] is also a valid answer.
        singleNumber(nums);

    }
}
