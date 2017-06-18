package week6.chat;

import java.io.IOException;

/**
 * Created by gorobec on 18.06.17.
 */
public class ServerRun {
    public static void main(String[] args) throws IOException {
        Server server = new Server();
        while (true) {
            server.run();
        }
    }
}
