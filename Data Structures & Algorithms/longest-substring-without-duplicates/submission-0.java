class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
       int window =0;
       int low =0;
       int high =0;

       while(high<s.length()){    
            while(set.contains(s.charAt(high))){
                set.remove(s.charAt(low));
                low++;
                window--;
            }

            set.add(s.charAt(high));

            high++;
            window++;

            max=Math.max(window,max);
       }

       return max;
    }
}
