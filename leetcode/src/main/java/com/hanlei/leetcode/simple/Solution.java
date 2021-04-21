package com.hanlei.leetcode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Solution
 * @Description 乐扣-简单难度的算法
 * @Author hanlei
 * @Date 2021/1/12 下午7:55
 * @Version 1.0
 */
public class Solution {

    /**
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
     * <p>
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
     * <p>
     * 你可以按任意顺序返回答案。
     * <p>
     * 示例 1：
     * <p>
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     * 示例 2：
     * <p>
     * 输入：nums = [3,2,4], target = 6
     * 输出：[1,2]
     * 示例 3：
     * <p>
     * 输入：nums = [3,3], target = 6
     * 输出：[0,1]
     */
    public int[] twoSum(int[] nums, int target) {
        //自己写的，按照循环去找每一个元素的差数是不是在集合中
        /*int another = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            another = target - nums[i];
            index = i + 1;
            while (index <= nums.length){
                if (another == nums[index]){
                    return new int[]{i, index};
                }
            }
        }
        return new int[]{};*/

        //最优化思路 通过map的k-v，实现差数的值和被差数的索引位置
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.keySet().contains(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] ints = new Solution().twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(String.valueOf(ints[0]));
        System.out.println(String.valueOf(ints[1]));
    }
}
