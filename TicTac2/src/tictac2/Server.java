/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictac2;

/**
 *
 * @author hos4mohamed
 */
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

    ServerSocket serverSocket;


    public Server(int portNum) throws IOException{
        serverSocket = new ServerSocket(portNum,2);
        while(true){

            Socket s = serverSocket.accept();

            new Handler(s,serverSocket);

        }
    }

    public static void main(String[] args) throws IOException {
        new Server(5005);

    }


}
