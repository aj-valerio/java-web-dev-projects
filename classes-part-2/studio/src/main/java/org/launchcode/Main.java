package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MenuItem Sundae = new MenuItem(10.00, "Two scoops of vanilla bean ice cream " +
                "with hot fudge and whipped cream. Optional: peanuts, cherry", "Desserts", true);
        MenuItem MozzarellaSticks = new MenuItem(14.00, "A classic: fried mozzarella sticks with a zesty " +
                "tomato dipping sauce", "Appetizers", false);

        ArrayList<MenuItem> Desserts = new ArrayList<>(Sundae);

        Menu TheClassicDiner = new Menu(9/16/2024, Desserts);
    }
}
