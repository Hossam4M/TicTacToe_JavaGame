package tic.tac.toe;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class starting extends AnchorPane {

    protected final Text text;
    protected final ImageView imageView;
    protected final Button play;
    protected final Button exit;
    protected final Button replay;

    public starting() {

        text = new Text();
        imageView = new ImageView();
        play = new Button();
        exit = new Button();
        replay = new Button();

        setId("AnchorPane");
        setPrefHeight(570.0);
        setPrefWidth(877.0);
        setStyle("-fx-background-color: #C5E3F6;");

        text.setLayoutX(156.0);
        text.setLayoutY(129.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("tic tac toe");
        text.setWrappingWidth(564.13671875);
        text.setFont(new Font("Showcard Gothic", 90.0));

        imageView.setFitHeight(150.0);
        imageView.setFitWidth(200.0);
        imageView.setLayoutX(24.0);
        imageView.setLayoutY(247.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
            imageView.setImage(new Image(getClass().getResource("../../../tumblr_static_bmo.gif").toExternalForm()));

        play.setLayoutX(346.0);
        play.setLayoutY(203.0);
        play.setMnemonicParsing(false);
        play.setStyle("-fx-background-color: #C5E3F6;");
        play.setText("play");
        play.setFont(new Font("Showcard Gothic", 48.0));

        exit.setLayoutX(356.0);
        exit.setLayoutY(426.0);
        exit.setMnemonicParsing(false);
        exit.setStyle("-fx-background-color: #C5E3F6;");
        exit.setText("exit");
        exit.setFont(new Font("Showcard Gothic", 48.0));

        replay.setLayoutX(291.0);
        replay.setLayoutY(332.0);
        replay.setMnemonicParsing(false);
        replay.setStyle("-fx-background-color: #C5E3F6;");
        replay.setText("watch a game");
        replay.setFont(new Font("Showcard Gothic", 35.0));

        getChildren().add(text);
        getChildren().add(imageView);
        getChildren().add(play);
        getChildren().add(exit);
        getChildren().add(replay);

    }
}
