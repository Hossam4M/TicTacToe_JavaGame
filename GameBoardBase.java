package tic.tac.toe;

import static java.awt.SystemColor.text;
import javafx.event.ActionEvent;
import javafx.scene.ParallelCamera;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Text;

public  class GameBoardBase extends GridPane {

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
    private final int[][] wins = new int[][] { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 }, { 0, 4, 8 }, { 2, 4, 6 } };
 
    public GameBoardBase() {

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

        Button1.setMnemonicParsing(false);
        Button1.setPrefHeight(172.0);
        Button1.setPrefWidth(234.0);
       
           Button1.setOnAction(e -> {
               if(move%2==0){
             Button1.setDisable(true);
             Button1.setText("x");
             Button1.setStyle("-fx-font-size: 6em; -fx-text-fill: red; ");
              move++;}
              else{
              Button1.setText("o");
             Button1.setStyle("-fx-font-size: 6em; -fx-text-fill: blue;");
              move++;}
              
            
        });

        GridPane.setColumnIndex(Button2, 1);
        Button2.setLayoutX(10.0);
        Button2.setLayoutY(10.0);
        Button2.setMnemonicParsing(false);
        Button2.setPrefHeight(172.0);
        Button2.setPrefWidth(234.0);
       
            Button2.setOnAction((ActionEvent event) ->
            {Button2.setDisable(true);
                if(move%2==0){
              Button2.setText("x");
             Button2.setStyle("-fx-font-size: 6em; -fx-text-fill: red; ");
              move++;}
              else{
              Button2.setText("o");
             Button2.setStyle("-fx-font-size: 6em; -fx-text-fill: blue;");
              move++;}
         
            
        });

        GridPane.setColumnIndex(Button3, 2);
        Button3.setLayoutX(244.0);
        Button3.setLayoutY(10.0);
        Button3.setMnemonicParsing(false);
        Button3.setPrefHeight(172.0);
        Button3.setPrefWidth(234.0);
       
            Button3.setOnAction((ActionEvent event) -> {
                Button3.setDisable(true);
                if(move%2==0){
              Button3.setText("x");
             Button3.setStyle("-fx-font-size: 6em; -fx-text-fill: red; ");
              move++;}
              else{
              Button3.setText("o");
             Button3.setStyle("-fx-font-size: 6em; -fx-text-fill: blue;");
              move++;}
               
            
        });

        GridPane.setRowIndex(Button4, 1);
        Button4.setLayoutX(10.0);
        Button4.setLayoutY(10.0);
        Button4.setMnemonicParsing(false);
        Button4.setPrefHeight(172.0);
        Button4.setPrefWidth(234.0);
            Button4.setOnAction((ActionEvent event) -> {
                Button4.setDisable(true);
              if(move%2==0){
              Button4.setText("x");
             Button4.setStyle("-fx-font-size: 6em; -fx-text-fill: red; ");
              move++;}
              else{
              Button4.setText("o");
             Button4.setStyle("-fx-font-size: 6em; -fx-text-fill: blue;");
              move++;}
            
        });
        

        GridPane.setColumnIndex(Button5, 1);
        GridPane.setRowIndex(Button5, 1);
        Button5.setLayoutX(10.0);
        Button5.setLayoutY(10.0);
        Button5.setMnemonicParsing(false);
        Button5.setPrefHeight(172.0);
        Button5.setPrefWidth(234.0);
            Button5.setOnAction((ActionEvent event) -> {
                Button5.setDisable(true);
             if(move%2==0){
              Button5.setText("x");
             Button5.setStyle("-fx-font-size: 6em; -fx-text-fill: red; ");
              move++;}
              else{
              Button5.setText("o");
             Button5.setStyle("-fx-font-size: 6em; -fx-text-fill: blue;");
              move++;}
            
        });
        

        GridPane.setColumnIndex(Button6, 2);
        GridPane.setRowIndex(Button6, 1);
        Button6.setLayoutX(477.0);
        Button6.setLayoutY(10.0);
        Button6.setMnemonicParsing(false);
        Button6.setPrefHeight(172.0);
        Button6.setPrefWidth(234.0);
            Button6.setOnAction((ActionEvent event) -> {
               Button6.setDisable(true);
                if(move%2==0){
              Button6.setText("x");
             Button6.setStyle("-fx-font-size: 6em; -fx-text-fill: red; ");
              move++;}
              else{
              Button6.setText("o");
             Button6.setStyle("-fx-font-size: 6em; -fx-text-fill: blue;");
              move++;}
            
        });
       

        GridPane.setRowIndex(Button7, 2);
        Button7.setLayoutX(10.0);
        Button7.setLayoutY(10.0);
        Button7.setMnemonicParsing(false);
        Button7.setPrefHeight(172.0);
        Button7.setPrefWidth(234.0);
            Button7.setOnAction((ActionEvent event) -> {
                Button7.setDisable(true);
                    if(move%2==0){
              Button7.setText("x");
             Button7.setStyle("-fx-font-size: 6em; -fx-text-fill: red; ");
              move++;}
              else{
              Button7.setText("o");
             Button7.setStyle("-fx-font-size: 6em; -fx-text-fill: blue;");
              move++;}
              
            
        });
    
        GridPane.setColumnIndex(Button8, 1);
        GridPane.setRowIndex(Button8, 2);
        Button8.setLayoutX(10.0);
        Button8.setLayoutY(344.0);
        Button8.setMnemonicParsing(false);
        Button8.setPrefHeight(172.0);
        Button8.setPrefWidth(234.0);
            Button8.setOnAction((ActionEvent event) -> {
              Button8.setDisable(true);
            if(move%2==0){
              Button8.setText("x");
             Button8.setStyle("-fx-font-size: 6em; -fx-text-fill: red; ");
              move++;}
              else{
              Button8.setText("o");
             Button8.setStyle("-fx-font-size: 6em; -fx-text-fill: blue;");
              move++;}
             
       
        });
     

        GridPane.setColumnIndex(Button9, 2);
        GridPane.setRowIndex(Button9, 2);
        Button9.setLayoutX(244.0);
        Button9.setLayoutY(344.0);
        Button9.setMnemonicParsing(false);
        Button9.setPrefHeight(172.0);
        Button9.setPrefWidth(234.0);
            Button9.setOnAction((ActionEvent event) -> {
        
           Button9.setDisable(true);
             if(move%2==0){
              Button9.setText("x");
             Button9.setStyle("-fx-font-size: 6em; -fx-text-fill: red; ");
              move++;}
              else{
              Button9.setText("o");
             Button9.setStyle("-fx-font-size: 6em; -fx-text-fill: blue;");
              move++;}
            
        });
       

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
         

    }
}
