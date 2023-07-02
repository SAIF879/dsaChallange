
public class Arrays {
    public static void fullRotate(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int start = 0;
        int end = length - 1;
        k = k % length;

        fullRotate(nums, start, end);
        fullRotate(nums, start, k - 1);
        fullRotate(nums, k, end);
        System.out.println(java.util.Arrays.toString(nums));

    }

    public static void main(String[] args) {


        //question 1 rotate arrays by factors
        int num[] = {-1, -100, 3, 99}, k = 2;
        //Output: [3,99,-1,-100]   DONE

        




    }
}
