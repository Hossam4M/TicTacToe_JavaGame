package tic.tac.toe;


import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class name extends Pane {

    protected final Button exit;
    protected final Button play;
    protected final Text text;
    protected final TextField textField;

    public name() {

        exit = new Button();
        play = new Button();
        text = new Text();
        textField = new TextField();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);
        setStyle("-fx-background-color: black;");

        exit.setLayoutX(29.0);
        exit.setLayoutY(308.0);
        exit.setMnemonicParsing(false);
        exit.setPrefHeight(45.0);
        exit.setPrefWidth(134.0);
        exit.setStyle("-fx-background-color: black; -fx-border-radius: 10; -fx-border-color: #e13434;");
        exit.setText("Exit");
        exit.setTextFill(javafx.scene.paint.Color.valueOf("#e13434"));
        exit.setFont(new Font("Showcard Gothic", 21.0));

        play.setLayoutX(434.0);
        play.setLayoutY(308.0);
        play.setMnemonicParsing(false);
        play.setPrefHeight(45.0);
        play.setPrefWidth(134.0);
        play.setStyle("-fx-background-color: black; -fx-border-radius: 10; -fx-border-color: #e13434;");
        play.setText("Play");
        play.setTextFill(javafx.scene.paint.Color.valueOf("#e13434"));
        play.setFont(new Font("Showcard Gothic", 21.0));

        text.setFill(javafx.scene.paint.Color.valueOf("#e13434"));
        text.setLayoutX(30.0);
        text.setLayoutY(174.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Enter your name");
        text.setFont(new Font("Showcard Gothic", 30.0));

        textField.setLayoutX(344.0);
        textField.setLayoutY(152.0);
        textField.setStyle("-fx-border-color: #e13434; -fx-border-radius: 5;");

        getChildren().add(exit);
        getChildren().add(play);
        getChildren().add(text);
        getChildren().add(textField);

    }
}
