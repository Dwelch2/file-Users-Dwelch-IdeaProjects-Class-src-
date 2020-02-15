package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;

import javafx.stage.Stage;


public class Main extends Application {

    Stage window;
    TableView<Employee> table;



    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window.setTitle("Employees");
        primaryStage.setScene(new Scene(root, 800, 700));
        primaryStage.show();
        VBox vBox = new VBox();
        vBox.getChildren().addAll();

        TableColumn<Employee, String> nameList = new TableColumn<>("Name");



    }


    public static void main(String[] args) {launch(args);}}


