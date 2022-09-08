package MainController;

import MainView.tm.MealsTm;
import MainView.tm.RoomsTm;
import com.jfoenix.controls.JFXTextField;
import db.Dtabase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.RoomsName;

import java.util.Optional;

public class SingleRooomController {
    public AnchorPane singleRoomContext;
    public TableView<RoomsTm> tblSingle;
    public TableColumn colName;
    public TableColumn colNo;
    public TableColumn colOption;
    public JFXTextField txtSName;
    public JFXTextField txtSNo;
    public Button btnSave;

    public void initialize(){
        colOption.setCellValueFactory(new PropertyValueFactory("btn"));
        colName.setCellValueFactory(new PropertyValueFactory("rName"));
        colNo.setCellValueFactory(new PropertyValueFactory("rNo"));

      loadAllroomsName();
        tblSingle.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    setData(newValue);
                });
    }

    private void setData(RoomsTm tm) {
        btnSave.setText("update room");
        txtSNo.setText(tm.getrNo());
        txtSName.setText(tm.getrName());
    }

    private void loadAllroomsName() {
        ObservableList<RoomsTm> oblist= FXCollections.observableArrayList();
        
        for (RoomsName rm: Dtabase.arlist) {
            Button btn=new Button("Delete");
            RoomsTm tm=new RoomsTm(rm.getrName(),rm.getrNo(),btn);
            oblist.add(tm);

            //delete button
            btn.setOnAction((e)->{
                Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Are you sure", ButtonType.YES,ButtonType.NO);
                Optional<ButtonType> buttonType = alert.showAndWait();

                if(buttonType.get().equals(ButtonType.YES)){
                    Dtabase.arlist.remove(rm);
                    oblist.remove(tm);
                    new Alert(Alert.AlertType.INFORMATION,"Delete has been success");
                }
                    }
            );
        }
        tblSingle.setItems(oblist);
    }

    public void saveSOnAction(ActionEvent actionEvent) {
        RoomsName c1=new RoomsName(
                txtSName.getText(),
                txtSNo.getText()
        );
        Dtabase.arlist.add(c1);
        loadAllroomsName();

    }
}
