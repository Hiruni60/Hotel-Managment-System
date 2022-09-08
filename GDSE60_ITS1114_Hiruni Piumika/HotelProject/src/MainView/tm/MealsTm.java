package MainView.tm;

import javafx.scene.control.Button;

public class MealsTm {
    private String MName;
    private String MPrice;
    private Button btn;

    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public String getMPrice() {
        return MPrice;
    }

    public void setMPrice(String MPrice) {
        this.MPrice = MPrice;
    }

    public MealsTm(String MName, String MPrice, Button btn) {
        this.MName = MName;
        this.MPrice = MPrice;
        this.btn = btn;
    }

    public MealsTm(){

    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "MealsTm{" +
                "MName='" + MName + '\'' +
                ", MPrice='" + MPrice + '\'' +
                ", btn=" + btn +
                '}';
    }
}
