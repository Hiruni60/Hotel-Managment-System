package MainController;

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

public class DoubleRoomController {
    public AnchorPane doubleroomContext;
    public TableView<RoomsTm> tblDouble;
    public TableColumn colDName;
    public TableColumn colDNo;
    public TableColumn colDOption;
    public JFXTextField txtDName;
    public JFXTextField txtDNO;
    public Button btnDSave;

    public void initialize(){
        colDOption.setCellValueFactory(new PropertyValueFactory("btn"));
        colDName.setCellValueFactory(new PropertyValueFactory("Name"));
        colDNo.setCellValueFactory(new PropertyValueFactory("No"));
        loadAllroomsName();
        //details update
        tblDouble.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    setData(newValue);
                });
    }
    private void setData(RoomsTm tm) {
        btnDSave.setText("update room");
        txtDName.setText(tm.getrNo());
        txtDNO.setText(tm.getrName());
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
        tblDouble.setItems(oblist);
    }

    public void saveDOnAction(ActionEvent actionEvent) {
            RoomsName c1=new RoomsName(
                    txtDName.getText(),
                    txtDNO.getText()
            );
            Dtabase.arlist.add(c1);
            loadAllroomsName();
        }
    }

