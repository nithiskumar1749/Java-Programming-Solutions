class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        int left=0;

        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            maxsum=Math.max(maxsum,sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxsum;
    }
}
