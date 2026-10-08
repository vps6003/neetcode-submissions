class Solution {
    public boolean isAnagram(String s, String t) {
        int []map = new int[256];
        int n = s.length();
        int m = t.length();

        if(n != m){
            return false;
        }

        Arrays.fill(map,0);

        for(int i=0 ;i<n ; i++){
            map[s.charAt(i)]++;
        }

        for(int i=0;i<m;i++){
            map[t.charAt(i)]--;
        }

        for(int num : map){
            if(num != 0) return false;
        }
        return true;
    }
}
