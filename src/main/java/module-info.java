module com.example.keyacosmetic {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.keyacosmetic to javafx.fxml;
    opens com.example.keyacosmetic.Shamanta.QualityControlOfficer to javafx.fxml,java.base;
    opens com.example.keyacosmetic.Shamanta.DeliveryStaff to javafx.fxml,java.base;
    exports com.example.keyacosmetic;
    opens com.example.keyacosmetic.Shamanta.model to java.base, javafx.fxml;

}