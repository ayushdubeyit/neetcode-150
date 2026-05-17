class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();

        List<List<String>> resultSubset = new ArrayList<>();

        for(String word : strs){
            char arr[] = word.toCharArray();
            Arrays.sort(arr);
            String new_word = new String(arr);

            if(!map.containsKey(new_word)){
                map.put(new_word , new ArrayList<>());
            }
             map.get(new_word).add(word);

        }
        return new ArrayList<>(map.values());
    }
}
