class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
     
         HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1); // Fixed the increment operation
            }else{
                map.put(nums[i],1);
            }
        }
        
        List<Integer> a = new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)>(nums.length/3)){
                a.add(key);
            }
        }
        return a;
    }
}

