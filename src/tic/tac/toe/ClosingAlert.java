package tic.tac.toe;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ClosingAlert extends Pane {

    protected final Text text;
    protected final Button yes;
    protected final Button no;
    protected final ImageView imageView;
    protected final ImageView imageView0;

    public ClosingAlert() {

        text = new Text();
        yes = new Button();
        no = new Button();
        imageView = new ImageView();
        imageView0 = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(222.0);
        setPrefWidth(746.0);
        setStyle("-fx-background-color: #C5E3F6; -fx-background-radius: 10;");

        text.setFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        text.setLayoutX(60.0);
        text.setLayoutY(64.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Are you sure you want to close the game?");
        text.setFont(new Font("Showcard Gothic", 28.0));

        yes.setLayoutX(134.0);
        yes.setLayoutY(120.0);
        yes.setMnemonicParsing(false);
        yes.setPrefHeight(43.0);
        yes.setPrefWidth(106.0);
        yes.setStyle("-fx-background-color: #C5E3F6;");
        yes.setText("Yes");
        yes.setTextFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        yes.setFont(new Font("Showcard Gothic", 21.0));

        no.setLayoutX(474.0);
        no.setLayoutY(120.0);
        no.setMnemonicParsing(false);
        no.setPrefHeight(43.0);
        no.setPrefWidth(106.0);
        no.setStyle("-fx-background-color: #C5E3F6;");
        no.setText("No");
        no.setTextFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        no.setFont(new Font("Showcard Gothic", 21.0));

        imageView.setFitHeight(36.0);
        imageView.setFitWidth(46.0);
        imageView.setLayoutX(544.0);
        imageView.setLayoutY(124.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("../../../Smiling_Emoji_with_Eyes_Opened_large.png").toExternalForm()));

        imageView0.setFitHeight(36.0);
        imageView0.setFitWidth(46.0);
        imageView0.setLayoutX(215.0);
        imageView0.setLayoutY(124.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("../../../imageedit_10_5516720946.png").toExternalForm()));

        getChildren().add(text);
        getChildren().add(yes);
        getChildren().add(no);
        getChildren().add(imageView);
        getChildren().add(imageView0);

    }
}
