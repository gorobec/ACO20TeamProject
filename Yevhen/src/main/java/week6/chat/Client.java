package week6.chat;

import java.io.*;
import java.net.Socket;

/**
 * Created by gorobec on 18.06.17.
 */
public class Client {

    private static final int PORT = 5555;

    private Socket socket;

    private BufferedReader is;
    private BufferedWriter os;

    private BufferedReader consoleReader;

    public Client() {

        try {
            socket = new Socket("192.168.1.101", PORT);
            System.out.println("Connected to server");
            is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            os = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            System.out.println("Get streams");
        } catch (IOException e) {
            e.printStackTrace();
        }
        consoleReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void run() throws IOException {

        String clientMessage;

        while (true) {

            System.out.printf("[Server]: >> %s\n", is.readLine());

            clientMessage = consoleReader.readLine();

            os.write(clientMessage + "\n");
            os.flush();

            if(clientMessage.equalsIgnoreCase("Bye")) return;

        }
    }
}
