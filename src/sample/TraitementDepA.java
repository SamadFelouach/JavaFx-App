package sample;

import Dbconnection.Connectiondb;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Callback;


import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class TraitementDepA implements Initializable {

    PreparedStatement prepared = null;
    Connectiondb connectiondb = new Connectiondb();
    @FXML
    public JFXTextField txtnom;
    @FXML
    public DatePicker txtdate;
    @FXML
    public JFXTextField txtobsetvation;
    @FXML
    public JFXTextField txtcin;
    @FXML
    public JFXTextField txtprenom;
    @FXML
    public Button Addbtn;
    @FXML
    public Label Status;
    @FXML
     TableView tableView;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fetColumnList();
        fetRowList();

    }

    //Operation du button retour au dashboard
    public void dashbtn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("TraitementDepA.fxml"));
        Scene scene = new Scene(root, 950, 600);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.setResizable(false);
        window.show();
    }

    //action du btn ajouter
    public void addbtn(ActionEvent event) throws  Exception{

        String nom = txtnom.getText().toString();
        String prenom = txtprenom.getText().toString();
        String cin = txtcin.getText().toString();
        Date date = Date.valueOf(txtdate.getValue());
        String observation = txtobsetvation.getText().toString();

        String sql = "INSERT INTO patients(Nom , Prenom , Cin , Date , observations) value(? , ? , ?, ?, ?) ";
        try {
            Connection connection = connectiondb.connectdb();
            prepared = connection.prepareStatement(sql);
            prepared.setString(1, nom);
            prepared.setString(2, prenom);
            prepared.setString(3, cin);
            prepared.setDate(4, date);
            prepared.setString(5, observation);
            prepared.execute();
            Status.setTextFill(Color.GREEN);
            Status.setText("Added Successfully");

            fetColumnList();
            clearFields();


        } catch (SQLException e) {
            System.out.println("errur");
            e.printStackTrace();
        }
    }



    private void clearFields() {
        txtnom.clear();
        txtprenom.clear();
        txtcin.clear();
        txtobsetvation.clear();
    }

    //Methode de recuperation du data
    private ObservableList<ObservableList> data;
    String SQL = "SELECT * from patients";
    private void fetColumnList() {

        try {
            Connection connection = connectiondb.connectdb();
            ResultSet rs = connection.createStatement().executeQuery(SQL);
;

//SQL FOR SELECTING ALL OF CUSTOMER
            for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                //We are using non property style for making dynamic table
                final int j = i;
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i + 1).toUpperCase());
                col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {
                        return new SimpleStringProperty(param.getValue().get(j).toString());
                    }
                });

                tableView.getColumns().removeAll(col);
                tableView.getColumns().addAll(col);



            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());

        }
    }
    //fetches rows and data from the list
    private void fetRowList() {
        data = FXCollections.observableArrayList();
        ResultSet rs;
        try {
            Connection connection = connectiondb.connectdb();
            rs = connection.createStatement().executeQuery(SQL);

            while (rs.next()) {
                //Iterate Row
                ObservableList row = FXCollections.observableArrayList();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    //Iterate Column
                    row.add(rs.getString(i));
                }
                data.add(row);

            }

            tableView.setItems(data);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }














}


