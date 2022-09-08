package MainController;

import MainView.tm.RoomsTm;
import db.Dtabase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.RoomsName;

import java.io.IOException;
import java.util.Optional;

public class ChechRoomAvailabilityController {
    public AnchorPane checkrAOnAction;
    public TableView <RoomsTm>tblroomAvailability;
    public TableColumn colRVName;
    public TableColumn colRVNo;
    public TableColumn colremoveRoom;
    public TextField txttRVName;
    public TextField txtRvId;
    public Button btnbkRoom;

    public void rbHomOnAction(ActionEvent actionEvent) throws IOException {
        setSMPUI("Main");
    }
    private void setSMPUI(String location) throws IOException {
        Stage stage=(Stage)  checkrAOnAction.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }
    public void eRbOnAction(ActionEvent actionEvent) throws IOException {
        setSbPUI("ReserveARoom");
    }
    private void setSbPUI(String location) throws IOException {
        Stage stage=(Stage)  checkrAOnAction.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }
    public void initialize(){
        colremoveRoom.setCellValueFactory(new PropertyValueFactory("btn"));
        colRVName.setCellValueFactory(new PropertyValueFactory("rName"));
        colRVNo.setCellValueFactory(new PropertyValueFactory("rNo"));

        loadAllroomsName();
        tblroomAvailability.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    setData(newValue);
                });
    }

    private void setData(RoomsTm tm) {
        btnbkRoom.setText("booking room");
        txtRvId.setText(tm.getrNo());
        txttRVName.setText(tm.getrName());
    }

    private void loadAllroomsName() {
        ObservableList<RoomsTm> oblist = FXCollections.observableArrayList();

        for (RoomsName rm : Dtabase.arlist) {
            Button btn = new Button("Delete");
            RoomsTm tm = new RoomsTm(rm.getrName(), rm.getrNo(), btn);
            oblist.add(tm);

            btn.setOnAction((e)->{
                Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Are you sure", ButtonType.YES,ButtonType.NO);
                Optional<ButtonType> buttonType = alert.showAndWait();

                if(buttonType.get().equals(ButtonType.YES)){
                    Dtabase.arlist.remove(rm);
                    oblist.remove(tm);
                    new Alert(Alert.AlertType.INFORMATION,"Delete has been success");
                }
            });
        }
        tblroomAvailability.setItems(oblist);
    }

    public void roomBOnAction(ActionEvent actionEvent) {
        RoomsName c1=new RoomsName(
                colRVName.getText(),
                txtRvId.getText()
        );
        Dtabase.arlist.add(c1);
        loadAllroomsName();
    }
}
