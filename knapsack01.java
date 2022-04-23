//input : 


public int maxWeight (int [] wt, int [] val ,int W, int n) {
  
  if (W==0 || n==0) {
    return 0;
  }
  if (wt[n-1]<W) {
    return Math.max(val[n-1]+maxWeight(wt,val,W-wt[n-1],n-1)),maxWeight(wt, val, W, n-1);
  } else {
     return maxWeight(wt, val, W, n-1);
  }
