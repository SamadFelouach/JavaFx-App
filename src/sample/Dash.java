package sample;


import javafx.animation.Transition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.RotateEvent;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

import java.io.IOException;

public class Dash {

    public Hyperlink DepA;
    public Hyperlink DepB;
    public Hyperlink DepC;
    public Hyperlink DepD;
    public Hyperlink DepE;
    public Hyperlink DepF;
    public Button decbtn;
    public ImageView ImgDepA;
    public  ImageView ImgDepB;
    public ImageView ImgDepE;
    public ImageView ImgDepF;
    public ImageView ImgDepD;
    public ImageView ImgDepC;

    @FXML
     public void DepartementA(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DepA.fxml"));
        Scene scene = new Scene(root,950,600);
        Stage window =(Stage)((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.setResizable(false);
        window.show();
    }

@FXML
    public void DepartementB(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DepB.fxml"));
        Scene scene = new Scene(root,950,600);
        Stage window =(Stage)((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.setResizable(false);
        window.show();
    }
@FXML
    public void DepartementC(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DepC.fxml"));
        Scene scene = new Scene(root,950,600);
        Stage window =(Stage)((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.setResizable(false);
        window.show();
    }
@FXML
    public void DepartementD(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DepD.fxml"));
        Scene scene = new Scene(root,950,600);
        Stage window =(Stage)((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.setResizable(false);
        window.show();
    }
@FXML
    public void DepartementE(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DepE.fxml"));
        Scene scene = new Scene(root,950,600);
        Stage window =(Stage)((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.setResizable(false);
        window.show();
    }
@FXML
    public void DepartementF(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("DepF.fxml"));
        Scene scene = new Scene(root,950,600);
        Stage window =(Stage)((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.setResizable(false);
        window.show();
    }
@FXML
    public void deconnBtn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(root,950,600);
        Stage window =(Stage)((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.setResizable(false);
        window.show();
    }


    public void RotationA(MouseEvent mouseEvent) {
    ImgDepA.setRotate(20);
    }

    public void Rotation0(MouseEvent mouseEvent) {
    ImgDepA.setRotate(0);
    }


    public void RotationB(MouseEvent mouseEvent) {
        ImgDepB.setRotate(20);
    }

    public void RotationB0(MouseEvent mouseEvent) {
        ImgDepB.setRotate(0);
    }

    public void RotationC(MouseEvent mouseEvent) {
        ImgDepC.setRotate(20);
    }

    public void RotationC0(MouseEvent mouseEvent) {
        ImgDepC.setRotate(0);
    }

    public void RotationD(MouseEvent mouseEvent) {
        ImgDepD.setRotate(20);
    }

    public void RotationD0(MouseEvent mouseEvent) {
        ImgDepD.setRotate(0);
    }

    public void RotationE(MouseEvent mouseEvent) {
        ImgDepE.setRotate(20);
    }

    public void RotationE0(MouseEvent mouseEvent) {
        ImgDepE.setRotate(0);
    }

    public void RotationF(MouseEvent mouseEvent) {
        ImgDepF.setRotate(20);
    }

    public void RotationF0(MouseEvent mouseEvent) {
        ImgDepF.setRotate(0);
    }
}
