class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        if(strs.length == 0){
            return new ArrayList<>();
        }
        Map<String, List> map = new HashMap<>();

        for(String str : strs){
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String temp = String.valueOf(array);
            if(map.get(temp) == null){
                map.put(temp, new ArrayList());
            }
            map.get(temp).add(str);
            
        }
        
        return new ArrayList(map.values());
    }
}
