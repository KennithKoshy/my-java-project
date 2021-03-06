package com.rakuten.training.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo
{
	public static <T> T combine(T o1,T o2)
	{
		//some logic for combining o1 and o2
		return null;
	}
	
	public static void printAll(List<?> l)
	{	
	}
	
	public static double sumTheList(List<? extends Number> nList)
	{
		double sum = 0;
//		nList.add(123);
		for(Number n : nList)
		{
			sum += n.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args)
	{	
		String s =  combine("Hello ", "World!");
//		String x = combine("abc", 10);
		Integer sum =  combine(10,32);
		
		Object o = new Integer(42);
		List l = new ArrayList();
		
//		List<Object> l1 = new ArrayList<Integer>();
		List<Float> fList = new ArrayList<>();
		sumTheList(fList);
		ArrayList<Integer> iList = new ArrayList<Integer>();
		iList.add(123);
		double sum1 = sumTheList(iList);
		//iList.add("abc");
		
//		List<Object> oList = iList;
//		oList.add("abc");	
//		int val = iList.get(1);
	}
}