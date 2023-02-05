class Solution
{
    
    static int lcs(int x, int y, String s1, String s2)
    {
     int [][]dp = new int[x+1][y+1] ;
     for(int []i:dp)
     Arrays.fill(i,-1) ;
   
        return   lcsUtil(x,y,s1,s2,dp) ;
     
    }
    static int lcsUtil(int x, int y, String s1, String s2, int [][]dp){
        if(x==0 || y ==0)
    return 0 ;
    if(dp[x][y]!=-1)
    return dp[x][y] ;
    
    if(s1.charAt(x-1)==s2.charAt(y-1))
    return dp[x][y]= 1+lcsUtil(x-1,y-1,s1,s2,dp);
    else
    return dp[x][y]= Math.max(lcsUtil(x,y-1,s1,s2,dp),lcsUtil(x-1,y,s1,s2,dp)) ;
    }
    
}
