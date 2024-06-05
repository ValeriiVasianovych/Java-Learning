package carpackageplus;

public class SamochodProtect {
    public static void main(String[] args) {
        SamochodPlus samochodPlus = new SamochodPlus("Green", 212.7, 2011, "Isuzu", 2.0);

        samochodPlus.info();

        samochodPlus.accessPrivateMethod();
        System.out.println(samochodPlus.accessPrivateField());

        samochodPlus.accessPackageMethod();
        System.out.println(samochodPlus.accessPackageField());

        samochodPlus.accessProtectedMethod();
        System.out.println(samochodPlus.accessProtectedField());

        SamochodPlus.accessPublicStaticMethod();
        SamochodPlus.accessProtectedStaticMethod();
    }
}
