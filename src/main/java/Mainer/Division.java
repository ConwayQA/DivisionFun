package Mainer;

public class Division {
	
	public String divide(int num1, int num2, boolean test3) {
		try {
			//SizeException se = new SizeException();
			if (test3) {
				Integer num3 = null;
				num2 = num3;
			}
			if (num2 > num1) {
				throw new SizeException();
			}
			return ("The answer is: " + (num1 / num2));
		} catch (ArithmeticException ae) {
			return ("Dont divide my 0 you mad man!");
		} catch (NullPointerException npe) {
			return ("Please dont use null integers!");
		} catch(SizeException se) {
			return ("Bigger number first please!");
		} catch (Exception other) {
			return ("I don't know what you did but don't!");
		}
	}
}
