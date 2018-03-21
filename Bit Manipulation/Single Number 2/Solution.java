public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int ans=0;
        int n=A.size();
        for(int i=0;i<64;i++){
            int x=1<<i;
            int count=0;
            for(int j=0;j<n;j++){
                if(((A.get(j)&x))!=0){
                    count++;
                }
            }
            if(count%3==1){
                ans|=x;
            }
        }
        return ans;
    }
}
