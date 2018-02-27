package tic.tac.toe;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class GameMode extends Pane {

    protected final Text text;
    protected final Button single;
    protected final Button remote;
    protected final Button local;

    public GameMode() {

        text = new Text();
        single = new Button();
        remote = new Button();
        local = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(444.0);
        setPrefWidth(666.0);
        setStyle("-fx-background-color: black;");

        text.setFill(javafx.scene.paint.Color.valueOf("#e13434"));
        text.setLayoutX(89.0);
        text.setLayoutY(81.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Choose your Game Mode ");
        text.setFont(new Font("Showcard Gothic", 38.0));

        single.setLayoutX(208.0);
        single.setLayoutY(139.0);
        single.setMnemonicParsing(false);
        single.setPrefHeight(49.0);
        single.setPrefWidth(251.0);
        single.setStyle("-fx-background-color: black; -fx-border-color: #e13434; -fx-border-radius: 5;");
        single.setText("single player");
        single.setTextFill(javafx.scene.paint.Color.valueOf("#e13434"));
        single.setFont(new Font("Showcard Gothic", 21.0));

        remote.setLayoutX(207.0);
        remote.setLayoutY(320.0);
        remote.setMnemonicParsing(false);
        remote.setPrefHeight(49.0);
        remote.setPrefWidth(251.0);
        remote.setStyle("-fx-background-color: black; -fx-border-color: #e13434; -fx-border-radius: 5;");
        remote.setText("Remote two players");
        remote.setTextFill(javafx.scene.paint.Color.valueOf("#e13434"));
        remote.setFont(new Font("Showcard Gothic", 18.0));

        local.setLayoutX(208.0);
        local.setLayoutY(232.0);
        local.setMnemonicParsing(false);
        local.setPrefHeight(49.0);
        local.setPrefWidth(251.0);
        local.setStyle("-fx-background-color: black; -fx-border-color: #e13434; -fx-border-radius: 5;");
        local.setText("local two players");
        local.setTextFill(javafx.scene.paint.Color.valueOf("#e13434"));
        local.setFont(new Font("Showcard Gothic", 18.0));

        getChildren().add(text);
        getChildren().add(single);
        getChildren().add(remote);
        getChildren().add(local);

    }
}
