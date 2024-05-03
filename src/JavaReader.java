import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

public class JavaReader implements Runnable{
    Socket actualSocket ;
    CoolData inData;
ObjectInputStream objIn;


    public JavaReader(Socket actualSocket, CoolData inData) throws Exception {
        this.actualSocket = actualSocket;
        this.inData = inData;
        InputStream in = actualSocket.getInputStream();
      objIn = new ObjectInputStream(in);

    }

    public void run() {
        try {
       while(true) {
           Object inMessage1 = objIn.readObject();
           inData.put(inMessage1);
       }
       }catch(Exception e){
        }


    }
}
