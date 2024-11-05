package hotel;
import java.util.*;

public class sample {
   public static int calculate(int[] arr,int amount){
    int dp[]=new int[amount+1];
    Arrays.fill(dp,amount+1);
    dp[0]=0;
    int min=Integer.MAX_VALUE;
    for(int i=1;i<=amount;i++){
       for(int coin:arr){
        if(i-coin>=0)
          dp[i]=Math.min(dp[i],dp[i-coin]+1);
       }
    }
    return dp[amount]>amount ? -1:dp[amount];

   }

    public static void main(String[] args) {
        
        int arr[]={1,2,5};
        int amount=4;
        System.out.println(calculate(arr, amount));
    }
}
