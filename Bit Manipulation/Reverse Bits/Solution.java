public class Solution {
	public long reverse(long a) {
	    long ans=0;
	    int i=31;
	   while(a>0){
	       ans+=((a%2)*Math.pow(2,i));
	       i--;
	       a=a>>1;
	   }
		return ans;
	}
}
