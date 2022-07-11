package softnervequestions;

import java.util.Scanner;

public class Question2 {

	
		   public void maxProfit(int[] prices) {
		        int buy=Integer.MAX_VALUE,sell=0;
		        for(int i=0;i<prices.length;i++){
		            buy=Math.min(buy,prices[i]);
		            sell=Math.max(sell,prices[i]-buy);
		        }
		       System.out.println(sell);
		    }
	    

	public static void main(String[] args) {
		Question2 maxprofit = new Question2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prices[] = new int [n];
		
		for(int i = 0 ; i <n; i++ ) {
			prices[i] = sc.nextInt();
		}
		
		maxprofit.maxProfit(prices);

	}

}
