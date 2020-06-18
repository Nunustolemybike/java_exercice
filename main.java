package Junit;

public class Main {

	public static void main(String[] args) {
		SumMoney somme1 = new SumMoney(100, "$");
		SumMoney somme2 = new SumMoney(45, "€");
		SumMoney somme3 = new SumMoney(150, "CHF");
		SumMoney somme4 = new SumMoney(100, "$");
		System.out.println(somme1.equals(somme4));
		System.out.println(somme2.equals(somme3));
		System.out.println(somme1.equals(somme2));
	}
}
