/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class TicTacToe extends Application {

   

    @Override
    public void start(Stage primaryStage) throws Exception {
             GameBoardBase fxb= new GameBoardBase ();
        Scene scene = new Scene(fxb, 500, 400);
            primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
       public static void main(String[] args) {
            launch(args);
    }

}
