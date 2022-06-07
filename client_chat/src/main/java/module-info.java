module com.example.client_chat {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires org.apache.commons.io;
    requires org.apache.logging.log4j;
    requires org.apache.logging.log4j.core;


    opens com.example.client_chat to javafx.fxml;
    exports com.example.client_chat;
    exports com.example.client_chat.history;
    opens com.example.client_chat.history to javafx.fxml;
}