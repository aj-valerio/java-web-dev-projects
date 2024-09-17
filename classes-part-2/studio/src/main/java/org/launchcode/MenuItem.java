package org.launchcode;

import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    public boolean isNew;

    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(description, menuItem.description);
    }

    private void printItem(){
        if (this.isNew){
            System.out.println("New!");
        }
        System.out.println(this.description + " is a(n) " + this.category + " priced at " + this.price + ".");
    }

}

