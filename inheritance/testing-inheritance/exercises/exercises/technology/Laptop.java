package exercises.technology;

import java.util.Objects;

public class Laptop extends Computer {
    private String chip;

    public Laptop(String aDeviceName, String aMake, String aModel, String aChip){
        super(aDeviceName, aMake, aModel);
        this.chip = aChip;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    private boolean chipCheck(String chip){
        if (chip.equals("M1") || chip.equals("M2")){
            return true;
        }
    }
}

