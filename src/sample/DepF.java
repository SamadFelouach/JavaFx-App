package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DepF {
    public void dashbtn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Dash.fxml"));
        Scene scene = new Scene(root,950,600);
        Stage window =(Stage)((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.setResizable(false);
        window.show();
    }
}
