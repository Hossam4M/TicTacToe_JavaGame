package tic.tac.toe;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class starting_page extends Pane {

    protected final Button play;
    protected final Button exit;
    protected final Text text;

    public starting_page() {

        play = new Button();
        exit = new Button();
        text = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(450.0);
        setPrefWidth(728.0);
        setStyle("-fx-background-color: black;");

        play.setLayoutX(560.0);
        play.setLayoutY(343.0);
        play.setMnemonicParsing(false);
        play.setPrefHeight(51.0);
        play.setPrefWidth(135.0);
        play.setStyle("-fx-background-color: black; -fx-opacity: 2; -fx-background-insets: 3; -fx-background-position: 2; -fx-border-color: e13434; -fx-border-radius: 10;");
        play.setText("Play");
        play.setTextFill(javafx.scene.paint.Color.valueOf("#e13434"));
        play.setFont(new Font("Showcard Gothic", 25.0));

        exit.setLayoutX(33.0);
        exit.setLayoutY(345.0);
        exit.setMnemonicParsing(false);
        exit.setPrefHeight(43.0);
        exit.setPrefWidth(135.0);
        exit.setStyle("-fx-background-color: black; -fx-opacity: 2; -fx-background-insets: 3; -fx-background-position: 2; -fx-border-color: e13434; -fx-border-radius: 10;");
        exit.setText("Exit");
        exit.setTextFill(javafx.scene.paint.Color.valueOf("#e13434"));
        exit.setTextOverrun(javafx.scene.control.OverrunStyle.LEADING_ELLIPSIS);
        exit.setFont(new Font("Showcard Gothic", 25.0));

        text.setFill(javafx.scene.paint.Color.valueOf("#e13434"));
        text.setLayoutX(114.0);
        text.setLayoutY(221.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Tic Tac Toe");
        text.setWrappingWidth(599.13671875);
        text.setFont(new Font("Showcard Gothic", 90.0));

        getChildren().add(play);
        getChildren().add(exit);
        getChildren().add(text);

    }
}
