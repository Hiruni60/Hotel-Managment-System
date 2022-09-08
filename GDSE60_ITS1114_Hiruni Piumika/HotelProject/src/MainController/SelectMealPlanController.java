package MainController;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SelectMealPlanController {
    public AnchorPane selectMealplanContext;
   // public ComboBox<String> cmbMeals;
   // public TextField txtSelectedMeals;
  //  public JFXTextField txtroomNo;
    public AnchorPane mealsContext;
    public JFXTextField txtroomNo;

    public void smHOnAction(ActionEvent actionEvent) throws IOException {
        setHBgUI("Main");
    }
    private void setHBgUI(String location) throws IOException {
        Stage stage=(Stage) selectMealplanContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }
    public void smpBOnAction(ActionEvent actionEvent) throws IOException {
        setRBgUI("ReserveARoom");
    }
    private void setRBgUI(String location) throws IOException {
        Stage stage=(Stage) selectMealplanContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }
//add a value combobox

    public void roomNoOnAction(ActionEvent actionEvent) throws IOException {
        String rNo=txtroomNo.getText();
        if(rNo.equals("1") ||rNo.equals("2")||rNo.equals("3") ||rNo.equals("4")||rNo.equals("5") ||rNo.equals("6")||rNo.equals("7") ||rNo.equals("8")||rNo.equals("9") ||rNo.equals("10")){
            mealsContext.getChildren().clear();
            Parent parent= FXMLLoader.load(getClass().getResource("../MainView/mealpackage.fxml"));
            mealsContext.getChildren().add(parent);
        }
    }

}
