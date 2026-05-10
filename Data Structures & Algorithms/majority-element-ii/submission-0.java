class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int limit=(nums.length/3);
        for(int key:map.keySet()){
            if(map.get(key)>limit){
              ans.add(key);
            }
        }
        return ans;
    }
}