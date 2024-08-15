public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length; //Taking one number

        //taking one number and comparing with all other
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSum check = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 26 ;

        int[] result = check.twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
