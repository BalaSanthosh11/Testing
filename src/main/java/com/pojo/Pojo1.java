package com.pojo;

public class Pojo1 {
	public static void main(String[] args) {
		Pojoclass a = new Pojoclass();
		int a2 = a.getA();
		System.out.println(a2);

		a.setA(50);
		int a3 = a.getA();
		System.out.println(a3);
	}
}
