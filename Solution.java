import java.util.Arrays;

class Solution {
    public static int minMoves(int[] nums) {

        int moves = 0;
        boolean isSame = check(nums);
        if(isSame)
            return 0;
        if(nums.length == 1)
            return 0;

        while(!isSame){
            Arrays.sort(nums);
            nums[0]++;
            nums[1]++;
            isSame = check(nums);
            moves++;
        }

        return moves;



    }

    public static boolean check(int[] nums)
    {
        for(int i=1;i<nums.length;i++)
        {
            if(nums[0] != nums[i])
                return false;

        }

        return true;

    }

    public static void main(String args[])
    {
        int arr[] = {1,2,3};
        System.out.println(minMoves(arr));
    }
}