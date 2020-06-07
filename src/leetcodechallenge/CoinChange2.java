package leetcodechallenge;

public class CoinChange2 {
    public static int helperMemo(int amount, int[] coins, int n, Integer[][] dp){
        if(n==0)
            return 0;
        if(amount==0)
            return 1;
        if(dp[n][amount]!=null)
            return dp[n][amount];
        if(coins[n-1]>amount){
            dp[n][amount]= helperMemo(amount,coins,n-1,dp);
            return dp[n][amount];
        }
        dp[n][amount]= helperMemo(amount-coins[n-1],coins,n,dp)+ helperMemo(amount,coins,n-1,dp);
        return dp[n][amount];
    }
    public static int changeMemo(int amount, int[] coins) {
        if(amount==0)
            return 1;
        Integer[][] dp= new Integer[coins.length+1][amount+1];
        return helperMemo(amount,coins,coins.length,dp);
    }

    public static int helperRecursion(int amount, int[] coins, int n){
        if(n==0)
            return 0;
        if(amount==0)
            return 1;
        if(coins[n-1]>amount){
            return helperRecursion(amount,coins,n-1);
        }
        return helperRecursion(amount-coins[n-1],coins,n)+ helperRecursion(amount,coins,n-1);
    }
    public static int changeRecursion(int amount, int[] coins) {
        if(amount==0)
            return 1;
        return helperRecursion(amount,coins,coins.length);
    }

    public static void main(String[] args) {
    int amount=500;
     int[] a={3,5,7,8,9,10,11};
     System.out.println(changeMemo(amount,a));
    }
}
