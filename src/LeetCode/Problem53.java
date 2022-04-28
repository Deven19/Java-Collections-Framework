package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
//--Azure_db@123
//--file_bucket_management
public class Problem53 {
    public static void main(String[] args){
        int[] ar = {-2,-1};
        System.out.println(maxSubArray(ar));
    }

    public static int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int maxSum= -(10^4) -1;
        int length = nums.length;
        int initial = 0;
        int end = length;
        for(int i = 0; i < length; i++){
            int sum = 0;
            if(i==0){
                initial = 0;
                end = length;
            }else{
                if(nums[initial]>nums[end-1]) end = end-1;
                else if(nums[initial]<nums[end-1]) initial = initial+1;
                else if(nums[initial] == nums[end-1]){
                    if(nums[initial+1]>nums[end-2]) end = end-1;
                    else if(nums[initial+1]<nums[end-2]) initial = initial+1;
                }
            }

            for(int j = initial; j <end; j++){
                sum = sum+nums[j];
            }
            //System.out.println(sum);
            if(sum>maxSum){maxSum=sum;}
        }
        return maxSum;
    }
}
