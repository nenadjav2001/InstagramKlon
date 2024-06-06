module org.example.instaklon {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens org.example.instaklon to javafx.fxml;
    exports org.example.instaklon;
    exports org.example.instaklon.Interfaces;
    opens org.example.instaklon.Interfaces to javafx.fxml;
}