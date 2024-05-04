package Module6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class StaffManagerFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create labels and text fields
        Label idLabel = new Label("ID:");
        TextField idField = new TextField();
        Label lastNameLabel = new Label("Last Name:");
        TextField lastNameField = new TextField();
        Label firstNameLabel = new Label("First Name:");
        TextField firstNameField = new TextField();
        Label miLabel = new Label("MI:");
        TextField miField = new TextField();
        Label addressLabel = new Label("Address:");
        TextField addressField = new TextField();
        Label cityLabel = new Label("City:");
        TextField cityField = new TextField();
        Label stateLabel = new Label("State:");
        TextField stateField = new TextField();
        Label telephoneLabel = new Label("Telephone:");
        TextField telephoneField = new TextField();
        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        // Create GridPane layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(5);
        gridPane.setVgap(3);

        // Add labels and text fields to the grid pane
        gridPane.addRow(0, idLabel, idField);
        gridPane.addRow(1, lastNameLabel, lastNameField, firstNameLabel, firstNameField, miLabel, miField);
        gridPane.addRow(2, addressLabel, addressField);
        gridPane.addRow(3, cityLabel, cityField, stateLabel, stateField);
        gridPane.addRow(4, telephoneLabel, telephoneField);
        gridPane.addRow(5, emailLabel, emailField);

        // Set action for view button
        Button viewButton = new Button("View");
        viewButton.setOnAction(e -> {
            // Call viewStaff method with the specified ID
            String id = idField.getText();
            viewStaff(id);
        });

        // Set action for insert button
        Button insertButton = new Button("Insert");
        insertButton.setOnAction(e -> {
            // Call insertStaff method with the specified information
            String id = idField.getText();
            String lastName = lastNameField.getText();
            String firstName = firstNameField.getText();
            String mi = miField.getText();
            String address = addressField.getText();
            String city = cityField.getText();
            String state = stateField.getText();
            String telephone = telephoneField.getText();
            String email = emailField.getText();
            insertStaff(id, lastName, firstName, mi, address, city, state, telephone, email);
        });

        // Set action for update button
        Button updateButton = new Button("Update");
        updateButton.setOnAction(e -> {
            // Call updateStaff method with the specified information
            String id = idField.getText();
            String lastName = lastNameField.getText();
            String firstName = firstNameField.getText();
            String mi = miField.getText();
            String address = addressField.getText();
            String city = cityField.getText();
            String state = stateField.getText();
            String telephone = telephoneField.getText();
            String email = emailField.getText();
            updateStaff(id, lastName, firstName, mi, address, city, state, telephone, email);
        });

        // Add buttons to the grid pane
        gridPane.add(viewButton, 0, 6);
        gridPane.add(insertButton, 1, 6);
        gridPane.add(updateButton, 2, 6);

        // Create scene and set root
        Scene scene = new Scene(gridPane, 630, 210);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Staff Manager");
        primaryStage.show();
    }

    // Method to view staff information by ID (dummy implementation)
    private void viewStaff(String id) {
        System.out.println("Viewing staff with ID: " + id);
        // Implement database query to view staff information
    }

    // Method to insert new staff information (dummy implementation)
    private void insertStaff(String id, String lastName, String firstName, String mi, String address, String city, String state, String telephone, String email) {
        System.out.println("Inserting new staff with ID: " + id);
        // Implement database query to insert staff information
    }

    // Method to update existing staff information by ID (dummy implementation)
    private void updateStaff(String id, String lastName, String firstName, String mi, String address, String city, String state, String telephone, String email) {
        System.out.println("Updating staff with ID: " + id);
        // Implement database query to update staff information
    }

    public static void main(String[] args) {
        launch(args);
    }
}