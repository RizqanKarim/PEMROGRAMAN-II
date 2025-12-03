module com.example.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    // IZINKAN AKSES KE PACKAGE UTAMA (Supaya MainApp bisa jalan)
    exports com.app;

    // IZINKAN AKSES KE FOLDER LAINNYA
    opens com.app.view to javafx.fxml;
    opens com.app.controller to javafx.fxml;

    // PENTING: Izinkan TableView membaca data Model
    opens com.app.model to javafx.base;
}