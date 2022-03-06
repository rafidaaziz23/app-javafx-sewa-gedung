module com.rafidaaziz.aplikasisewagedung {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.rafidaaziz.aplikasisewagedung to javafx.fxml;
    exports com.rafidaaziz.aplikasisewagedung;
}