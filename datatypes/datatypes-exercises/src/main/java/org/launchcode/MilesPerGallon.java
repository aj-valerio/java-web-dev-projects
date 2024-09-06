package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    static public void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Miles driven: ");
        float milesDriven = input.nextFloat();
        System.out.println("Gallons of gas consumed: ");
        float gallonsOfGas = input.nextFloat();
        System.out.println("Miles per gallon: " + (milesDriven/gallonsOfGas));
    }
}
