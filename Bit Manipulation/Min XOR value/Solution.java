public class Solution {
    public int findMinXor(ArrayList<Integer> A) {
        Collections.sort(A);
        int ans=0;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<A.size()-1;i++){
            ans=A.get(i)^A.get(i+1);
            max=Math.min(max,ans);
        }
        return max;
    }
}
