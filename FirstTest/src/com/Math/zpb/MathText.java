package com.Math.zpb;

import java.math.BigDecimal;

public class MathText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.floor(Math.random()*10+1));
		BigDecimal big=new BigDecimal(222.44);
		BigDecimal bigs=new BigDecimal(2223.31231);
		System.out.println(big.add(bigs));
		System.out.println(big.subtract(bigs));		

	}

}
