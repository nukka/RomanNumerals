
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		// To be Implemented
		parseNumbers(romanNum);

		return 0;

	}

	public int parseNumbers(String romanNum) {

		int parsedNumber = 0;
		if (romanNum == "I") {
			parsedNumber = 1;
		} else if (romanNum == "V") {
			parsedNumber = 5;
		} else if (romanNum == "X") {
			parsedNumber = 10;
		} else if (romanNum == "L") {
			parsedNumber = 50;
		} else if (romanNum == "C") {
			parsedNumber = 100;
		} else if (romanNum == "D") {
			parsedNumber = 500;
		} else if (romanNum == "M") {
			parsedNumber = 500;
		} else {
			System.out.println("Not legal roman number");
			return 0;
		}
		return parsedNumber;
	}
	
	
}
