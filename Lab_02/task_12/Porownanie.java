class Porownanie {
    public static void main(String[] args) {
        String str1 = new String("laptop");
        String str2 = new String("laptop");

        System.out.println("Porównanie za pomocą ==: " + (str1 == str2));
        System.out.println("Porównanie za pomocą equals: " + str1.equals(str2));
    }
}