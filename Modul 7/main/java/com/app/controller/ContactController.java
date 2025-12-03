package com.app.controller;

import com.app.model.Contact;
import com.app.repository.ContactRepository;
import com.app.repository.InMemoryContactRepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ContactController {

    @FXML private TableView<Contact> contactTable;
    @FXML private TableColumn<Contact, String> nameColumn;
    @FXML private TableColumn<Contact, String> phoneColumn;
    @FXML private TableColumn<Contact, String> emailColumn;

    @FXML private TextField nameField;
    @FXML private TextField phoneField;
    @FXML private TextField emailField;

    private ContactRepository repository = new InMemoryContactRepository();

    private ObservableList<Contact> tableData;

    private String selectedId = null;

    @FXML
    public void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        phoneColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));

        refreshTable();

        contactTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                nameField.setText(newSelection.getName());
                phoneField.setText(newSelection.getPhoneNumber());
                emailField.setText(newSelection.getEmail());
                selectedId = newSelection.getId();
            }
        });
    }

    @FXML
    void onAdd() {
        String name = nameField.getText();
        String phone = phoneField.getText();
        String email = emailField.getText();

        if (name.isEmpty() || phone.isEmpty()) {
            showAlert("Nama dan Nomor HP tidak boleh kosong!");
            return;
        }

        String id = String.valueOf(System.currentTimeMillis());

        Contact newContact = new Contact(id, name, phone, email);
        repository.add(newContact);

        clearForm();
        refreshTable();
    }

    @FXML
    void onUpdate() {
        if (selectedId == null) {
            showAlert("Pilih data di tabel terlebih dahulu!");
            return;
        }

        String name = nameField.getText();
        String phone = phoneField.getText();
        String email = emailField.getText();

        Contact updatedContact = new Contact(selectedId, name, phone, email);
        repository.update(selectedId, updatedContact);

        clearForm();
        refreshTable();
        contactTable.refresh();
    }

    @FXML
    void onDelete() {
        Contact selected = contactTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            repository.delete(selected.getId());
            clearForm();
            refreshTable();
        } else {
            showAlert("Pilih data yang ingin dihapus!");
        }
    }

    @FXML
    void onClear() {
        clearForm();
    }

    private void refreshTable() {
        tableData = FXCollections.observableArrayList(repository.getAll());
        contactTable.setItems(tableData);
    }

    private void clearForm() {
        nameField.clear();
        phoneField.clear();
        emailField.clear();
        selectedId = null;
        contactTable.getSelectionModel().clearSelection();
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Peringatan");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.show();
    }
}