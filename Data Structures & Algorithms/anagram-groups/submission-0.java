class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String s:strs){
            char[] stringArr = s.toCharArray();
            Arrays.sort(stringArr);
            String sorted = new String(stringArr);

            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<String>());
            }
            map.get(sorted).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
