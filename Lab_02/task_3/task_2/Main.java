package Lab_02.task_3.task_2;
public class Main {
    public static void main(String[] args) {
        // Boolean - klasa opakowująca dla typu boolean
        Boolean boolObj = Boolean.valueOf(true);
        boolean boolValue = boolObj.booleanValue();
        System.out.println("Wartość logiczna: " + boolValue);

        Character charObj = Character.valueOf('A');
        char charValue = charObj.charValue();
        System.out.println("Znak: " + charValue);

        Byte byteObj = Byte.valueOf((byte) 10);
        byte byteValue = byteObj.byteValue();
        System.out.println("Wartość bajtowa: " + byteValue);

        Short shortObj = Short.valueOf((short) 100);
        short shortValue = shortObj.shortValue();
        System.out.println("Wartość krótka: " + shortValue);

        Integer intObj = Integer.valueOf(1000);
        int intValue = intObj.intValue();
        System.out.println("Wartość całkowita: " + intValue);

        Long longObj = Long.valueOf(100000L);
        long longValue = longObj.longValue();
        System.out.println("Wartość długa: " + longValue);

        Float floatObj = Float.valueOf(3.14f);
        float floatValue = floatObj.floatValue();
        System.out.println("Wartość zmiennoprzecinkowa: " + floatValue);

        Double doubleObj = Double.valueOf(3.14159);
        double doubleValue = doubleObj.doubleValue();
        System.out.println("Wartość zmiennoprzecinkowa podwójnej precyzji: " + doubleValue);
    }
}
