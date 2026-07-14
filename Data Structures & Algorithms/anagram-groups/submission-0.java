class Solution {
      public String sort(String s) {
        
        // 1. Convert to char array
        char[] chars = s.toCharArray();
        
        // 2. Sort the array
        Arrays.sort(chars);
        
        // 3. Convert back to String
        return new String(chars);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
           Map<String, List<String>> mp = new HashMap<>();
        for(int i =0;i<strs.length;i++){
            String sorted = sort(strs[i]);
            if(mp.containsKey(sorted)){
               mp.get(sorted).add(strs[i]);
            }else{
                mp.put(sorted, new ArrayList<String>());
                mp.get(sorted).add(strs[i]);
            }
        }

       return new ArrayList<>(mp.values());
       
    }
}
