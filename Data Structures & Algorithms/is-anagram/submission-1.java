class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mapS = new HashMap<>();
        HashMap<Character,Integer> mapT = new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            char keyS = s.charAt(i);
            char keyT = t.charAt(i);

            mapS.put(keyS,mapS.getOrDefault(keyS,0)+1);
            mapT.put(keyT,mapT.getOrDefault(keyT,0)+1);
        }

        return mapS.equals(mapT);

    }
}