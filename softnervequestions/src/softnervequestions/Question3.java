package softnervequestions;

import java.util.Scanner;

public class Question3 {

	
	// We can do this Question using simple recursion....
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int [n];
		
		for(int i = 0 ; i <n; i++ ) {
			nums[i] = sc.nextInt();
		}
		System.out.println(sum(nums , n));
		
	}

	 static int sum(int[] nums, int n) {
		return recursive(0 , 0 , nums , n);
	}

	 static int recursive(int i, int j, int[] nums, int n) {
		if(i == n)
			return j;
		
		int ch1 = recursive(i+1 , j^nums[i] , nums , n);
		int ch2 = recursive(i+1 , j , nums , n);
		
		return ch1+ch2;
		
	}

}
