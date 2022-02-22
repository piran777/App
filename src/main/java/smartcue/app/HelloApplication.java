package smartcue.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        getHostServices().showDocument("https://app.getsmartcue.com/user-guide");
        Image icon = new Image("file:src/main/resources/smartcue/app/uwo.png"); //adding the uwo icon
        stage.getIcons().add(icon); //using the icon
        Scene scene = new Scene(root);
        stage.setTitle("Smartcue");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}