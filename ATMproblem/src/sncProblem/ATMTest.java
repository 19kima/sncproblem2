package sncProblem;

import java.util.Scanner;

public class ATMTest {

	public static void main(String args[]) {
		String fullCommand;
		String command;
		String number;
		int quit = 1;
		Scanner input = new Scanner(System.in);
		ATM eric = new ATM();

		do {
			fullCommand = input.nextLine();
			command = Character.toString((fullCommand.toLowerCase()).charAt(0));
			switch (command) {
			case "r":
				eric.refill();
				break;
			case "w":
				number = fullCommand.substring(fullCommand.indexOf("$") + 1);
				int take = Integer.parseInt(number);
				eric.take(take);
				break;
			case "i":
				number = fullCommand + " ";
				if (number.contains(" $100 ")) {
					System.out.println("$100 - " + eric.getHundreds());
				}
				if (number.contains(" $50 ")) {
					System.out.println("$50 - " + eric.getFifty());
				}
				if (number.contains(" $20 ")) {
					System.out.println("$20 - " + eric.getTwenty());
				}
				if (number.contains(" $10 ")) {
					System.out.println("$10 - " + eric.getTens());
				}
				if (number.contains(" $5 ")) {
					System.out.println("$5 - " + eric.getFives());
				}
				if (number.contains(" $1 ")) {
					System.out.println("$1 - " + eric.getOnes());
				}
				break;
			case "a":
				eric.addThousend();
				break;
			case "q":
				quit = 0;
				break;
			default:
				System.out.println("Failure: Invalid Command");
				break;
			}
		} while (quit == 1);

	}
}