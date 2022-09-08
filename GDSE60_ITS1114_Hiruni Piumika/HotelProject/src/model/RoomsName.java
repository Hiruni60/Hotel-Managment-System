package model;

public class RoomsName {
    private String rName;
    private String rNo;

    public RoomsName(String rName, String rNo) {
        this.rName = rName;
        this.rNo = rNo;
    }
    public RoomsName(){

    }
    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getrNo() {
        return rNo;
    }

    public void setrNo(String rNo) {
        this.rNo = rNo;
    }

    @Override
    public String toString() {
        return "roomsName{" +
                "rName='" + rName + '\'' +
                ", rNo='" + rNo + '\'' +
                '}';
    }
}
