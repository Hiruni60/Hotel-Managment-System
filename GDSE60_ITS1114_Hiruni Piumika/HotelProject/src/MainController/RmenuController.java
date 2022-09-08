package MainController;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RmenuController {
    public AnchorPane rmContext;

    public void reHOnAction(ActionEvent actionEvent) throws IOException {
        setREHUI("Main");
    }
    private void setREHUI(String location) throws IOException {
        Stage stage=(Stage) rmContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }

    public void reBOnAction(ActionEvent actionEvent) throws IOException {
        setREBUI("Receptionist");
    }
    private void setREBUI(String location) throws IOException {
        Stage stage=(Stage) rmContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }

    public void ReROnAction(ActionEvent actionEvent) throws IOException {
        setRESUI("ReserveARoom");
    }
    private void setRESUI(String location) throws IOException {
        Stage stage=(Stage) rmContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }

    public void rmOnAction(ActionEvent actionEvent) throws IOException {
        setBUI("MakeroomMaintains");
    }
    private void setBUI(String location) throws IOException {
        Stage stage=(Stage) rmContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }
}
