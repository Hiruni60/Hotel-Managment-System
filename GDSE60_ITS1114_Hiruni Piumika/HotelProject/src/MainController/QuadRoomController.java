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

public class QuadRoomController {
    public AnchorPane quadContext;
    public TableView<RoomsTm> tblQuad;
    public TableColumn colQName;
    public TableColumn colQNo;
    public TableColumn colQOption;
    public JFXTextField txtQName;
    public JFXTextField txtQNo;
    public Button btnQSave;


    public void initialize(){
        colQOption.setCellValueFactory(new PropertyValueFactory("btn"));
        colQName.setCellValueFactory(new PropertyValueFactory("Name"));
        colQNo.setCellValueFactory(new PropertyValueFactory("No"));
        loadAllroomsName();
        //details update
        tblQuad.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> {
                    setData(newValue);
                });
    }
    private void setData(RoomsTm tm) {
        btnQSave.setText("update room");
        txtQName.setText(tm.getrNo());
        txtQNo.setText(tm.getrName());
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
        tblQuad.setItems(oblist);
    }

    public void saveQOnAction(ActionEvent actionEvent) {
        RoomsName c1=new RoomsName(
                txtQName.getText(),
                txtQNo.getText()
        );
        Dtabase.arlist.add(c1);
        loadAllroomsName();
    }
}
