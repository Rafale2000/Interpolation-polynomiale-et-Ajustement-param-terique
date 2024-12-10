module org.example.interpolation {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.interpolation to javafx.fxml;
    exports org.example.interpolation;
}