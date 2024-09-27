package main.java.org.launchcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseDisc {
    String name;
    int capacity;
    ArrayList<String> contents;
    String discType;


    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setContents(ArrayList<String> contents) {
        this.contents = contents;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public BaseDisc(String name, int capacity, ArrayList<String> contents, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
    }

    public String burnDisc(HashMap<String, Integer> hashMap) {

    }

    public double checkDataSize(HashMap<String, Integer> hashMap) {
        double countSize = 0;


        for (int value : hashMap.values()) {
            countSize += value;
        }

        return countSize;
    }

}