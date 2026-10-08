class Solution {
    public String longestCommonPrefix(String[] strs) {
        

        int n = strs.length;
        String ans = strs[0];

        for(int i = 1; i<n;i++){
            ans = check(ans,strs[i]);
        }
        return ans;
        
    }

    private String check(String a , String b){

        StringBuilder ss = new StringBuilder();

        int n = Math.min(a.length(), b.length());

        for(int i =0 ; i<n;i++){
            char x = a.charAt(i);
            char y = b.charAt(i);

            if( x != y) break;

            ss.append(x);
        }

        return new String(ss);
    }
}