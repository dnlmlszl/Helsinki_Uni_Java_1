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
    exports org.example.part14.app4;
    opens org.example.part14.app4 to javafx.fxml;
    exports org.example.part14.app5;
    opens org.example.part14.app5 to javafx.fxml;
    exports org.example.part14.app6;
    opens org.example.part14.app6 to javafx.fxml;
    exports org.example.part14.app7;
    opens org.example.part14.app7 to javafx.fxml;
    exports org.example.part14.app8;
    opens org.example.part14.app8 to javafx.fxml;
    exports org.example.part14.app9;
    opens org.example.part14.app9 to javafx.fxml;
    exports org.example.part14.app10;
    opens org.example.part14.app10 to javafx.fxml;
}