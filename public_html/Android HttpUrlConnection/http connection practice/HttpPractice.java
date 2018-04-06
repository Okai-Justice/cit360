import java.net.*;
import java.io.*;

public class HttpPractice {
    public static void main(String[] args) throws Exception {
        URL byuiMyschool = new URL("https://www.byui.edu");//Url we are pulling from 
      
        URLConnection see = byuiMyschool.openConnection();//Opens the connection with the URL.
        
        BufferedReader in = new BufferedReader(new InputStreamReader(see.getInputStream()));
        String inputLine;
        
        //As long as the "in" is not null, it will continue to print
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
    }
}
