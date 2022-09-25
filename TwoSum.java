class Solution {
    public int[] twoSum(int[] nums, int target) {
        int x = 0, y = 0;
        int[] arr = new int[2];
        for(int i=0;i<nums.length-1;i++) {
          for(int j=i+1;j<=nums.length-1;j++) {
                if(nums[i] + nums[j] == target && i != j) {
                    x = i;
                    y = j;
                    arr[0] = x;
                    arr[1] = y;
                }
            }  
        }         
        return arr;
    }
}
