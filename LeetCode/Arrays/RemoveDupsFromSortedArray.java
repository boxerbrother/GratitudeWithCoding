package GratitudeWithCoding.LeetCode.Arrays;

// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique 
// element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

// Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

// Change the array nums such that the first k elements of nums contain the unique elements in the order they were 
//present in nums initially. The remaining elements of nums are not important as well as the size of nums.
// Return k.


public class RemoveDupsFromSortedArray {
    public static void main(String[] args){
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4,9,9,9};
        if (nums.length==1) System.out.print(1);
        else{
            int uniqueElements = 1;
            for(int i = 1; i < nums.length; i++){
                if(nums[i]!=nums[i-1]){
                    nums[uniqueElements]=nums[i];
                    uniqueElements++;
                }
            }
            System.out.print(uniqueElements);
        }
    }
}
