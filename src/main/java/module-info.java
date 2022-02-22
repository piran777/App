module smartcue.app {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens smartcue.app to javafx.fxml;
    exports smartcue.app;
}