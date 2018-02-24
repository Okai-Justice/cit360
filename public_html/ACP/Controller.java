import java.util.*;

public class Controller {
	public static HashMap<String,SimpleHandler> hashMapOfCommands = new HashMap<String,SimpleHandler>();
	
	
	public static void handleUserInput(String commandPrompt, Integer num1, Integer num2) {
		/*Allows read the user commands from the main class as well as use
		 
		 */
		
		//This populate out hashMap with instances of our classes to run in the calculator when our numbers go through.
		hashMapOfCommands.put("+", new Addition());
		hashMapOfCommands.put("-", new Subtraction());
		
		//with the user command entered, we can not grab it from our hashMap.
		MathUp handler = hashMapOfCommands.get(commandPrompt);
		
		//Now we use the executor to run the class associated with the commandPrompt from our code.
		handler.execute(num1, num2);
		
	}
}