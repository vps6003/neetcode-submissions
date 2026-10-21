class Solution {

    private final String key = "#-#-#";

    public String encode(List<String> strs) {
        return  strs.size() == 0 ? "Empty_##" :
                strs.size() == 1 && strs.get(0).length() == 0 ? key : 
                String.join(key,strs);
    }

    public List<String> decode(String str) {
        // List<String>strs = new ArrayList<>();
        // System.out.println(str);
        // return strs;

        // return Pattern.compile(Pattern.quote(key))
        //        .splitAsStream(str)
        //        .toList();

        List<String> ans = new ArrayList<>();
        if(str == "Empty_##") return ans;

        if(str == key){
            ans.add("");
            return ans;
        }

        return Arrays.asList(str.split(Pattern.quote(key),-1));
    }
}
