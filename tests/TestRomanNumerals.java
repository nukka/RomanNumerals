import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void ConvertString() {
		RomanNumerals numerals = new RomanNumerals();
		int number = numerals.parseNumbers("V");
		assertEquals(number, 5);

	}

	@Test
	public void ConvertStringThatDoesNotExit() {
		RomanNumerals numerals = new RomanNumerals();
		int number = numerals.parseNumbers("asd");
		assertEquals(number, 0);

	}

}
