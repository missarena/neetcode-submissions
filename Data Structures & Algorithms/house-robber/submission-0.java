class Solution {
    int[] dp;
    public int rob(int[] nums) {
        int n=nums.length;

        dp=new int[n];
        Arrays.fill(dp,-1);

        return solve(n-1,nums);

    }

    int solve(int i,int[] nums){
        if(i<0)return 0;
        if(i==0)return nums[0];

        if(dp[i]!=-1)return dp[i];
        int pick=nums[i]+solve(i-2,nums);
        int notPick=solve(i-1,nums);
        dp[i]=Math.max(pick,notPick);
        return dp[i];
    }
}
