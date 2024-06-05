package carpackageplus;

import carpackage.Samochod;

public class SamochodPlus extends Samochod {
    private double engine;

    public SamochodPlus(String color, double speed, int year, String firm, double engine) {
        super(color, speed, year, firm);
        this.engine = engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public double getEngine() {
        return engine;
    }
    
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void setNewFirm(String newFirm) {
        this.firm = newFirm;
    }

    public String getNewFirm() {
        return firm;
    }

    public void accessPrivateMethod() {
        privateMethod();
    }

    public String accessPrivateField() {
        return color;
    }

    // Access package method and field
    public void accessPackageMethod() {
        packageMethod();
    }

    public String accessPackageField() {
        return firm;
    }

    // Access protected method and field
    public void accessProtectedMethod() {
        protectedMethod();
    }

    public int accessProtectedField() {
        return year;
    }

    public static void accessPublicStaticMethod() {
        Samochod.publicStaticMethod();
    }

    protected static void accessProtectedStaticMethod() {
        Samochod.protectedStaticMethod();
    }
}