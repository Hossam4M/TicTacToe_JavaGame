package sample;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

    ServerSocket serverSocket;
    static int portNum = 5005;

    public Server() throws IOException{
        serverSocket = new ServerSocket(portNum,2);
        while(true){

            Socket s = serverSocket.accept();

            new Handler(s);

        }
    }

    public static void main(String[] args) throws IOException {
        new Server();

    }


}

