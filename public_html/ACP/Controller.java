import java.util.Add;
import java.util.HashMap;
import java.util.logging.Handler;
import java.util.logging.Subtract;


public class Controller {
	public static HashMap<String,Handler> hashMapOfCommands = new HashMap<String,Handler>();
	/*The HashMap here not only store the strings but to also call our other classes! Instead of using case
	 * or switch, this allows us to move through the code easier. Below we will put in other items we
	 * will need to make the HashMap useful for our calculator.
	 */

	
	public static void handleUserInput(String commandPrompt, Integer num1, Integer num2) {
		/*This method right here allows us to read the user commands from the main class as well as use
		 * the .put method to populate our mathCommands with something to work with and the execute method
		 * to execute our code when the user inputs information.
		 */
		
		//From here we have populated out hashMap with instances of our classes to run in the calculator when our numbers go through.
		hashMapOfCommands.put("+", new Add());
		hashMapOfCommands.put("-", new Subtract());
		
		//with the user command entered, we can not grab it from our hashMap.
		Handler handler = hashMapOfCommands.get(commandPrompt);
		
		
	}
}