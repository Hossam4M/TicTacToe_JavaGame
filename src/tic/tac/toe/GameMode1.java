package tic.tac.toe;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class GameMode1 extends Pane {

    protected final Text text;
    protected final Button single;
    protected final Button remote;
    protected final Button local;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final ImageView imageView1;
    protected final Button back;
    protected final ImageView backi;

    public GameMode1() {

        text = new Text();
        single = new Button();
        remote = new Button();
        local = new Button();
        imageView = new ImageView();
        imageView0 = new ImageView();
        imageView1 = new ImageView();
        back = new Button();
        backi = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(570.0);
        setPrefWidth(877.0);
        setStyle("-fx-background-color: #C5E3F6;");

        text.setFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        text.setLayoutX(144.0);
        text.setLayoutY(109.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Choose your Game Mode ");
        text.setFont(new Font("Showcard Gothic", 38.0));

        single.setLayoutX(220.0);
        single.setLayoutY(178.0);
        single.setMnemonicParsing(false);
        single.setPrefHeight(55.0);
        single.setPrefWidth(391.0);
        single.setStyle("-fx-background-color: #C5E3F6;");
        single.setText("single player");
        single.setTextFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        single.setFont(new Font("Showcard Gothic", 30.0));

        remote.setLayoutX(230.0);
        remote.setLayoutY(453.0);
        remote.setMnemonicParsing(false);
        remote.setPrefHeight(55.0);
        remote.setPrefWidth(371.0);
        remote.setStyle("-fx-background-color: #C5E3F6;");
        remote.setText("Remote two players");
        remote.setTextFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        remote.setFont(new Font("Showcard Gothic", 30.0));

        local.setLayoutX(241.0);
        local.setLayoutY(311.0);
        local.setMnemonicParsing(false);
        local.setPrefHeight(55.0);
        local.setPrefWidth(350.0);
        local.setStyle("-fx-background-color: #C5E3F6;");
        local.setText("local two players");
        local.setTextFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        local.setFont(new Font("Showcard Gothic", 30.0));

        imageView.setFitHeight(85.0);
        imageView.setFitWidth(87.0);
        imageView.setLayoutX(135.0);
        imageView.setLayoutY(163.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("../../../imageedit_3_8728124905.png").toExternalForm()));

        imageView0.setFitHeight(85.0);
        imageView0.setFitWidth(87.0);
        imageView0.setLayoutX(144.0);
        imageView0.setLayoutY(296.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("../../../imageedit_8_4126649007.png").toExternalForm()));

        imageView1.setFitHeight(85.0);
        imageView1.setFitWidth(87.0);
        imageView1.setLayoutX(144.0);
        imageView1.setLayoutY(438.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("../../../icon-networking-1.jpg").toExternalForm()));

        back.setLayoutX(14.0);
        back.setLayoutY(24.0);
        back.setMnemonicParsing(false);
        back.setPrefHeight(44.0);
        back.setPrefWidth(111.0);
        back.setStyle("-fx-background-color: #C5E3F6;");

        backi.setFitHeight(132.0);
        backi.setFitWidth(135.0);
        backi.setLayoutX(14.0);
        backi.setLayoutY(-7.0);
        backi.setPickOnBounds(true);
        backi.setPreserveRatio(true);
        backi.setImage(new Image(getClass().getResource("../../../14-512.png").toExternalForm()));

        getChildren().add(text);
        getChildren().add(single);
        getChildren().add(remote);
        getChildren().add(local);
        getChildren().add(imageView);
        getChildren().add(imageView0);
        getChildren().add(imageView1);
        getChildren().add(back);
        getChildren().add(backi);

    }
}
