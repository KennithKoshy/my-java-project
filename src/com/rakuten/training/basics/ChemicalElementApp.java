package com.rakuten.training.basics;
public class ChemicalElementApp
{
	public static void main(String[] args)
	{	
		ChemicalElement h = new ChemicalElement(1, "H", "Hydrogen");
		System.out.println("Is Hydrogen an Alkali? "+h.isAlkaliMetal());
		
		ChemicalElement k = new ChemicalElement(19, "K", "Potassium");
		System.out.println("Is Potassium an Alkali? "+k.isAlkaliMetal());
		
		ChemicalElement z = new ChemicalElement(30, "Zn", "Zinc");
		System.out.println("Is Zinc an Alkali? "+z.isAlkaliMetal());
		System.out.println("Is Zinc a Transition Metal? "+z.isTransitionMetal());
		
		ChemicalElement h2 = new ChemicalElement(1, "H", "Hydrogen");	
		System.out.println("Are h and h2 same? "+(h == h2));
		System.out.println("Are h and h2 equal? "+(h.equals(h2)));
	}
}