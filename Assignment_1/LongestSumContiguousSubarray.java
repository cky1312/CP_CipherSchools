package Assignment_1;
import java.util.Scanner;

public class LongestSumContiguousSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int ss = maxSumOfSubarray(arr,n);
        System.out.print("Max sum using 3 loops: ");
        System.out.println(ss);

        int sss = maxSumOfSubarrayInN2(arr,n);
        System.out.print("Max sum using 2 loops: ");
        System.out.println(sss);

        int ssss = kadane(arr,n);
        System.out.print("Max sum using Kadane's Algorithm: ");
        System.out.println(ssss);

    }

    static int maxSumOfSubarray(int[] arr, int n){
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int sum = 0;
                for(int k = i; k <= j;k++){
                    sum += arr[k];
                }
                maxSum = Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }

    static int maxSumOfSubarrayInN2(int[] arr,int n){
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){      //[1,4,-1,2,-3]
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];
                maxSum = Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }

    static int kadane(int[] arr, int n){
        int maxSum = arr[0];
        int tempSum = arr[0];

        for(int i = 1; i < n; i++){
            tempSum = Math.max(arr[i],tempSum+arr[i]);
            maxSum = Math.max(maxSum,tempSum);
        }
        return maxSum;
    }
}
