class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums); // N log N
        int maxLen=1;
        int previous=nums[0];
        int len=1;
        for(int i=1;i<nums.length;i++){
            if(previous==nums[i]){
                continue;
            }
            else if(nums[i]==(previous+1)){
                len++;
            }
            else{
                len=1;
            }
             previous=nums[i];
            maxLen=Math.max(maxLen,len);
        }
        return maxLen;
    }
}
