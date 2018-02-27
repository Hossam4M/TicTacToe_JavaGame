package tic.tac.toe;

import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class TheGame extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final ColumnConstraints columnConstraints3;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final Button reset;
    protected final Button exit;
    protected final Text text;
    protected final Text text0;
    protected final Text text1;
    protected final Text text2;
    protected final Line line;
    protected final Button button1;
    protected final Button button2;
    protected final Button button3;
    protected final Button button4;
    protected final Button button5;
    protected final Button button6;
    protected final Button button7;
    protected final Button button8;
    protected final Button button9;

    public TheGame() {

        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        columnConstraints3 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        reset = new Button();
        exit = new Button();
        text = new Text();
        text0 = new Text();
        text1 = new Text();
        text2 = new Text();
        line = new Line();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();
        button6 = new Button();
        button7 = new Button();
        button8 = new Button();
        button9 = new Button();

        setFocusTraversable(true);
        setGridLinesVisible(true);
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(638.0);
        setPrefWidth(915.0);
        setStyle("-fx-border-style: solid; -fx-background-color: black; -fx-cell-border-color: #e13434 ;");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(100.0);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(reset, 3);
        GridPane.setColumnSpan(reset, 2);
        GridPane.setRowIndex(reset, 3);
        reset.setMnemonicParsing(false);
        reset.setPrefHeight(224.0);
        reset.setPrefWidth(179.0);
        reset.setStyle("-fx-background-color: black; -fx-border-color: #e13434; -fx-border-width: 7;");
        reset.setText("Reset");
        reset.setTextFill(javafx.scene.paint.Color.valueOf("#e13434"));
        reset.setFont(new Font("Showcard Gothic", 35.0));

        GridPane.setColumnIndex(exit, 4);
        GridPane.setRowIndex(exit, 3);
        exit.setLayoutX(560.0);
        exit.setLayoutY(435.0);
        exit.setMnemonicParsing(false);
        exit.setPrefHeight(212.0);
        exit.setPrefWidth(179.0);
        exit.setStyle("-fx-background-color: black; -fx-border-color: #e13434; -fx-border-width: 7;");
        exit.setText("Exit");
        exit.setTextFill(javafx.scene.paint.Color.valueOf("#e13434"));
        exit.setFont(new Font("Showcard Gothic", 35.0));

        GridPane.setColumnIndex(text, 3);
        GridPane.setRowIndex(text, 1);
        text.setFill(javafx.scene.paint.Color.valueOf("#e13434"));
        text.setLineSpacing(50.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setStyle("-fx-line-spacing: 4; -fx-text-alignment: center;");
        text.setText("Player1");
        text.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        text.setWrappingWidth(190.0);
        text.setFont(new Font("Showcard Gothic", 30.0));

        GridPane.setColumnIndex(text0, 3);
        GridPane.setRowIndex(text0, 2);
        text0.setFill(javafx.scene.paint.Color.valueOf("#e13434"));
        text0.setLineSpacing(50.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setStyle("-fx-line-spacing: 4; -fx-text-alignment: center;");
        text0.setText("Player2");
        text0.setTextAlignment(javafx.scene.text.TextAlignment.RIGHT);
        text0.setWrappingWidth(190.0);
        text0.setFont(new Font("Showcard Gothic", 30.0));

        GridPane.setColumnIndex(text1, 4);
        GridPane.setRowIndex(text1, 1);
        text1.setFill(javafx.scene.paint.Color.valueOf("#e13434"));
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("       0");
        text1.setWrappingWidth(190.0);
        text1.setFont(new Font("Showcard Gothic", 58.0));

        GridPane.setColumnIndex(text2, 4);
        GridPane.setRowIndex(text2, 2);
        text2.setFill(javafx.scene.paint.Color.valueOf("#e13434"));
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("       0");
        text2.setWrappingWidth(190.0);
        text2.setFont(new Font("Showcard Gothic", 58.0));

        line.setEndX(100.0);
        line.setStartX(-100.0);

        GridPane.setRowIndex(button1, 1);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(216.0);
        button1.setPrefWidth(259.0);
        button1.setStyle("-fx-background-color: white;");
        button1.setFont(new Font("Showcard Gothic", 55.0));

        GridPane.setColumnIndex(button2, 1);
        GridPane.setRowIndex(button2, 1);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(230.0);
        button2.setPrefWidth(195.0);
        button2.setStyle("-fx-background-color: white;");
        button2.setFont(new Font("Showcard Gothic", 56.0));

        GridPane.setColumnIndex(button3, 2);
        GridPane.setRowIndex(button3, 1);
        button3.setMnemonicParsing(false);
        button3.setPrefHeight(221.0);
        button3.setPrefWidth(215.0);
        button3.setStyle("-fx-background-color: white;");
        button3.setFont(new Font("Showcard Gothic", 54.0));

        GridPane.setRowIndex(button4, 2);
        button4.setMnemonicParsing(false);
        button4.setPrefHeight(321.0);
        button4.setPrefWidth(209.0);
        button4.setStyle("-fx-background-color: white;");
        button4.setFont(new Font("Showcard Gothic", 55.0));

        GridPane.setColumnIndex(button5, 1);
        GridPane.setRowIndex(button5, 2);
        button5.setMnemonicParsing(false);
        button5.setPrefHeight(287.0);
        button5.setPrefWidth(324.0);
        button5.setStyle("-fx-background-color: white;");
        button5.setFont(new Font(55.0));

        GridPane.setColumnIndex(button6, 2);
        GridPane.setRowIndex(button6, 2);
        button6.setMnemonicParsing(false);
        button6.setPrefHeight(321.0);
        button6.setPrefWidth(273.0);
        button6.setStyle("-fx-background-color: white;");
        button6.setFont(new Font("Showcard Gothic", 55.0));

        GridPane.setRowIndex(button7, 3);
        button7.setMnemonicParsing(false);
        button7.setPrefHeight(220.0);
        button7.setPrefWidth(270.0);
        button7.setStyle("-fx-background-color: white;");
        button7.setFont(new Font("Showcard Gothic", 56.0));

        GridPane.setColumnIndex(button8, 1);
        GridPane.setRowIndex(button8, 3);
        button8.setMnemonicParsing(false);
        button8.setPrefHeight(222.0);
        button8.setPrefWidth(417.0);
        button8.setStyle("-fx-background-color: white;");

        GridPane.setColumnIndex(button9, 2);
        GridPane.setRowIndex(button9, 3);
        button9.setMnemonicParsing(false);
        button9.setPrefHeight(220.0);
        button9.setPrefWidth(362.0);
        button9.setStyle("-fx-background-color: white;");
        button9.setFont(new Font("Showcard Gothic", 56.0));

        getColumnConstraints().add(columnConstraints);
        getColumnConstraints().add(columnConstraints0);
        getColumnConstraints().add(columnConstraints1);
        getColumnConstraints().add(columnConstraints2);
        getColumnConstraints().add(columnConstraints3);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        getRowConstraints().add(rowConstraints2);
        getChildren().add(reset);
        getChildren().add(exit);
        getChildren().add(text);
        getChildren().add(text0);
        getChildren().add(text1);
        getChildren().add(text2);
        getChildren().add(line);
        getChildren().add(button1);
        getChildren().add(button2);
        getChildren().add(button3);
        getChildren().add(button4);
        getChildren().add(button5);
        getChildren().add(button6);
        getChildren().add(button7);
        getChildren().add(button8);
        getChildren().add(button9);

    }
}
