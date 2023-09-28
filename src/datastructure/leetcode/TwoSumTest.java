package datastructure.leetcode;

import java.util.Arrays;

/**
 * @author 吴尚慧
 * @since 2022/11/4 9:24 下午
 */
public class TwoSumTest {

    public static void main(String[] args) {
        TwoSumTest testCode = new TwoSumTest();

        /*
        case1: 输入：nums = [2,7,11,15], target = 9
               输出：[0,1]
               解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
         */
        System.out.println(Arrays.toString(testCode.twoSum(new int[]{2, 7, 11, 15}, 9)));


    }

    /**
     * 暴力测试
     */
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
