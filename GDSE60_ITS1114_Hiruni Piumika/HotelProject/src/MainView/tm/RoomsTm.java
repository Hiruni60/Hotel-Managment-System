package MainView.tm;

import javafx.scene.control.Button;

public class RoomsTm {
    private String Name;
    private String No;
    private Button btn;


    public String getrName() {
        return Name;
    }

    public void setrName(String rName) {
        this.Name = rName;
    }

    public String getrNo() {
        return No;
    }

    public void setrNo(String rNo) {
        this.No = rNo;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    public RoomsTm(String rName, String rNo, Button btn) {
        this.Name = rName;
        this.No = rNo;
        this.btn = btn;
    }
    public RoomsTm(){

    }

    @Override
    public String toString() {
        return "roomsTm{" +
                "rName='" + Name + '\'' +
                ", rNo='" + No + '\'' +
                ", btn=" + btn +
                '}';
    }
}
