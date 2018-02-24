
import javax.xml.ws.handler.Handler;



public abstract class Subtract implements Handler{
	
	public void execute(Integer num1, Integer num2) {
		Integer sum = num1 - num2;
		System.out.println(sum);
	}


}