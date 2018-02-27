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
             GameBoardBase Game= new  GameBoardBase  ();
             starting_page start= new starting_page ();
             validate Validate = new validate ();
             name name_page= new name ();
             GameMode mode = new GameMode ();
             ServerClient cs = new ServerClient ();
                 ClosingAlert close = new ClosingAlert  ();
                  AlertBox alertbox=new AlertBox();
            
             
        Scene scene = new Scene(start);
        Scene scene1 = new Scene(Game);
        Scene scene2 = new Scene(Validate);
        Scene scene3 = new Scene(mode);
        Scene scene4 = new Scene(name_page);
        Scene scene5 = new Scene(cs);
        Scene scene6 = new Scene(close);
        start.play.setOnAction(e -> {
                 window.setScene(scene3);
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
         cs.server.setOnAction(e -> {
                 window.setScene(scene4);
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

     close.Yes.setOnAction(e -> {
            answer = true;
            window1.close();
        });
        close.No.setOnAction(e -> {
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
