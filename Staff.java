public class Staff {
    private String idCardColor;
    private boolean parkingSpace;

    public Staff(String idCardColor, boolean parkingSpace) {
        this.idCardColor = idCardColor;
        this.parkingSpace = parkingSpace;
    }


    public void setParkingSpace(boolean parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public boolean isParkingSpace() {
        return parkingSpace;
    }

    public String getIdCardColor() {
        return idCardColor;
    }

    public void setIdCardColor(String idCardColor) {
        this.idCardColor = idCardColor;
    }

    public String drives(){
        return "Can drive";
    }

    public void teach(){

    }

    public boolean cleans(){
        return true;
    }



}
