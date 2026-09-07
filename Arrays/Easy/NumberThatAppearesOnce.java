class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int c = count(nums[i],nums);
            if(c==1){
                return nums[i];
            }
            continue;
        }
        return nums[0];
    }
    public int count(int k, int[] arr){
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k){
                c++;
            }
        }
        return c;
    }
}