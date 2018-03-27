import android.os.Handler;
import android.widget.TextView;

import org.ter.json.JSONInputStream;
import org.ter.json.JSONOutputStream;


import java.net.Socket;
import java.util.HashMap;

public class TER implements Runnable {

    private final int numMessagesSent;
    private final String messageForServer;
    private final Handler uiThreadStack;

    public TER(int currentNumMessagesSent, String aMessageForServer, Handler aUIThreadStack) {
        this.numMessagesSent = currentNumMessagesSent;
        this.messageForServer = aMessageForServer;
        this.uiThreadStack = aUIThreadStack;
    }
    @Override
    public void run() {
        try {
            Socket toServer = new Socket("10.0", 989);
            final JSONInputStream inFromServer =
                    new JSONInputStream(toServer.getInputStream());
            final JSONOutputStream outToServer =
                    new JSONOutputStream(toServer.getOutputStream());

            HashMap<String,Object> commandMap = new HashMap<>();
            commandMap.put("command", "Speak");
            commandMap.put("count",this.numMessagesSent);
            commandMap.put("message", this.messageForServer);

            outToServer.writeObject(commandMap);
            System.out.println("waiting for response");
            HashMap<String,Object> response = (HashMap<String, Object>) inFromServer.readObject();
            System.out.println("response: "+response);
            if(response.get("command").equals("Done")){
                final TextView responseView = TextView.get();
                uiThreadStack.post(new Runnable() {
                    @Override
                    public void run() {
                        if (responseView != null) {
                            responseView.setText("Sent " + TER.this.messageForServer
                                    + ". Message number " + TER.this.numMessagesSent);
                        }
                    }
                });
            }
        } catch (Exception e) {
            final String theErrorMessage = e.getLocalizedMessage();
            final TextView responseView = TextView.get();
            uiThreadStack.post(new Runnable() {
                @Override
                public void run() {
                    if (responseView != null) {
                        responseView.setText("Error: Unable to communicate. " + theErrorMessage);
                    }
                }
            });
        }
    }

}