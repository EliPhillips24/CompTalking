import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
            String message = "Yo";
            System.out.println("made scoket for message");
            ServerSocket mySocket = new ServerSocket(3256);
            Socket actualSocket = mySocket.accept();
            InputStream in = actualSocket.getInputStream();
        System.out.println("Message Start");
        System.out.println("--------------------------------");

        CoolData queue = new CoolData();
        JavaReader myDataReader = new JavaReader(actualSocket, queue);
        ProgramLogicDoer myProgramLogic = new ProgramLogicDoer(queue);
        Thread dataReadThread = new Thread (myDataReader);
        Thread programLogicThread = new Thread(myDataReader);

        dataReadThread.start();
        programLogicThread.start();


    }
}
//127.0.0.1