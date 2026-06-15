class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
         
          for(String s : strs){
            sb.append(s.length())   // store length
              .append('#')          // separator
              .append(s);           // actual string
        }
         return sb.toString();

    }

    public List<String> decode(String str) {

        List<String> res = new ArrayList<>();

        int i = 0;
        while(i < str.length()){
            int j = i;

            while(str.charAt(j) != '#'){
                j++;
            }

            //extract length
            int len = Integer.parseInt(str.substring(i, j));

            //extract actual word
            String word = str.substring(j + 1, j + 1 + len);

            res.add(word);

            i = j + 1 + len;
        }
        return res;
    }
}