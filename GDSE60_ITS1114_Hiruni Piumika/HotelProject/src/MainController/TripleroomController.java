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

public class TripleroomController {
    public AnchorPane tripleRoomContext;
    public TableView <RoomsTm>tblTriple;
    public TableColumn colTName;
    public TableColumn colTNo;
    public TableColumn colTOption;
    public JFXTextField txtTName;
    public JFXTextField txtRNo;
    public Button btnTsave;

    public void initialize(){
        colTOption.setCellValueFactory(new PropertyValueFactory("btn"));
        colTName.setCellValueFactory(new PropertyValueFactory("Name"));
        colTNo.setCellValueFactory(new PropertyValueFactory("No"));

        loadAllroomsName();
        //details update
        tblTriple.getSelectionModel().selectedItemProperty().addListener(
    (observable, oldValue, newValue) -> {
        setData(newValue);
    });
    }

    private void setData(RoomsTm tm) {
        btnTsave.setText("update room");
        txtRNo.setText(tm.getrNo());
        txtTName.setText(tm.getrName());
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
        tblTriple.setItems(oblist);
    }

    public void saveTOnAction(ActionEvent actionEvent) {
        RoomsName c1=new RoomsName(
                txtTName.getText(),
                txtRNo.getText()
        );
        Dtabase.arlist.add(c1);
        loadAllroomsName();
    }
}
