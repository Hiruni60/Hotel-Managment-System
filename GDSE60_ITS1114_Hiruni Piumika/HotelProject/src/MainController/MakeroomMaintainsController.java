package MainController;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MakeroomMaintainsController {

    public AnchorPane mrinMaintanceContext;

    public void homeOnAction(ActionEvent actionEvent) throws IOException {
        setUI("Main");
    }
    private void setUI(String location) throws IOException {
        Stage stage=(Stage) mrinMaintanceContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setBUI("Rmenu");
    }
    private void setBUI(String location) throws IOException {
        Stage stage=(Stage) mrinMaintanceContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }
}
