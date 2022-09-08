package MainController;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistController {
    public AnchorPane reLgontext;
    public TextField nicxt;
    public PasswordField pspwd;

    public void reHomeOnAction(ActionEvent actionEvent) throws IOException {
                setREUI("Main");
    }
    private void setREUI(String location) throws IOException {
        Stage stage=(Stage) reLgontext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }

    public void goReceOnAction(ActionEvent actionEvent) throws IOException {
        String nic=nicxt.getText();
        String password=pspwd.getText();

        if(nic.equals("200072501233")&& password.equals("1234")){
            reLgontext.getChildren().clear();
            Parent parent= FXMLLoader.load(getClass().getResource("../MainView/Rmenu.fxml"));
            reLgontext.getChildren().add(parent);
        }
        else{
            new Alert(Alert.AlertType.WARNING,"Login fail!").show();
        }
    }
}
