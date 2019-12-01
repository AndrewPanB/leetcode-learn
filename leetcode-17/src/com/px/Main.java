class Solution {
    private List<String> result = new ArrayList<>();
    private Map<String,String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        if(digits == null ||digits.length()==0){
            return result;
        }
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");
        get(digits,"");
        return result;
    }
    private void get(String left, String before){
        if(left.length() ==0){
            result.add(before);
            return;
        }
        String first = left.substring(0,1);
        String key = map.get(first);
        for(int i=0;i<key.length();i++){
            get(left.substring(1), before+key.substring(i,i+1));
        }
    }


}
