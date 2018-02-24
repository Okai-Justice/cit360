import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		Controller delegateIt = new Controller(); 
		//this will allow "delegate" the activity here to our controller.
		Integer num1;
		Integer num2;
		String commandPrompt;
		
		Scanner userInput = new Scanner(System.in);
		//This takes the data needed to run our calculator.
		System.out.print("Please enter a number: ");
		num1 = Integer.parseInt(userInput.nextLine());
		
		System.out.println("Please enter one of the following ");
		System.out.print("+ or -: ");
		commandPrompt = userInput.nextLine();
		
		System.out.print("Please enter a number: ");
		num2 = Integer.parseInt(userInput.nextLine());
		//This will print out the initial user input
		System.out.println(num1 + commandPrompt + num2);
		
		//This will delegate the information over to the Controller where our interfaces and methods will do the work.
		delegateIt.handleUserInput(commandPrompt, num1, num2);
	}
}