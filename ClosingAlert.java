package tic.tac.toe;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class ClosingAlert extends Pane {

    protected final Text text;
    protected final Button Yes;
    protected final Button No;

    public ClosingAlert() {

        text = new Text();
        Yes = new Button();
        No = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(222.0);
        setPrefWidth(746.0);
        setStyle("-fx-background-color: black; -fx-background-radius: 10;");
  

        text.setFill(javafx.scene.paint.Color.valueOf("#e13434"));
        text.setLayoutX(60.0);
        text.setLayoutY(64.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Are you sure you want to close the game?");
        text.setFont(new Font("Showcard Gothic", 28.0));

        Yes.setLayoutX(134.0);
        Yes.setLayoutY(120.0);
        Yes.setMnemonicParsing(false);
        Yes.setPrefHeight(43.0);
        Yes.setPrefWidth(106.0);
        Yes.setStyle("-fx-background-color: black; -fx-border-color: #e13434; -fx-border-radius: 5;");
        Yes.setText("Yes");
        Yes.setTextFill(javafx.scene.paint.Color.valueOf("#e13434"));
        Yes.setFont(new Font("Showcard Gothic", 21.0));

        No.setLayoutX(474.0);
        No.setLayoutY(120.0);
        No.setMnemonicParsing(false);
        No.setPrefHeight(43.0);
        No.setPrefWidth(106.0);
        No.setStyle("-fx-background-color: black; -fx-border-color: #e13434; -fx-border-radius: 5;");
        No.setText("No");
        No.setTextFill(javafx.scene.paint.Color.valueOf("#e13434"));
        No.setFont(new Font("Showcard Gothic", 21.0));

        getChildren().add(text);
        getChildren().add(Yes);
        getChildren().add(No);

    }
}
