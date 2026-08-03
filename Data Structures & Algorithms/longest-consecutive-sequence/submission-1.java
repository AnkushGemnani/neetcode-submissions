class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int maxlen=0;
        int n=nums.length;
        if(n==0) return 0;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(Integer element:set){
            int previous=element-1;
            if(!set.contains(previous)){
                int len=1;
                int nextel=element+1;
                while(set.contains(nextel)){
                    len++;
                    nextel++;
                }
                maxlen=Math.max(maxlen,len);
            }
        }
        return maxlen;
    }
}
