package sample;

import javafx.application.Platform;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

public class Client {

    Socket mySocket;
    DataInputStream dis;
    PrintStream ps;
    Thread thReceive;
    String replyMsg;


    public Client() throws IOException {

        System.out.println("done");

        mySocket = new Socket("127.0.0.1", 5005);
        dis = new DataInputStream(mySocket.getInputStream());
        ps = new PrintStream(mySocket.getOutputStream());

        thReceive = new Thread(() -> {
            while(true){

                try {
                    replyMsg = dis.readLine();

                } catch (IOException ex) {
                    ex.getStackTrace();
                }
                if(replyMsg != null){
                    System.out.println(replyMsg);
//                    Platform.runLater(() -> Button1.setText("x"));
                }else{
                    ps.close();
                    try {
                        dis.close();
                    } catch (IOException ex) {
                        ex.getStackTrace();
                    }
                    try {
                        mySocket.close();
                    } catch (IOException ex) {
                        ex.getStackTrace();
                    }

                    break;

                }

            }
        });

        thReceive.start();

    }

//    public static void main(String[] args) throws IOException {
//        new Client();
//    }

}


