package MainController;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReserveARoomController {

    public AnchorPane reserveRContext;

    public void RRHOnAction(ActionEvent actionEvent) throws IOException {
        setREHUI("Main");
    }
    private void setREHUI(String location) throws IOException {
        Stage stage=(Stage) reserveRContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }

    public void RRBOnAction(ActionEvent actionEvent) throws IOException {
        setREBUI("Rmenu");
    }
    private void setREBUI(String location) throws IOException {
        Stage stage=(Stage) reserveRContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }
    // add details geust button eka
    public void AdgOnAction(ActionEvent actionEvent) throws IOException {
        setAddgUI("AddGuestDetails");
    }

    private void setAddgUI(String location) throws IOException {
        Stage stage=(Stage) reserveRContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }
    //select meals plan button eka
    public void SmpOnAction(ActionEvent actionEvent) throws IOException {
        setSMPUI("SelectMealPlan");
    }

    private void setSMPUI(String location) throws IOException {
        Stage stage=(Stage) reserveRContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }
   // chech room availability button eka
    public void CROnAction(ActionEvent actionEvent) throws IOException {
        setchkPUI("chechRoomAvailability");
    }
    private void setchkPUI(String location) throws IOException {
        Stage stage=(Stage) reserveRContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }
}
