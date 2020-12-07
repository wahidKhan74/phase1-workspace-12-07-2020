package com.simplilearn.accessmodifier;

import com.simplilearn.accessB.Hero;

public class ProtectedAccTest2 extends Hero{

	public static void main(String[] args) {
		
//		 Hero hero = new Hero();
		
		 ProtectedAccTest2 p = new ProtectedAccTest2();
		 System.out.println(p.power);
		 p.showPower();
	}

}


