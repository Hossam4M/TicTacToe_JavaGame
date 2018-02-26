package sample;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Vector;

public class Handler extends Thread {

    DataInputStream dis;
    PrintStream ps;
    String str;
    static Vector<Handler> clientsVector = new Vector<Handler>();
//    static Handler[] clientsVector = new Handler[2];

    public Handler(Socket cs) throws IOException
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
        start();

    }

    public void run()
    {
        while(true)
        {

            try {
                str = dis.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            sendMessageToAll(str);
        }
    }

    void sendMessageToAll(String msg)
    {
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

    }

}

