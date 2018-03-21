public class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) return Integer.MAX_VALUE;
	    if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
	    if (dividend == divisor) return 1;
	    if (divisor == 1) return dividend;
	    if (divisor == -1) return -dividend;
	    if (divisor == 2) return (dividend >> 1);
	    return (int) div(dividend, divisor);
	}
	public long div(long dividend, long divisor) {
	   long ans=0;
	   boolean sign =  false;
	   if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
	    	sign = true;
	    }
		dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
	    while(dividend>0){
            dividend-= divisor;
            ans++;
        }
        if(dividend<0)
        ans=ans-1;
	    return sign? -ans : ans;

    }
}
