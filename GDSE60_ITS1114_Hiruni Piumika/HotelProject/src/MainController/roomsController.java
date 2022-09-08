package MainController;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class roomsController {
    public AnchorPane roomsContext;
    public AnchorPane roomselectContext;


    //room eke home button
    public void rbackTohomeOnAction(ActionEvent actionEvent) throws IOException {
        setUi("Main");
    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage)  roomsContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }

    //room eke back button eka
    public void rbackToDashboardOnAction1(ActionEvent actionEvent) throws IOException {
        setRBUi("Dashboard");
    }
    private void setRBUi(String location) throws IOException {
        Stage stage=(Stage)  roomsContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }

    public void singleROnAction(ActionEvent actionEvent) throws IOException {
        roomselectContext.getChildren().clear();
        Parent parent= FXMLLoader.load(getClass().getResource("../MainView/singleRoom.fxml"));
        roomselectContext.getChildren().add(parent);
    }

    public void tripleRoomOnAction(ActionEvent actionEvent) throws IOException {
        roomselectContext.getChildren().clear();
        Parent parent= FXMLLoader.load(getClass().getResource("../MainView/tripleRoom.fxml"));
        roomselectContext.getChildren().add(parent);
    }

    public void doubleroomOnAction(ActionEvent actionEvent) throws IOException {
        roomselectContext.getChildren().clear();
        Parent parent= FXMLLoader.load(getClass().getResource("../MainView/doubleRoom.fxml"));
        roomselectContext.getChildren().add(parent);
    }

    public void quadroomOnAction(ActionEvent actionEvent) throws IOException {
        roomselectContext.getChildren().clear();
        Parent parent= FXMLLoader.load(getClass().getResource("../MainView/QuadRoom.fxml"));
        roomselectContext.getChildren().add(parent);
    }

    public void conformOnAction(ActionEvent actionEvent) throws IOException {
        roomselectContext.getChildren().clear();
        Parent parent= FXMLLoader.load(getClass().getResource("../MainView/conform.fxml"));
        roomselectContext.getChildren().add(parent);

        new Alert(Alert.AlertType.INFORMATION,"Thank You").show();
    }
}
