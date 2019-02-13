package hbox;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class Main2 extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        HBox hbox = new HBox();
        Button button1 = new Button("Add");
        Button button2 = new Button("Remove");
        hbox.getChildren().addAll(button1, button2);
        Scene scene = new Scene(hbox, 300, 150);
        stage.setScene(scene);

        stage.setTitle("HBox in JavaFX");

        stage.show();
    }
}
