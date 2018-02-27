package tic.tac.toe;


import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class validate extends Pane {

    protected final Button exit;
    protected final Button play;
    protected final Text text;
    protected final TextField textField;
    protected final Text text0;
    protected final Text text1;
    protected final TextField textField0;
    protected final TextField textField1;

    public validate() {

        exit = new Button();
        play = new Button();
        text = new Text();
        textField = new TextField();
        text0 = new Text();
        text1 = new Text();
        textField0 = new TextField();
        textField1 = new TextField();

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
        text.setLayoutX(29.0);
        text.setLayoutY(86.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Enter server name");
        text.setFont(new Font("Showcard Gothic", 25.0));

        textField.setLayoutX(300.0);
        textField.setLayoutY(65.0);
        textField.setStyle("-fx-border-color: #e13434; -fx-border-radius: 5;");

        text0.setFill(javafx.scene.paint.Color.valueOf("#e13434"));
        text0.setLayoutX(38.0);
        text0.setLayoutY(159.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Enter server ip");
        text0.setFont(new Font("Showcard Gothic", 25.0));

        text1.setFill(javafx.scene.paint.Color.valueOf("#e13434"));
        text1.setLayoutX(43.0);
        text1.setLayoutY(234.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText(" server Port number");
        text1.setFont(new Font("Showcard Gothic", 25.0));

        textField0.setLayoutX(300.0);
        textField0.setLayoutY(138.0);
        textField0.setStyle("-fx-border-color: #e13434; -fx-border-radius: 5;");

        textField1.setLayoutX(300.0);
        textField1.setLayoutY(213.0);
        textField1.setStyle("-fx-border-color: #e13434; -fx-border-radius: 5;");

        getChildren().add(exit);
        getChildren().add(play);
        getChildren().add(text);
        getChildren().add(textField);
        getChildren().add(text0);
        getChildren().add(text1);
        getChildren().add(textField0);
        getChildren().add(textField1);

    }
}
