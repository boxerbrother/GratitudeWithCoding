package GratitudeWithCoding.LeetCode.Arrays;

//Given an integer array nums, find the subarraywith the largest sum, and return its sum.

public class MaxSubarrays {
    public static void main(String[] args){
        int nums[] = new int[]{5,4,-1,7,8};
        int maxSum = nums[0];
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++){
            ans += nums[i];
            if(ans<0) ans = 0;
            maxSum = ans > maxSum ? ans : maxSum;
        }
        System.out.print(maxSum);
    }
}
