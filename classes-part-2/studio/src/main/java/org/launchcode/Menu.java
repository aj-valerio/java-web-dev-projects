package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    private void addItem(MenuItem aItem){
        this.items.add(aItem);
    }

    private void removeItem(MenuItem aItem){
        int itemToRemove = this.items.indexOf(aItem);
        items.remove(itemToRemove);
    }

    private boolean isNewItem(MenuItem aItem){
        return aItem.isNew;
    }

    private void printMenu(ArrayList<MenuItem> items){

    }
}


