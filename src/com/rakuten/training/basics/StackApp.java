package com.rakuten.training.basics;

public class StackApp
{
	public static void main(String[] args)
	{
		Stack st = new FixedArrayStack(9);
//		Stack st = new DynaStack();
		StackUser u = new StackUser();
		u.fill(st);
	}
}