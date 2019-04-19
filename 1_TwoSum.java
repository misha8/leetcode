class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        
        int[] arr=new int[2];
        int n=nums.length;
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(target-nums[i])){
                
                int secIndex=hm.get(target-nums[i]);
                arr[0]=secIndex;
                arr[1]=i;
                return arr;
            
            }
            else{
                
                hm.put(nums[i],i);
            }
            
            
            
        }
        
        return arr;
        
    }
}
