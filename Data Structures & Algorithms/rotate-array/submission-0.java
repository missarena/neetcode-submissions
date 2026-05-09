class Solution {
    public void rotate(int[] nums, int k) {
        int i=0;
        int j=k;
        while(i<j && i<nums.length && j<nums.length){
          int temp=nums[i];
          nums[i]=nums[j];
          nums[j]=temp;

          i++;
          j++;

        }
    }
}