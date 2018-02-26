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
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Handler extends Thread {

    DataInputStream dis;
    PrintStream ps;
    String str;
    static Vector<Handler> clientsVector = new Vector<Handler>();
    ServerSocket serverSocket;
    int counter;

    public Handler(Socket cs,ServerSocket serverSocket1) throws IOException
    {
        dis = new DataInputStream(cs.getInputStream());
        ps = new PrintStream(cs.getOutputStream());
        clientsVector.add(this);

        if(clientsVector.size() == 1){
            ps.println("X");
        }

        if(clientsVector.size() == 2){
            for(Handler ch : clientsVector){
                ch.ps.println("O");
            }


        }
        serverSocket = serverSocket1;
        counter = 0;
        start();


    }

    public void run()
    {

        while(true)
        {

            try {
                str = dis.readLine();
            } catch (IOException e) {
                try {
                    dis.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }

            try {
                sendMessageToAll(str);
            } catch (IOException e) {
                System.out.println("done");
            }
        }
    }

    void sendMessageToAll(String msg) throws IOException {
        if (msg != null){
            for(Handler ch : clientsVector) {
                if(clientsVector.size() == 2){
                    try {
                        ch.ps.println(msg);
                    } catch (Exception e) {
                        clientsVector.remove(ch);

                    }
                }

            }
        }
        else if(counter == 0){
            counter++;
            if(clientsVector.size() != 0){
                for(Handler ch : clientsVector) {
                    ch.ps.println("disconnect");
                    ch.ps.close();
                    ch.dis.close();
                }

            }



        }

    }

}


