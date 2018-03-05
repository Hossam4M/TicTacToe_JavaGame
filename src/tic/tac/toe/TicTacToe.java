/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class TicTacToe extends Application {
     Stage window;

   

    @Override
    public void start(Stage primaryStage) throws Exception {
       window = primaryStage;
             ThegameboardBase Game= new ThegameboardBase ();
               starting start= new  starting  ();
          Replay replay =new Replay();
             validateServer Validate = new validateServer ();
             name1 name_page= new name1 ();
             GameMode1 mode = new GameMode1 ();
             ServerClient1 cs = new ServerClient1 ();
             ClosingAlert close = new ClosingAlert  ();
            ServerName Servername = new ServerName  ();
            AlertBox alertbox=new AlertBox();
            
             
        Scene scene = new Scene(start);
        Scene scene1 = new Scene(Game);
        Scene scene2 = new Scene(Validate);
        Scene scene3 = new Scene(mode);
        Scene scene4 = new Scene(name_page);
        Scene scene5 = new Scene(cs);
       
        Scene scene6 = new Scene(close);
        Scene scene7 = new Scene(Servername);
        Scene scene8 = new Scene(replay);
         Servername.backi.setOnMouseClicked((MouseEvent e) -> {
         
            window.setScene(scene3);
             });
          Validate.backi.setOnMouseClicked((MouseEvent e) -> {
         
            window.setScene(scene3);
             });
        name_page.backi.setOnMouseClicked((MouseEvent e) -> {
         
            window.setScene(scene3);
             });
         mode.backi.setOnMouseClicked((MouseEvent e) -> {
         
            window.setScene(scene);
             });
         
        start.play.setOnAction(e -> {
                 window.setScene(scene3);
             });
        start.replay.setOnAction(e -> {
                 window.setScene(scene8);
             });
        Servername.play.setOnAction(e -> {
                 window.setScene(scene1);
             });
         start.exit.setOnAction(e -> {
             boolean exit;
                exit= alertbox.display();
                if(exit){
                     window.close();
                }
             });
          
         name_page.exit.setOnAction(e -> {
             boolean exit;
                exit= alertbox.display();
                if(exit){
                     window.close();
                }
             });
          Validate.exit.setOnAction(e -> {
             boolean exit;
                exit= alertbox.display();
                if(exit){
                     window.close();
                }
             });
       Game.exit.setOnAction(e -> {
             boolean exit;
                exit= alertbox.display();
                if(exit){
                     window.close();
                }
             });
       Servername.exit.setOnAction(e -> {
             boolean exit;
                exit= alertbox.display();
                if(exit){
                     window.close();
                }
             });
         cs.server.setOnAction(e -> {
                 window.setScene(scene7);
             });
          cs.client.setOnAction(e -> {
                 window.setScene(scene2);
             });
           mode.single.setOnAction(e -> {
                 window.setScene(scene4);
             });
            mode.local.setOnAction(e -> {
                 window.setScene(scene5);
             });
             mode.remote.setOnAction(e -> {
                 window.setScene(scene5);
             });
              name_page.play.setOnAction(e -> {
                 window.setScene(scene1);
             });
             Validate.play.setOnAction(e -> {
                 window.setScene(scene1);
             });
             
                        
            
             window.setTitle("Tic Tac Toe");
       
        window.setScene(scene);
        window.show();
         
       
        
    }
       public static void main(String[] args) {
            launch(args);
    }
        public class AlertBox{
        boolean answer;
    public  boolean display(){
       
    Stage window1 =new Stage();
    ClosingAlert close = new ClosingAlert  ();
    window1.initModality(Modality.APPLICATION_MODAL);
     
    
            window1.setTitle("ConfirmCosing");
        window1.setMinWidth(250);

     close.yes.setOnAction(e -> {
            answer = true;
            window1.close();
        });
        close.no.setOnAction(e -> {
            answer = false;
            window1.close();
        });

        Scene  scene= new Scene(close);
        window1.setScene(scene);
        window1.showAndWait();
        return answer;
    }
    
    
    }
      

}
