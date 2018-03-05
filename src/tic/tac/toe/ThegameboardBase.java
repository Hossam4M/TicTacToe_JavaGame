//the game board
package tic.tac.toe;

import java.io.File;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class ThegameboardBase extends AnchorPane {

    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final ColumnConstraints columnConstraints3;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Text text;
    protected final Text text0;
    protected final Text text1;
    protected final Text text2;
    protected final Text text3;
    protected final Text text4;
    protected final Label label0;
    protected final Label label1;
    protected final Label label2;
    protected final Label label3;
    protected final Label label4;
    protected final Label label5;
    protected final Label label6;
    protected final Label label7;
    protected final Label label8;
    protected final Button button;
    protected final Button exit;
    protected final ImageView backi;
    protected final ImageView img2;

    public ThegameboardBase() {

        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        columnConstraints3 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        text = new Text();
        text0 = new Text();
        text1 = new Text();
        text2 = new Text();
        text3 = new Text();
        text4 = new Text();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();
        label5 = new Label();
        label6 = new Label();
        label7 = new Label();
        label8 = new Label();
        button = new Button();
        exit = new Button();
        backi = new ImageView();
        File file = new File("../../../14-512.png");
        Image image = new Image(file.toURI().toString());
        img2 = new ImageView(image);

        setId("AnchorPane");
        setPrefHeight(570.0);
        setPrefWidth(877.0);
        setStyle("-fx-background-color: #C5E3F6;");

        gridPane.setGridLinesVisible(true);
        gridPane.setLayoutX(4.0);
        gridPane.setLayoutY(88.0);
        gridPane.setPrefHeight(407.0);
        gridPane.setPrefWidth(870.0);
        gridPane.setStyle("-fx-background-color: white;");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(text, 3);
        text.setFill(javafx.scene.paint.Color.valueOf("#c5e3f6"));
        text.setLineSpacing(150.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("player1");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setWrappingWidth(170.0);
        text.setFont(new Font("Showcard Gothic", 35.0));

        GridPane.setColumnIndex(text0, 3);
        GridPane.setRowIndex(text0, 1);
        text0.setFill(javafx.scene.paint.Color.valueOf("#c5e3f6"));
        text0.setLineSpacing(150.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("player2");
        text0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text0.setWrappingWidth(170.0);
        text0.setFont(new Font("Showcard Gothic", 35.0));

        GridPane.setColumnIndex(text1, 3);
        GridPane.setRowIndex(text1, 2);
        text1.setFill(javafx.scene.paint.Color.valueOf("#c5e3f6"));
        text1.setLineSpacing(150.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("score");
        text1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text1.setWrappingWidth(170.0);
        text1.setFont(new Font("Showcard Gothic", 35.0));

        GridPane.setColumnIndex(text2, 4);
        text2.setFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        text2.setLineSpacing(150.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text2.setWrappingWidth(150.0);
        text2.setFont(new Font("Showcard Gothic", 29.0));

        GridPane.setColumnIndex(text3, 4);
        GridPane.setRowIndex(text3, 1);
        text3.setFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        text3.setLineSpacing(150.0);
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text3.setWrappingWidth(150.0);
        text3.setFont(new Font("Showcard Gothic", 29.0));

        GridPane.setColumnIndex(text4, 4);
        GridPane.setRowIndex(text4, 2);
        text4.setFill(javafx.scene.paint.Color.valueOf("#0d1b4c"));
        text4.setLineSpacing(150.0);
        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text4.setWrappingWidth(150.0);
        text4.setFont(new Font("Showcard Gothic", 29.0));

        label0.setPrefHeight(134.0);
        label0.setPrefWidth(174.0);

        GridPane.setColumnIndex(label1, 1);
        label1.setPrefHeight(144.0);
        label1.setPrefWidth(174.0);

        GridPane.setColumnIndex(label2, 2);
        label2.setPrefHeight(165.0);
        label2.setPrefWidth(174.0);
          label2.addEventHandler(MouseEvent.MOUSE_CLICKED, e-> {
         label2.setText("Hello, World.");
            label2.setGraphic(img2);
             });

        GridPane.setRowIndex(label3, 1);
        label3.setPrefHeight(150.0);
        label3.setPrefWidth(174.0);

        GridPane.setColumnIndex(label4, 1);
        GridPane.setRowIndex(label4, 1);
        label4.setPrefHeight(143.0);
        label4.setPrefWidth(174.0);

        GridPane.setColumnIndex(label5, 2);
        GridPane.setRowIndex(label5, 1);
        label5.setPrefHeight(177.0);
        label5.setPrefWidth(174.0);

        GridPane.setRowIndex(label6, 2);
        label6.setPrefHeight(141.0);
        label6.setPrefWidth(174.0);

        GridPane.setColumnIndex(label7, 1);
        GridPane.setRowIndex(label7, 2);
        label7.setPrefHeight(156.0);
        label7.setPrefWidth(174.0);

        GridPane.setColumnIndex(label8, 2);
        GridPane.setRowIndex(label8, 2);
        label8.setPrefHeight(172.0);
        label8.setPrefWidth(174.0);

        button.setLayoutX(33.0);
        button.setLayoutY(25.0);
        button.setMnemonicParsing(false);
        button.setPrefHeight(41.0);
        button.setPrefWidth(89.0);
        button.setStyle("-fx-background-color: #C5E3F6;");
        button.setFont(new Font(13.0));

        exit.setLayoutX(759.0);
        exit.setLayoutY(519.0);
        exit.setMnemonicParsing(false);
        exit.setPrefHeight(37.0);
        exit.setPrefWidth(126.0);
        exit.setStyle("-fx-background-color: #C5E3F6;");
        exit.setText("exit");
        exit.setFont(new Font("Showcard Gothic", 20.0));

        backi.setFitHeight(120.0);
        backi.setFitWidth(200.0);
        backi.setLayoutX(-17.0);
        backi.setLayoutY(-29.0);
        backi.setPickOnBounds(true);
        backi.setPreserveRatio(true);
        backi.setImage(new Image(getClass().getResource("../../../14-512.png").toExternalForm()));

      
       
        
        
        
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getColumnConstraints().add(columnConstraints2);
        gridPane.getColumnConstraints().add(columnConstraints3);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(text);
        gridPane.getChildren().add(text0);
        gridPane.getChildren().add(text1);
        gridPane.getChildren().add(text2);
        gridPane.getChildren().add(text3);
        gridPane.getChildren().add(text4);
        gridPane.getChildren().add(label0);
        gridPane.getChildren().add(label1);
        gridPane.getChildren().add(label2);
        gridPane.getChildren().add(label3);
        gridPane.getChildren().add(label4);
        gridPane.getChildren().add(label5);
        gridPane.getChildren().add(label6);
        gridPane.getChildren().add(label7);
        gridPane.getChildren().add(label8);
        getChildren().add(gridPane);
        getChildren().add(button);
        getChildren().add(exit);
        getChildren().add(backi);
        getChildren().add(img2);

    }
}
