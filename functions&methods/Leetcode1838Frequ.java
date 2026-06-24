
import java.util.Arrays;

public class Leetcode1838Frequ {

    public static void main(String[] args) {

        int[] nums = { 1, 3, 5 };
        int k = 5;

        System.out.println(maxFrequency(nums, k));
    }

    static public int maxFrequency(int[] nums, int k) {
        int left = 0;
        long totalSum = 0;
        int maxFreq = 0;
        Arrays.sort(nums);

        for (int right = 0; right <= nums.length - 1; right++) {
            totalSum += nums[right];
            while ((long) (right - left + 1) * nums[right] - totalSum > k) {
                totalSum -= nums[left];
                left++;
            }
            maxFreq = Math.max(maxFreq, (right - left + 1));
        }

        return maxFreq;
    }
}