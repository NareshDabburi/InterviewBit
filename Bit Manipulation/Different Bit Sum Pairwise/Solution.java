    public class Solution {
        public int cntBits(ArrayList<Integer> A) {
            long n=A.size();
            int mod=1000000007;
            long ans=0;
            for(int i=0;i<31;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if((A.get(j)>>i)%2 != 1){
                    c++;
                }
            }
            //ans=ans+(c*(n-c)*2);
            ans=(ans%mod + ((c%mod)*((n-c)%mod)*2)%mod)%mod;
        }
        return (int)ans;
    }
}
