package lifecycles;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.List;

public class Main extends Application{

    public static void main(String[] args) {

        System.out.println("Launching Application");
        Application.launch(args);
    }

    @Override
    public void init() throws Exception {

        System.out.println("Application inits");
        super.init();
    }
    @Override
    public void start(Stage stage) {

        System.out.println("Application starts");

        stage.setTitle("Hello JavaFX"); // установка заголовка
        stage.setWidth(250);            // установка ширины
        stage.setHeight(150);           // установка длины
        stage.centerOnScreen();
        stage.show();                   // отображение окна на экране

    }
    @Override
    public void stop() throws Exception {

        System.out.println("Application stops");
        super.stop();
    }
}
