package MainController;

import MainView.tm.MealsTm;
import db.mealsDatabase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Meals;

import java.io.IOException;
import java.util.Optional;

public class AMealController {

    public AnchorPane AMealContext;
    public TableColumn colMeals;
    public TableColumn colPrice;
    public TableColumn colOption;
    public TableView<MealsTm> tblmeals;
    public TextField txtMeals;
    public TextField txtPrice;
    public Button btnAdd;


    public void initialize(){
        colOption.setCellValueFactory(new PropertyValueFactory("btn"));
        colMeals.setCellValueFactory(new PropertyValueFactory("MName"));
        colPrice.setCellValueFactory(new PropertyValueFactory("MPrice"));
        loadAllMeals();
        tblmeals.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    setData(newValue);
                });

    }
    private void setData(MealsTm lm) {
        btnAdd.setText("add");
        txtMeals.setText(lm.getMName());
        txtPrice.setText(lm.getMPrice());
    }

    private void loadAllMeals() {
        ObservableList<MealsTm> obmlist= FXCollections.observableArrayList();

        for (Meals rm:mealsDatabase.mList) {
            Button btn=new Button("Delete");
            MealsTm tm=new MealsTm(rm.getName(),rm.getPrice(),btn);
            obmlist.add(tm);

            System.out.println(tm);

            //delete button
            btn.setOnAction((e)->{
                        Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Are you sure", ButtonType.YES,ButtonType.NO);
                        Optional<ButtonType> buttonType = alert.showAndWait();

                        if(buttonType.get().equals(ButtonType.YES)){
                            mealsDatabase.mList.remove(rm);
                            obmlist.remove(tm);
                            new Alert(Alert.AlertType.INFORMATION,"Delete has been success");
                        }
                    }
            );
        }
        tblmeals.setItems(obmlist);
    }


    public void HOnAction(ActionEvent actionEvent) throws IOException {
        setHBgUI("Main");
    }
    private void setHBgUI(String location) throws IOException {
        Stage stage=(Stage)AMealContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }

    public void BOnAction(ActionEvent actionEvent) throws IOException {
        setHgUI("Dashboard");
    }
    private void setHgUI(String location) throws IOException {
        Stage stage=(Stage)AMealContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }
    public void mealOnAction(ActionEvent actionEvent) {
        Meals c1=new Meals(
                txtMeals.getText(),
                txtPrice.getText()
        );
        mealsDatabase.mList.add(c1);
        loadAllMeals();

    }
}
