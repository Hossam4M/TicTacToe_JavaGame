package tic.tac.toe;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ServerClient1 extends Pane {

    protected final Button server;
    protected final Button client;
    protected final Text text;
    protected final ImageView imageView;
    protected final ImageView imageView0;

    public ServerClient1() {

        server = new Button();
        client = new Button();
        text = new Text();
        imageView = new ImageView();
        imageView0 = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(273.0);
        setPrefWidth(744.0);
        setStyle("-fx-background-color: #C5E3F6;");

        server.setLayoutX(46.0);
        server.setLayoutY(150.0);
        server.setMnemonicParsing(false);
        server.setPrefHeight(67.0);
        server.setPrefWidth(186.0);
        server.setStyle("-fx-background-color: #C5E3F6;");
        server.setText("Host a game");
        server.setTextFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        server.setFont(new Font("Showcard Gothic", 17.0));

        client.setLayoutX(440.0);
        client.setLayoutY(151.0);
        client.setMnemonicParsing(false);
        client.setPrefHeight(67.0);
        client.setPrefWidth(186.0);
        client.setStyle("-fx-background-color: #C5E3F6;");
        client.setText("play a game");
        client.setTextFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        client.setFont(new Font("Showcard Gothic", 17.0));

        text.setFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        text.setLayoutX(163.0);
        text.setLayoutY(61.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("How do you want to run the game?");
        text.setFont(new Font("Showcard Gothic", 23.0));

        imageView.setFitHeight(84.0);
        imageView.setFitWidth(147.0);
        imageView.setLayoutX(198.0);
        imageView.setLayoutY(142.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("../../../1_-_Data_Center-256.png").toExternalForm()));

        imageView0.setFitHeight(51.0);
        imageView0.setFitWidth(76.0);
        imageView0.setLayoutX(590.0);
        imageView0.setLayoutY(159.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("../../../Computer-Icon.png").toExternalForm()));

        getChildren().add(server);
        getChildren().add(client);
        getChildren().add(text);
        getChildren().add(imageView);
        getChildren().add(imageView0);

    }
}
