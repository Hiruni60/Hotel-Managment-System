package MainController;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

import static com.sun.javafx.robot.impl.FXRobotHelper.getChildren;

public class AddGuestDetailsController {
    public AnchorPane AddGuestDetailsContrext;
    public AnchorPane printContext;
   static public TextField txtFullName;
   static public TextField txtnic;
  static  public TextField txttelephoneno;
   static public TextField txtpermenetAddress;
    static public TextField txtemail;
    /////
    public JFXTextField txtfullnameone;
    public JFXTextField txtnicone;
    public JFXTextField txttelenoone;
    public JFXTextField txtaddressone;
    public JFXTextField txtemailone;
    public ComboBox<Integer> cmbSelectroom;
    public JFXTextField txtRoomNo;

    public void adgBHOnAction(ActionEvent actionEvent) throws IOException {
        setHBgUI("Main");
    }
    private void setHBgUI(String location) throws IOException {
        Stage stage=(Stage) AddGuestDetailsContrext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }
    public void addGBOnAction(ActionEvent actionEvent) throws IOException {
        setABgUI("ReserveARoom");
    }
    private void setABgUI(String location) throws IOException {
        Stage stage=(Stage) AddGuestDetailsContrext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../MainView/"+location+".fxml"))));
    }

    public void addDetailsOnAction(ActionEvent actionEvent) throws IOException {
        String Fname=String.valueOf(txtFullName);
        String nic= String.valueOf(txtnic);
        String teleno= String.valueOf(txttelephoneno);
        String address=String.valueOf(txtpermenetAddress);
        String email=String.valueOf( txtemail);

        txtfullnameone.setText(Fname);
        txtnicone.setText(nic);
        txttelenoone.setText(teleno);
        txtaddressone.setText(address);
        txtemailone.setText(email);

    }

    public void printOnAction(ActionEvent actionEvent) {
        txtRoomNo.setText(String.valueOf(cmbSelectroom.getValue()));
        new Alert(Alert.AlertType.CONFIRMATION,"success").show();
    }
    public void initialize(){
        cmbSelectroom.getItems().add(1); cmbSelectroom.getItems().add(2);
        cmbSelectroom.getItems().add(3); cmbSelectroom.getItems().add(4);
        cmbSelectroom.getItems().add(5); cmbSelectroom.getItems().add(6);
        cmbSelectroom.getItems().add(7); cmbSelectroom.getItems().add(8);
        cmbSelectroom.getItems().add(9); cmbSelectroom.getItems().add(10);
        cmbSelectroom.getItems().add(11); cmbSelectroom.getItems().add(12);
        cmbSelectroom.getItems().add(13); cmbSelectroom.getItems().add(14);
        cmbSelectroom.getItems().add(15); cmbSelectroom.getItems().add(16);
        cmbSelectroom.getItems().add(17); cmbSelectroom.getItems().add(18);
        cmbSelectroom.getItems().add(19); cmbSelectroom.getItems().add(20);

    }

    public void canselOnAction(ActionEvent actionEvent) {
        txtfullnameone.setText("");
        txtnicone.setText("");
        txtaddressone.setText("");
        txttelenoone.setText("");
        txtemailone.setText("");

    }
}
