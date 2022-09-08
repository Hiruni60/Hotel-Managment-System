package MainController;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MealpackageController {
    public TextField txtSelectMeal;
    public AnchorPane mealsContext;
    public ComboBox<String>cmbMeals;

        public void initialize(){
            cmbMeals.getItems().add("Local Meals      RS.400.00");
            cmbMeals.getItems().add("Chines Meals     RS.800.00");
            cmbMeals.getItems().add("French meals     RS.1000.00");

        }
        //select meal plan buttoneka
        public void choseOnAction(ActionEvent actionEvent)  {
            txtSelectMeal.setText(cmbMeals.getValue() );
        }

    public void orderOnAction(ActionEvent actionEvent) throws IOException {
            setRBgUI("SelectMealPlan");
            new Alert(Alert.AlertType.INFORMATION,"order is conform").show();
    }
    private void setRBgUI(String location) throws IOException {
        Stage stage=(Stage) mealsContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }
}

