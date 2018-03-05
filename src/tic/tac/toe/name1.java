package tic.tac.toe;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class name1 extends Pane {

    protected final Button exit;
    protected final Button play;
    protected final Text text;
    protected final TextField textField;
    protected final Button back;
    protected final ImageView backi;
    protected final Text text0;
    protected final Button level1;
    protected final Button level2;
    protected final Button level3;

    public name1() {

        exit = new Button();
        play = new Button();
        text = new Text();
        textField = new TextField();
        back = new Button();
        backi = new ImageView();
        text0 = new Text();
        level1 = new Button();
        level2 = new Button();
        level3 = new Button();

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
        text.setLayoutY(169.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Enter your name :");
        text.setFont(new Font("Showcard Gothic", 30.0));

        textField.setLayoutX(412.0);
        textField.setLayoutY(136.0);
        textField.setPrefHeight(49.0);
        textField.setPrefWidth(226.0);
        textField.setStyle("-fx-background-radius: 9; -fx-border-color: #0d1b4c; -fx-border-radius: 9; -fx-font-color: red;");
        textField.setFont(new Font("Showcard Gothic", 16.0));

        back.setLayoutX(68.0);
        back.setLayoutY(65.0);
        back.setMnemonicParsing(false);
        back.setPrefHeight(49.0);
        back.setPrefWidth(100.0);
        back.setStyle("-fx-background-color: #C5E3F6;");
        back.setTextFill(javafx.scene.paint.Color.valueOf("#c5e3f6"));

        backi.setFitHeight(131.0);
        backi.setFitWidth(134.0);
        backi.setLayoutX(25.0);
        backi.setLayoutY(14.0);
        backi.setPickOnBounds(true);
        backi.setPreserveRatio(true);
        backi.setImage(new Image(getClass().getResource("../../../14-512.png").toExternalForm()));

        text0.setFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        text0.setLayoutX(27.0);
        text0.setLayoutY(279.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("choose the game levl");
        text0.setFont(new Font("Showcard Gothic", 30.0));

        level1.setLayoutX(24.0);
        level1.setLayoutY(340.0);
        level1.setMnemonicParsing(false);
        level1.setPrefHeight(65.0);
        level1.setPrefWidth(176.0);
        level1.setStyle("-fx-background-color: #C5E3F6;");
        level1.setText("level 1");
        level1.setTextFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        level1.setFont(new Font("Showcard Gothic", 35.0));

        level2.setLayoutX(303.0);
        level2.setLayoutY(350.0);
        level2.setMnemonicParsing(false);
        level2.setPrefHeight(65.0);
        level2.setPrefWidth(176.0);
        level2.setStyle("-fx-background-color: #C5E3F6;");
        level2.setText("level 2");
        level2.setTextFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        level2.setFont(new Font("Showcard Gothic", 35.0));

        level3.setLayoutX(654.0);
        level3.setLayoutY(350.0);
        level3.setMnemonicParsing(false);
        level3.setPrefHeight(65.0);
        level3.setPrefWidth(176.0);
        level3.setStyle("-fx-background-color: #C5E3F6;");
        level3.setText("level 3");
        level3.setTextFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        level3.setFont(new Font("Showcard Gothic", 35.0));

        getChildren().add(exit);
        getChildren().add(play);
        getChildren().add(text);
        getChildren().add(textField);
        getChildren().add(back);
        getChildren().add(backi);
        getChildren().add(text0);
        getChildren().add(level1);
        getChildren().add(level2);
        getChildren().add(level3);

    }
}
