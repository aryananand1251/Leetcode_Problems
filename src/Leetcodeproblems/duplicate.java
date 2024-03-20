package Leetcodeproblems;

public class duplicate {
    public static int findDuplicate(int[] nums) {
        int max = Integer.MIN_VALUE;
        int repeat = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        int count[] = new int[max+1];
        for (int i = 1; i < nums.length; i++) {
            count[nums[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                repeat = i;
            }
        }
        return repeat;
    }


    public static void main(String args[]) {
        int nums[]={1,2,3,4,2};
        System.out.println(findDuplicate(nums));

    }
}
