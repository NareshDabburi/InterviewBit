public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        
        int ans=0;
        int n=A.size();
        for(int i=0;i<n;i++){
            ans ^=A.get(i);
        }
        return ans;
    }
    
}
