class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int key:nums){
            if(freq.containsKey(key)){
                return true;
            }

            freq.put(key,freq.getOrDefault(key,0)+1);
        }

        return false;
    }
}