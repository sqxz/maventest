public class LeeCode {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i <= nums.length - 2; i++) {
            for (int j=i; j<= nums.length-i;j++){
                if (nums[j] + nums[j + 1] == target){
                    return new int[]{i, i + 1};
                }
            }
        }
        return new int[]{};
    }



    public static void main(String[] args) {
        LeeCode leeCode = new LeeCode();
        leeCode.twoSum(new int[] {3,2,4},6);
    }
}


