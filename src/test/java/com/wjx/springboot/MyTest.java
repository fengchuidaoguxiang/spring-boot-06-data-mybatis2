package com.wjx.springboot;

import org.junit.Test;

public class MyTest {

    @Test
    public void test1(){
        int[] nums = {11,7,15,2};
        int target = 9;
        int[] result = twoSum(nums,target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
    public static int[] twoSum(int[] nums, int target){
        for(int i=0; i < nums.length; ++i){
            for(int j=i+1;j<nums.length; ++j){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
