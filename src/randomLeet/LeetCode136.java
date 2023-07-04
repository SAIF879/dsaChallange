package randomLeet;

import java.util.HashMap;
import java.util.Map;

public class LeetCode136 {

    public static Integer singleNumber(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int counter = 0;
        map.put(nums[0] , counter);

        for (int i =0 ; i < nums.length ; i++){
            if (map.containsKey(nums[i])){
                counter+=1;
                map.put(nums[i], counter);
            }
            else  {
                counter=1;
                map.put(nums[i], counter);
            }
        }

        for (Map.Entry<Integer , Integer> entry : map.entrySet()){
            if (entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {


        //Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

        int nums[] = {4,1,2,1,2};
        //Output: 4
        System.out.println(singleNumber(nums));

    }
}
