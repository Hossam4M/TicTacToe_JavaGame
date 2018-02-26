/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictac2;



import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TicTac2 extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setOnCloseRequest(t -> System.exit(0));

        Parent root = new GameBoardBase();
        primaryStage.setTitle("TicTacGame");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);

    }
}