package week6.chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by gorobec on 18.06.17.
 */
public class Server {
    private static final int PORT = 5555;

    private ServerSocket serverSocket;

    private BufferedReader is;
    private BufferedWriter os;

    private BufferedReader consoleReader;

    public Server() {

        try {
            serverSocket = new ServerSocket(PORT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        consoleReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void run() throws IOException {

        Socket socket;
        try {
            socket = serverSocket.accept();
            System.out.println("Client connected");
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }




        try {
            is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            os = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            System.out.println("Get streams");
            os.write("Welcome to chat!\n");
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }



        String serverMessage;
        String clientMessage;

        while (true){

            clientMessage = is.readLine();
            System.out.printf("[Client]: >> %s\n", clientMessage);

            if(clientMessage.equalsIgnoreCase("Bye")) return;

//
            serverMessage = consoleReader.readLine();

            os.write(serverMessage + "\n");
            os.flush();

        }
    }

}
