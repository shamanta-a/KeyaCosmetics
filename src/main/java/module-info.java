module com.example.keyacosmetic {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.keyacosmetic to javafx.fxml;
    opens com.example.keyacosmetic.QualityControlOfficer to javafx.fxml,java.base;
    opens com.example.keyacosmetic.DeliveryStaff to javafx.fxml,java.base;
    exports com.example.keyacosmetic;

}