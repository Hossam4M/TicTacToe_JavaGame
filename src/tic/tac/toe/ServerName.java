package tic.tac.toe;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ServerName extends Pane {

    protected final Button exit;
    protected final Button play;
    protected final Text text;
    protected final TextField textField;
    protected final Button button1;
    protected final ImageView backi;

    public ServerName() {

        exit = new Button();
        play = new Button();
        text = new Text();
        textField = new TextField();
        button1 = new Button();
        backi = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(570.0);
        setPrefWidth(877.0);
        setStyle("-fx-background-color: #C5E3F6;");

        exit.setLayoutX(24.0);
        exit.setLayoutY(478.0);
        exit.setMnemonicParsing(false);
        exit.setPrefHeight(45.0);
        exit.setPrefWidth(134.0);
        exit.setStyle("-fx-background-color: #C5E3F6;");
        exit.setText("Exit");
        exit.setTextFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        exit.setFont(new Font("Showcard Gothic", 35.0));

        play.setLayoutX(614.0);
        play.setLayoutY(478.0);
        play.setMnemonicParsing(false);
        play.setPrefHeight(65.0);
        play.setPrefWidth(255.0);
        play.setStyle("-fx-background-color: #C5E3F6;");
        play.setText("Play");
        play.setTextFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        play.setFont(new Font("Showcard Gothic", 35.0));

        text.setFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        text.setLayoutX(27.0);
        text.setLayoutY(258.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Enter your name :");
        text.setFont(new Font("Showcard Gothic", 35.0));

        textField.setLayoutX(412.0);
        textField.setLayoutY(223.0);
        textField.setPrefHeight(49.0);
        textField.setPrefWidth(226.0);
        textField.setStyle("-fx-background-radius: 9; -fx-border-color: #0d1b4c; -fx-border-radius: 9; -fx-font-color: red;");
        textField.setFont(new Font("Showcard Gothic", 16.0));

        button1.setLayoutX(68.0);
        button1.setLayoutY(65.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(49.0);
        button1.setPrefWidth(100.0);
        button1.setStyle("-fx-background-color: #C5E3F6;");
        button1.setTextFill(javafx.scene.paint.Color.valueOf("#c5e3f6"));

        backi.setFitHeight(131.0);
        backi.setFitWidth(134.0);
        backi.setLayoutX(25.0);
        backi.setLayoutY(14.0);
        backi.setPickOnBounds(true);
        backi.setPreserveRatio(true);
        backi.setImage(new Image(getClass().getResource("../../../14-512.png").toExternalForm()));

        getChildren().add(exit);
        getChildren().add(play);
        getChildren().add(text);
        getChildren().add(textField);
        getChildren().add(button1);
        getChildren().add(backi);

    }
}
