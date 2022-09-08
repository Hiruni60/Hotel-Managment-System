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

public class AdminController {

    public AnchorPane adContext;
    public TextField userNametxt;
    public PasswordField passwordpwd;

    public void BackToHomeOnAction(ActionEvent actionEvent) throws IOException {
        setUi("Main");

    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage)  adContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }

    //admin login button
    public void lgOnAction(ActionEvent actionEvent) throws IOException {
        String username=userNametxt.getText();
        String password=passwordpwd.getText();
        if(username.equals("admin")&& password.equals("1234")){
                adContext.getChildren().clear();
                Parent parent= FXMLLoader.load(getClass().getResource("../MainView/Dashboard.fxml"));
                adContext.getChildren().add(parent);
        }
        else{
            new Alert(Alert.AlertType.WARNING,"Login fail!").show();
        }

    }
}
