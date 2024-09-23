package exercises.technology;

public class Smartphone extends Computer {
    private String mobileProvider;

    public Smartphone(String aDeviceName, String aMake, String aModel, String mobileProvider){
        super(aDeviceName, aMake, aModel);
        this.mobileProvider = mobileProvider;
    }

    public String getMobileProvider() {
        return mobileProvider;
    }

    public void setMobileProvider(String mobileProvider) {
        this.mobileProvider = mobileProvider;
    }

}
