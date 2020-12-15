package com.simplilearn.array.datastructure.array;

public class ArrayRotationTest {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		System.out.println("Before  ");
		for(int item:arr) {
			System.out.print( item +" ");
		}
		
		//Rotation Here
		ArrayRotation aR = new ArrayRotation();
		aR.rotate(arr, 3);
		System.out.println("After  ");
		for(int item:arr) {
			System.out.print(item +" ");
		}

	}

}
class ArrayRotation{
	
	public void rotate (int[] nums,int pos) {
		
		if(pos > nums.length)
			pos = pos % nums.length;
		
		int[] result = new int[nums.length];
		
		for (int i = 0; i < pos ; i++) {
			result[i] = nums[nums.length - pos +i];
		}
		
		int j= 0;
		for (int i = pos; i < nums.length; i++) {
			result[i] = nums[j];
			j++;
		}
		System.arraycopy(result, 0, nums, 0, nums.length);
	}
}