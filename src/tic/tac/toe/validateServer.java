package tic.tac.toe;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class validateServer extends AnchorPane {

    protected final Text text;
    protected final Text text0;
    protected final Text text1;
    protected final Button button;
    protected final ImageView backi;
    protected final Button exit;
    protected final Button play;
    protected final TextField textField;
    protected final TextField textField0;
    protected final TextField textField1;
    protected final Text text2;
    protected final Text text3;

    public validateServer() {

        text = new Text();
        text0 = new Text();
        text1 = new Text();
        button = new Button();
        backi = new ImageView();
        exit = new Button();
        play = new Button();
        textField = new TextField();
        textField0 = new TextField();
        textField1 = new TextField();
        text2 = new Text();
        text3 = new Text();

        setId("AnchorPane");
        setPrefHeight(570.0);
        setPrefWidth(877.0);
        setStyle("-fx-background-color: #C5E3F6;");

        text.setFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        text.setLayoutX(44.0);
        text.setLayoutY(118.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("enter your name :");
        text.setFont(new Font("Showcard Gothic", 39.0));

        text0.setFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        text0.setLayoutX(44.0);
        text0.setLayoutY(243.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("enter server ip :");
        text0.setFont(new Font("Showcard Gothic", 39.0));

        text1.setFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        text1.setLayoutX(44.0);
        text1.setLayoutY(368.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("enter server port :");
        text1.setFont(new Font("Showcard Gothic", 39.0));

        button.setLayoutX(44.0);
        button.setLayoutY(28.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(39.0);
        button.setPrefWidth(128.0);
        button.setStyle("-fx-background-color: #C5E3F6;");

        backi.setFitHeight(134.0);
        backi.setFitWidth(143.0);
        backi.setLayoutX(14.0);
        backi.setLayoutY(-27.0);
        backi.setPickOnBounds(true);
        backi.setPreserveRatio(true);
        backi.setImage(new Image(getClass().getResource("../../../14-512.png").toExternalForm()));

        exit.setLayoutX(26.0);
        exit.setLayoutY(491.0);
        exit.setMnemonicParsing(false);
        exit.setStyle("-fx-background-color: #C5E3F6;");
        exit.setText("exit");
        exit.setTextFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        exit.setFont(new Font("Showcard Gothic", 25.0));

        play.setLayoutX(750.0);
        play.setLayoutY(491.0);
        play.setMnemonicParsing(false);
        play.setStyle("-fx-background-color: #C5E3F6;");
        play.setText("play");
        play.setTextFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        play.setFont(new Font("Showcard Gothic", 25.0));

        textField.setLayoutX(466.0);
        textField.setLayoutY(92.0);
        textField.setPrefHeight(31.0);
        textField.setPrefWidth(228.0);
        textField.setStyle("-fx-border-color: #0d1b4c; -fx-background-radius: 9; -fx-border-radius: 9;");
        textField.setFont(new Font("Showcard Gothic", 15.0));

        textField0.setLayoutX(466.0);
        textField0.setLayoutY(216.0);
        textField0.setPrefHeight(31.0);
        textField0.setPrefWidth(228.0);
        textField0.setStyle("-fx-border-color: #0d1b4c; -fx-background-radius: 9; -fx-border-radius: 9;");
        textField0.setFont(new Font("Showcard Gothic", 15.0));

        textField1.setLayoutX(466.0);
        textField1.setLayoutY(341.0);
        textField1.setPrefHeight(31.0);
        textField1.setPrefWidth(228.0);
        textField1.setStyle("-fx-border-color: #0d1b4c; -fx-background-radius: 9; -fx-border-radius: 9;");
        textField1.setFont(new Font("Showcard Gothic", 15.0));

        text2.setFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        text2.setLayoutX(510.0);
        text2.setLayoutY(280.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("(  eg : 192.168.1.0  )");
        text2.setWrappingWidth(154.615234375);
        text2.setFont(new Font(15.0));

        text3.setFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        text3.setLayoutX(539.0);
        text3.setLayoutY(401.0);
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("(  eg : 6781  )");
        text3.setWrappingWidth(154.615234375);
        text3.setFont(new Font(15.0));

        getChildren().add(text);
        getChildren().add(text0);
        getChildren().add(text1);
        getChildren().add(button);
        getChildren().add(backi);
        getChildren().add(exit);
        getChildren().add(play);
        getChildren().add(textField);
        getChildren().add(textField0);
        getChildren().add(textField1);
        getChildren().add(text2);
        getChildren().add(text3);

    }
}
