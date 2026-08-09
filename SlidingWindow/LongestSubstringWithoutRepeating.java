class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int maxlength=0;

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            while(map.containsKey(ch)){
                char leftchar=s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);
                if(map.get(leftchar)==0){
                    map.remove(leftchar);
                }
                left++;
            }
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}
