package tic.tac.toe;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ServerClient extends Pane {

    protected final Button server;
    protected final Button client;
    protected final Text text;

    public ServerClient() {

        server = new Button();
        client = new Button();
        text = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(273.0);
        setPrefWidth(744.0);
        setStyle("-fx-background-color: black;");

        server.setLayoutX(46.0);
        server.setLayoutY(150.0);
        server.setMnemonicParsing(false);
        server.setPrefHeight(67.0);
        server.setPrefWidth(186.0);
        server.setStyle("-fx-background-color: black; -fx-border-radius: 7; -fx-border-color: #e13434;");
        server.setText("Run as a server ");
        server.setTextFill(javafx.scene.paint.Color.valueOf("#e13434"));
        server.setFont(new Font("Showcard Gothic", 17.0));

        client.setLayoutX(512.0);
        client.setLayoutY(150.0);
        client.setMnemonicParsing(false);
        client.setPrefHeight(67.0);
        client.setPrefWidth(186.0);
        client.setStyle("-fx-background-color: black; -fx-border-radius: 7; -fx-border-color: #e13434;");
        client.setText("Run as a client ");
        client.setTextFill(javafx.scene.paint.Color.valueOf("#e13434"));
        client.setFont(new Font("Showcard Gothic", 17.0));

        text.setFill(javafx.scene.paint.Color.valueOf("#e13434"));
        text.setLayoutX(163.0);
        text.setLayoutY(61.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("How do you want to run the game?");
        text.setFont(new Font("Showcard Gothic", 23.0));

        getChildren().add(server);
        getChildren().add(client);
        getChildren().add(text);

    }
}
