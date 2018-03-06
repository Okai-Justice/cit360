
import javax.xml.ws.handler.Handler;



/**
 *
 * @author JIL
 */
public abstract class Add implements Handler{
	
	public void execute(Integer num1, Integer num2) {
		Integer sum = num1 + num2;
		System.out.println(sum);
	}
}