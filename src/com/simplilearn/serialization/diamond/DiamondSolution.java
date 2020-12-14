package com.simplilearn.serialization.diamond;

interface First {
	
	default void show() {
		System.out.println("Default First !");
	}
}

interface Second {
	
	default void show() {
		System.out.println("Default Second !");
	}
}

public class DiamondSolution implements First,Second {
	
	public void show() {
		First.super.show();
		Second.super.show();
	}
	
	public static void main(String[] args) {
		DiamondSolution dm = new DiamondSolution();
		dm.show();

	}

}
