class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        // HashMap<Character,Integer> map = new HashMap<>();

      char arr1[] = s.toCharArray();
      Arrays.sort(arr1);
      String p = new String(arr1);
       char arr2 []= t.toCharArray();
        Arrays.sort(arr2);
          String q = new String(arr2);

        return p.equals(q);
    }
}
