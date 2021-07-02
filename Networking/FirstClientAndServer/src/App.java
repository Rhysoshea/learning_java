import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


import java.net.ServerSocket;

public class App {
    public static void main(String[] args) throws Exception {
        // this is a server to be used with the EchoClient project

        try(ServerSocket serverSocket = new ServerSocket(5000)) {


            while(true) {
                // Socket socket = serverSocket.accept();
                // Echoer echoer = new Echoer(socket);
                // echoer.start();
                // one line 
                new Echoer(serverSocket.accept()).start();
            }

        } catch(IOException e) {
            System.out.println("Server exception " + e.getMessage());
        }

    }
}
