package MainController;


import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainFormController {
    public AnchorPane DashBoard;
    public Label lblDateControll;
    public Label lblTime;

    //main eke admin button ebuwama wena de
    public void AdminOnAction(ActionEvent actionEvent) throws IOException {
        DashBoard.getChildren().clear();
        Parent parent= FXMLLoader.load(getClass().getResource("../MainView/Admin.fxml"));
        DashBoard.getChildren().add(parent);
    }

        //Receptionist button ek ebuwama
    public void ReceptionistOnAction(ActionEvent actionEvent) throws IOException {
        DashBoard.getChildren().clear();
        Parent parent= FXMLLoader.load(getClass().getResource("../MainView/Receptionist.fxml"));
        DashBoard.getChildren().add(parent);
    }

}