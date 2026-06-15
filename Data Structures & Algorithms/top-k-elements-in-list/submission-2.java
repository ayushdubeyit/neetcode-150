class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        List<Integer> bucket [] = new List[nums.length+1];

        for(int x : nums){
            map.put(x , map.getOrDefault(x,0)+1);
        }

        for(int key : map.keySet()){
            int freq = map.get(key);

            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int result [] = new int[k];
        int cnt =0;

        for(int i = bucket.length-1; i>=0 && cnt<k; i--){
            if(bucket[i] != null){
                for(Integer integer : bucket[i]){
                    result[cnt++] = integer;
                }
            }
        }
        return result;
    }
}
