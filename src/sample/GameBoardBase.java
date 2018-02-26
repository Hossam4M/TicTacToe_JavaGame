package sample;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.ParallelCamera;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;


import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Dictionary;

import static java.lang.Integer.parseInt;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javax.swing.JOptionPane;

public class GameBoardBase extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Button Button1;
    protected final Button Button2;
    protected final Button Button3;
    protected final Button Button4;
    protected final Button Button5;
    protected final Button Button6;
    protected final ParallelCamera parallelCamera;
    protected final Button Button7;
    protected final Button Button8;
    protected final Button Button9;
    protected int move;
    protected int counter;
    protected int moveFlag;
    protected boolean flagInit;
    protected Button btn;
    protected String shape;
    protected boolean gameRole;
    protected boolean xWin;
    protected boolean oWin;
    protected int tie;


    Client client;
//    protected Dictionary BtnDict;
    protected Button[] BtnArr;


    public GameBoardBase() throws IOException {

        client = new Client();

        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        Button1 = new Button();
        Button2 = new Button();
        Button3 = new Button();
        Button4 = new Button();
        Button5 = new Button();
        Button6 = new Button();
        parallelCamera = new ParallelCamera();
        Button7 = new Button();
        Button8 = new Button();
        Button9 = new Button();
        BtnArr = new Button[]{Button1,Button2,Button3,Button4,Button5,Button6,Button7,Button8,Button9};
        moveFlag = 0;
        flagInit = true;
        shape = "";
        gameRole = false;
        tie = 0;

        move=0;


        setId("tic tac toe");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(500.0);
        setPrefWidth(700.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);


        GridPane.setColumnIndex(Button2, 1);
        Button2.setLayoutX(10.0);
        Button2.setLayoutY(10.0);

        GridPane.setColumnIndex(Button3, 2);
        Button3.setLayoutX(244.0);
        Button3.setLayoutY(10.0);

        GridPane.setRowIndex(Button4, 1);
        Button4.setLayoutX(10.0);
        Button4.setLayoutY(10.0);

        GridPane.setColumnIndex(Button5, 1);
        GridPane.setRowIndex(Button5, 1);
        Button5.setLayoutX(10.0);
        Button5.setLayoutY(10.0);

        GridPane.setColumnIndex(Button6, 2);
        GridPane.setRowIndex(Button6, 1);
        Button6.setLayoutX(477.0);
        Button6.setLayoutY(10.0);

        GridPane.setRowIndex(Button7, 2);
        Button7.setLayoutX(10.0);
        Button7.setLayoutY(10.0);

        GridPane.setColumnIndex(Button8, 1);
        GridPane.setRowIndex(Button8, 2);
        Button8.setLayoutX(10.0);
        Button8.setLayoutY(344.0);

        GridPane.setColumnIndex(Button9, 2);
        GridPane.setRowIndex(Button9, 2);
        Button9.setLayoutX(244.0);
        Button9.setLayoutY(344.0);

        getColumnConstraints().add(columnConstraints);
        getColumnConstraints().add(columnConstraints0);
        getColumnConstraints().add(columnConstraints1);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        getChildren().add(Button1 );
        getChildren().add(Button2);
        getChildren().add(Button3);
        getChildren().add(Button4);
        getChildren().add(Button5);
        getChildren().add(Button6);
        getChildren().add(parallelCamera);
        getChildren().add(Button7);
        getChildren().add(Button8);
        getChildren().add(Button9);

        counter = 1;

        for (Button btni : BtnArr){
            btni.setMnemonicParsing(false);
            btni.setPrefHeight(172.0);
            btni.setPrefWidth(234.0);
            btni.setOnAction(this::type);
            btni.setId("" + counter);
            btni.setDisable(true);
            counter++;
        }

    }



    public void type(ActionEvent event){
        if(moveFlag % 2 == 0 && flagInit && gameRole){
            btn = (Button) event.getTarget();
            client.ps.println(shape + btn.getId());
            flagInit = false;
        }
    }

    public class Client {

        Socket mySocket;
        DataInputStream dis;
        PrintStream ps;
        Thread thReceive;
        String replyMsg;




        public Client() throws IOException {

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

                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                if(replyMsg.equals("X")){
                                    shape = replyMsg;
                                    gameRole = true;
                                }

                                else if(replyMsg.equals("O")){
                                    if(!shape.equals("X")){
                                        shape = replyMsg;

                                    }

                                    for (Button btnj : BtnArr){
                                        btnj.setDisable(false);
                                    }

                                }
                                else {
                                    BtnArr[parseInt(String.valueOf(replyMsg.charAt(1)))-1].setText(String.valueOf(replyMsg.charAt(0)));
                                    System.out.println(shape);
                                    BtnArr[parseInt(String.valueOf(replyMsg.charAt(1)))-1].setDisable(true);
                                    gameRole = true;
                                    if(moveFlag % 2 == 0 && flagInit){
                                        moveFlag += 2;
                                    } else if(moveFlag % 2 == 0 && !flagInit){
                                        moveFlag++;
                                    } else if(moveFlag % 2 != 0 && !flagInit){
                                        moveFlag++;
                                        flagInit = true;
                                    }
                                    check();
                                }



                            }
                        });



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

    public void check(){
        tie++;
        System.out.println(tie);
        checkRow();
        checkColomn();
        checkDiagonal();
        if(xWin || oWin){
            for (Button btnj : BtnArr){
                btnj.setDisable(true);
            }
            Alert a =new Alert(AlertType.INFORMATION);
            
            a.setTitle("Finished");            
            a.setHeaderText("");
            if(xWin && shape.equals("X")){
                System.out.println("X Win");
                a.setContentText("You Win!");
            
            }else if(oWin && shape.equals("O")){
                
                a.setContentText("You Win!");
            
            }else{
                a.setContentText("You Lose :(");
            }
            
            a.showAndWait();
            System.exit(0);
            }else if(tie == 9 && !xWin && !oWin){
                Alert a =new Alert(AlertType.INFORMATION);
                a.setTitle("Finished");            
                a.setHeaderText("");
                System.out.println("Tie");
                a.setContentText("Tie");
                a.showAndWait();
                System.exit(0);
            }
        

    }

    public void checkRow(){
        int x1=0,o1=0;
        int x2=0,o2=0;
        int x3=0,o3=0;


        for(int i=0; i<3 ;i++){
            if(BtnArr[i].getText().equals("X")){
                x1++;
                if(x1 == 3)
                    xWin=true;

            }else if(BtnArr[i].getText().equals("O")){
                o1++;
                if(o1 == 3)
                    oWin=true;

            }
        }




        for(int i=3; i<6 ;i++){
            if(BtnArr[i].getText().equals("X")){
                x2++;
                if(x2 == 3)
                    xWin=true;
            }else if(BtnArr[i].getText().equals("O")){
                o2++;
                if(o2 == 3)
                    oWin=true;
            }
        }


        for(int i=6; i<9 ;i++){
            if(BtnArr[i].getText().equals("X")){
                x3++;
                if(x3 == 3)
                    xWin=true;
            }else if(BtnArr[i].getText().equals("O")){
                o3++;
                if(o3 == 3)
                    oWin=true;
            }
        }



    }

    public void checkColomn(){
        int x1=0,o1=0;
        int x2=0,o2=0;
        int x3=0,o3=0;
        for (int i=0;i<7;i+=3){
            if(BtnArr[i].getText().equals("X")){
                x1++;
                if(x1==3)
                    xWin = true;
            }else if(BtnArr[i].getText().equals("O")){
                o1++;
                if(o1 == 3)
                    oWin = true;
            }
        }




        for (int i=1;i<8;i+=3){
            if(BtnArr[i].getText().equals("X")){
                x2++;
                if(x2==3)
                    xWin = true;

            }else if(BtnArr[i].getText().equals("O")){
                o2++;
                if(o2 == 3)
                    oWin = true;
            }
        }



        for (int i=2;i<9;i+=3){
            if(BtnArr[i].getText().equals("X")){
                x3++;
                if(x3==3)
                    xWin = true;
            }else if(BtnArr[i].getText().equals("O")){
                o3++;
                if(o3 == 3)
                    oWin = true;
            }
        }

    }

    public void checkDiagonal(){
        int x1=0,o1=0;
        int x2=0,o2=0;
        for(int i=0;i<9;i+=4){
            if(BtnArr[i].getText().equals("X")){
                x1++;
                if(x1==3)
                    xWin = true;
            }else if(BtnArr[i].getText().equals("O")){
                o1++;
                if(o1==3)
                    oWin = true;
            }
        }

        for(int i=2;i<7;i+=2){
            if(BtnArr[i].getText().equals("X")){
                x2++;
                if(x2 == 3)
                    xWin = true;
            }else if(BtnArr[i].getText().equals("O")){
                o2++;
                if(o2==3)
                    oWin = true;
            }
        }

    }



}