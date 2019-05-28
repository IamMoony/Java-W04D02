package Basic_A0;

public class Car {

    private int kw;
    private String speed;
    private String model;
    private String manufacturer;

    public Car(String model, int kw, String speed, String manufacturer){
        this.kw = kw;
        this.speed = speed;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public int getKw() {
        return kw;
    }

    public void setKw(int kw) {
        this.kw = kw;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
