package softnervequestions;

import java.util.Scanner;
import java.util.Stack;

public class Question1 {
//	Naive Approach with higher time complexity it will have 2 loops 

// void leaders(int[] a, int n) {
//		for(int i = 0 ; i < n ; i++ ) {
//			
//			int j;
//			for( j = i+1 ; j < n; j++) {
//				if(a[i] <= a[j]) {
//					break;
//				}
//			}
//				if(j == n) 
//					System.out.print(a[i] + " ");
//					
//		}
//		System.out.print(a[n]);
//
// }
//	this is a naive approach with time complexity of O(n*n)
	
	
//	A BETTER APPROACH IS AS FOLLOWS
	
	void leaders(int[] a, int n) {
	Stack<Integer>st = new Stack<Integer>();
	
	st.push(a[n-1]);
	for(int i = n-2; i >= 0; i-- ) {
	if(a[i] > st.peek()) {
		st.push(a[i]);
	}
	}
	while(!st.isEmpty()) {
		System.out.print(st.peek() +" ");
		st.pop();
	}
	System.out.println(a[n]);
		
	}
//	 This is a better approach with time complexity of O(n)
	


	public static void main(String[] args) {
		
		Question1 leader = new Question1();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a[] = new int [n+1];
		
		for(int i = 1 ; i <= n ; i ++ ) {
			a[i] = sc.nextInt();
			
		}	
		leader.leaders(a , n);
		
		
	}
}
