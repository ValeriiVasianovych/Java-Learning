package carpackageplus;

import carpackage.Samochod;

public class SamochodTest {

    public static void main(String[] args) {
        Samochod[] autopark = new Samochod[3];

        autopark[0] = new Samochod("Red", 210.7, 2017, "Kia");
        autopark[1] = new Samochod("Silver", 230.3, 2020, "Honda");
        autopark[2] = new Samochod("White", 240.2, 2008, "Mazda");

        for (Samochod samochod : autopark) {
            samochod.info();
            System.out.println();
        }
    }
}