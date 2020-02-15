package sample;

import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    private ListView<Employee> employeeListView;
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private CheckBox isActiveCheckBox;
    @FXML
    private Button button;
    @FXML
    private Button button1;
    @FXML
    private Button button2;



    public void deleteButtonAction(ActionEvent actionEvent) {
    button.setOnAction(e -> deleteButtonClicked());
    }


    public void clearButtonAction(ActionEvent actionEvent) {
    button1.setOnAction(e -> clearButtonClicked());
    }


    public void AddNewButtonAction(ActionEvent actionEvent) {
        button2.setOnAction(e -> AddNewButtonClicked());
    }

    public void deleteButtonClicked(){
    ObservableList<Employee> employeeSelected, allEmployees;
    allEmployees = employeeListView.getItems();
    employeeSelected = employeeListView.getSelectionModel().getSelectedItems();

    employeeSelected.forEach(allEmployees::remove);
    }

    public void clearButtonClicked(){
    firstName.clear();
    lastName.clear();
    isActiveCheckBox.setSelected(false);

    }

    public void AddNewButtonClicked(){
    Employee employee = new Employee();
    employee.firstName=(firstName.getText());
    employee.lastName=(lastName.getText());
    employeeListView.getItems().add(employee);
    employee.isActive = isActiveCheckBox.isSelected();
    firstName.clear();
    lastName.clear();
    }




    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        employeeListView.getSelectionModel().selectedItemProperty().addListener((
                ObservableValue < ? extends Worker> ov, Worker old_val, Worker new_val)->
                {
                    Worker selectedItem = employeeListView.getSelectionModel().getSelectedItem();

                    firstName.setText(((Employee)selectedItem).firstName);
                    lastName.setText(((Employee)selectedItem).lastName);
                    isActiveCheckBox.setSelected(((Employee)selectedItem).isActive);


                }


        );


        ObservableList<Employee> ListViewItems = employeeListView.getItems();


    }}









