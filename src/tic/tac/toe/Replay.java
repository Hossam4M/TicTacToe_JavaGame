package tic.tac.toe;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Replay extends AnchorPane {

    protected final TextArea textArea;
    protected final Text text;
    protected final ImageView imageView;
    protected final Button button;

    public Replay() {

        textArea = new TextArea();
        text = new Text();
        imageView = new ImageView();
        button = new Button();

        setId("AnchorPane");
        setPrefHeight(570.0);
        setPrefWidth(877.0);
        setStyle("-fx-background-color: #C5E3F6;");

        textArea.setLayoutY(73.0);
        textArea.setPrefHeight(200.0);
        textArea.setPrefWidth(428.0);
        textArea.setStyle("-fx-background-color: #C5E3F6;");
        textArea.setVisible(false);

        text.setFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        text.setLayoutX(280.0);
        text.setLayoutY(135.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("choose a game  ");
        text.setFont(new Font("Showcard Gothic", 40.0));

        imageView.setFitHeight(150.0);
        imageView.setFitWidth(200.0);
        imageView.setLayoutX(43.0);
        imageView.setLayoutY(41.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("../../../oie_5105816DKudecF4.gif").toExternalForm()));

        button.setLayoutX(26.0);
        button.setLayoutY(219.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(66.0);
        button.setPrefWidth(274.0);
        button.setStyle("-fx-background-color: #C5E3F6;");
        button.setText("Ahmed VS Mohammed");
        button.setTextFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        button.setFont(new Font("Showcard Gothic", 22.0));

        getChildren().add(textArea);
        getChildren().add(text);
        getChildren().add(imageView);
        getChildren().add(button);

    }
}
