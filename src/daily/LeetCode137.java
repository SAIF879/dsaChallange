package daily;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;


public class LeetCode137 {
    public static Integer singleNumber(int[] nums) {
        int pointer = nums[0];
        int counter = 1;
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(pointer ,counter );
        for (int i = 1 ; i < nums.length ; i++){
        if (map.containsKey(nums[i])) {
            counter++;
            map.put(nums[i],counter);}
        else {
            counter=1;
            map.put(nums[i] ,counter );}
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,1,0,99};
        System.out.println(
               singleNumber(arr)
        );
    }
}
