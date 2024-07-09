module org.example.part14 {
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

    opens org.example.part14 to javafx.fxml;
    exports org.example.part14.app1;
    opens org.example.part14.app1 to javafx.fxml;
    exports org.example.part14.app2;
    opens org.example.part14.app2 to javafx.fxml;
    exports org.example.part14.app3;
    opens org.example.part14.app3 to javafx.fxml;
}