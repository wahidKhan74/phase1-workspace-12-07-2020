package com.simplilearn.array.datastructure.bigO;

public class QuadraticTimeComplexity {

	// This method runs in O(n*n) time -> O(n^2) Quadratic Time Complexity
	public static void displayAllPairs(int[] items) {
		for (int item : items) {
			System.out.println(item);
			for (int second : items) {
				System.out.println(second);
			}
		}	

	}
	
	// This method runs in O(n*n*n) time -> O(n^3)-> O(n^2) -> O(n^e)  Exponential / Quadratic Time Complexity
		public static void displayAllPairsThrice(int[] items) {
			for (int item : items) {
				System.out.println(item);
				for (int second : items) {
					System.out.println(second);
					for (int third : items) {
						System.out.println(third);
					}
				}
			}	

		}

	public static void main(String[] args) {
		int[] items = {1,2,3,4,5,6,7,8,9,10};
		displayAllPairs(items);

	}

}
