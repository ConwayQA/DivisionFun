package Mainer;

import java.util.Scanner;

public class UserInput {
	Scanner input = new Scanner(System.in);
	boolean check = true;
	int num1 = 0;
	int num2 = 1;
	int answer = 1;
	
	public void getUserInput() {
		try {
			while (answer == 1) {
				num1 = getInputNumber();
				num2 = getInputNumber();
				Division divider = new Division();
				System.out.println(divider.divide(num1, num2, false));
				inputContinue();
			}
		} finally {
			input.close();
		}
	}
	
	public int getInputNumber() {
		int tempNum = 0;
		while (check) {
			try {
				System.out.println("Input number: ");
				tempNum = Integer.parseInt(input.nextLine());
				check = false;
			} catch(NumberFormatException nfe) {
				System.out.println("Please input a number!!");
			}
		}
		check = true;
		return tempNum;
	}
	
	public void inputContinue() {
		while (check) {
			try {
				System.out.println("Do you want to go again? [1] Yes!  [2] No! ");
				answer = Integer.parseInt(input.nextLine());
				if (answer == 1 || answer == 2) {
				} else {
					throw new InputException();
				}
				check = false;
			} catch(NumberFormatException nfe) {
				System.out.println("Please input a number!!");
			} catch(InputException ie) {
				System.out.println("Please input a valid choice!");
			}
		}
		check = true;
	}

}
