package Junit;

import org.junit.*;

/*
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
*/


class Jsum {
	SumMoney m12CHF;
	SumMoney m14CHF;
	SumMoney m14USD;
	static int count = 0;

	@BeforeEach
	public void commonsumMoney() {
		m12CHF = new SumMoney(12, "CHF");
		m14CHF= new SumMoney(14, "CHF");
		m14USD= new SumMoney(14, "USD");
		count++;
		System.out.println("before : " + count);

	}

	@AfterEach
	public void printAfter() {
		System.out.println("After : " + count);
	}

	@Test
	public void testEquals() {
		SumMoney expected = new SumMoney(26, "CHF");
		SumMoney result = m12CHF.add(m14CHF);
		Assert.assertTrue(expected.equals(result));
	}


	@Test
	public void testEqualsMethod() {
		Assert.assertEquals(m12CHF, m12CHF);
		Assert.assertTrue(!m12CHF.equals(m14CHF));
		Assert.assertTrue(!m14USD.equals(m14CHF));
	}

	/*
	 * 7) On teste le retour de la m�thode equals, elle doit nous retourner false en comparant un objet 14 CHF et un objet 14 USD
	 * 8) Ok
	 * 9) ??
	 * 10) Ok
	 * 11) Exception / Throw
	*/
}
