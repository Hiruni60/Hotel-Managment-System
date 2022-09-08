package MainController;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class IncomeReportController {
    public AnchorPane incomeReportContext;
    public TextField txtBalance;
    public TextField txtOutGoing;
    public TextField txtIncome;

    public void ibHOnAction(ActionEvent actionEvent) throws IOException {
        setRUI("Main");
    }
    private void setRUI(String location) throws IOException {
        Stage stage=(Stage)  incomeReportContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }

    public void ibBackOnAction(ActionEvent actionEvent) throws IOException {
        setUI("Dashboard");
    }
    private void setUI(String location) throws IOException {
        Stage stage=(Stage)  incomeReportContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }

    public void findOnAction(ActionEvent actionEvent) {

        int income = Integer.parseInt(txtIncome.getText());
        int outgoing = Integer.parseInt(txtOutGoing.getText());

        String balance = String.valueOf(income-outgoing);

        txtBalance.setText(balance);


    }
}
