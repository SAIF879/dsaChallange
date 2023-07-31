package algos.todo.slidingWindow;

public class SlidingWindowAlgorithm {

    public static int naiveSum(int arr[] , int window){
        int max = 0;
        int length = arr.length;
        for (int i = 1 ; i < length ; i++){
            for (int j = 0 ; j < i ; j++){
                if (arr[i]+arr[j]>max){max = arr[i]+arr[j];}
            }
        }
        return max;
    }

   public static int slidingWindow(int arr[] , int window){
        int max = 0 ;
        int length = arr.length;
        for (int i = 0 ; i < window ; i++){
            max+= arr[i];
        }
        int window_sum = max; 
        for (int i = window ; i < length ; i++){
            window_sum += arr[i] - arr[i-window];
            max = Math.max(max , window_sum);
        }
        return max;
   }


    public static void main(String[] args) {

//        int arr[] = {1,3,5,4,7};
//        int output = 3;
//        System.out.println(sliding(arr));
        // Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array
           int   arr[] = {100, 200, 300, 400}, k = 2;
        //Output : 700
        //  System.out.println(naiveSum(arr , k));
        System.out.println(slidingWindow(arr , k));


    }
}
