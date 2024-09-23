package exercises.technology;

public class Computer {
    public String deviceName;
    private final String owner = "AJ";
    public String make;
    public String model;

    public Computer(String aDeviceName, String aMake, String aModel) {
        this.deviceName = aDeviceName;
        this.make = aMake;
        this.model = aModel;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getOwner() {
        return owner;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void describeDevice(){
        System.out.println(this.deviceName + " is " + this.owner + "'s " + this.make + " " + this.model + ".");
    }
}
