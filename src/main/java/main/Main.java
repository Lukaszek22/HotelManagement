package main;

import com.jfoenix.controls.JFXButton;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        StackPane pane = new StackPane();
        VBox vBox = new VBox();

        Label label = new Label("Hello Java");
        JFXButton jfxButton = new JFXButton("Button");
        vBox.getChildren().addAll(label,jfxButton);
        pane.getChildren().addAll(vBox);
        primaryStage.setScene(new Scene(pane));
        primaryStage.setHeight(100);
        primaryStage.setWidth(100);
        primaryStage.show();
    }
}
