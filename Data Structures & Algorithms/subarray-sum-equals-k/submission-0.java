class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int l=0;l<nums.length;l++){
            int sum=0;
            for(int r=l;r<nums.length;r++){
                sum=sum+nums[r];
                if(k==sum){
                    count++;
                }
            }
        }
        return count;
    }
}
//BRUTEFORCE APPROACH