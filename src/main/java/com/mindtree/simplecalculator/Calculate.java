package com.mindtree.simplecalculator;

public class Calculate {
	public static int add(int x, int y)
	{
		return x+y;
	}
	public static int subtract(int x, int y)
	{
		return x-y;
	}
	public static void main(String[] args) {
		int x=5;
		int y=200;
		System.out.println(add(x,y));
		System.out.println(subtract(x,y));
	}

}
