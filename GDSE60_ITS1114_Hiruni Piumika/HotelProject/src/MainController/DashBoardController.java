package MainController;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardController {
    public AnchorPane dashbordContext;

    public void homeTOnAction(ActionEvent actionEvent) throws IOException {
        setUi("Main");
    }
    private void setUi(String location) throws IOException {
        Stage stage=(Stage)  dashbordContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }

    public void backLoginformOnAction(ActionEvent actionEvent) throws IOException {
        setUI("Admin");
    }
    private void setUI(String location) throws IOException {
        Stage stage=(Stage)  dashbordContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }

    public void roomsOnAction(ActionEvent actionEvent) throws IOException {
            setRUI("rooms");
    }
    private void setRUI(String location) throws IOException {
        Stage stage=(Stage)  dashbordContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }

    public void MealOnAction(ActionEvent actionEvent) throws IOException {
        setMUI("AMeal");
    }
    private void setMUI(String location) throws IOException {
        Stage stage=(Stage)  dashbordContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }

    public void incomeReportOnAction(ActionEvent actionEvent) throws IOException {
        setIUI("IncomeReport");
    }
    private void setIUI(String location) throws IOException {
        Stage stage=(Stage)  dashbordContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }
}
