import javax.sound.sampled.Port;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws Exception {



            //my ip address 10.37.152.220
            // noas 10.37.159.214
            //Self ip adress is 12.0.0.1
//hernadez is 10.34.
            System.out.println("Connecting to server");

            Socket newSocket = new Socket("10.37.152.220", 3256);

            while (true) {

                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Put in next text: --------------------------------");
                String userName = myObj.nextLine();  // Read user input

                OutputStream out = newSocket.getOutputStream();

                ObjectOutputStream objOut = new ObjectOutputStream(out);
if(userName == "Null"){
    System.exit(0);
    System.out.println("Quit");

}
                objOut.writeObject(userName);
            }


    }
}
