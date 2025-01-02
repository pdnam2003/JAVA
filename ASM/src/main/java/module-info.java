module com.example.asm {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.asm to javafx.fxml;
    exports com.example.asm;
    exports com.example.asm.Controller;
    opens com.example.asm.Controller to javafx.fxml;
}