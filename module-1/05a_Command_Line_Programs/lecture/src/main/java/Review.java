

public class Review {
    public static void main(String[] args) {

        int[] nums = {1, 5, 10, 30};
        //              0  1   2   3

        int[] newNums = new int[nums.length - 1];
        //  [0, 0, 0]
        //    0  1  2
        for (int i = 1; i < nums.length; i++) {
            newNums[i - 1] = nums[i];

        }
        for (int i = 0; i < newNums.length; i++) {
            newNums[i] = nums[i + 1];
        }
    }
}
