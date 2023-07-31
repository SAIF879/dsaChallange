package daily.todo;

public class LeetCode1493 {

    public static int longestSubarray(int[] nums) {
        int count = 0 ;
        int max = 0;
        int zeroCount = 0;

        for (int i = 0 ; i < nums.length ; i++){
            count+=nums[i];
            if (nums[i]==0)  zeroCount+=1;
            if (zeroCount>2){
                max = count;
                zeroCount = 0;
                count=0;
            }

        }
        if (count==nums.length) return count-1;
        return Math.max(max , count);
    }

    public static void main(String[] args) {
        //Return the size of the longest non-empty subarray containing only
        // 1's in the resulting array. Return 0 if there is no such subarray.

        int  nums[] = {1,1,0,0,1,1,1,0,1};
        System.out.println(longestSubarray(nums));
    }
}
