public class Garden {
    public static void main(String[] args) {
        Apple apple = new Apple(388.0, 5, 3, "Sweet");
        apple.printFlavor();

        Chery chery = new Chery(200.0, 3, 2, "Snow White");
        chery.printKind();

        Pear pear = new Pear(300.0, 4, 1, 5.0);
        pear.printDiameter();

        Tree[] trees = new Tree[6];
        trees[0] = apple;
        trees[1] = chery;
        trees[2] = pear;
        trees[3] = new Apple(400.0, 6, 4, "Sour");
        trees[4] = new Chery(250.0, 2, 3, "Black");
        trees[5] = new Pear(350.0, 5, 2, 4.0);

        for (Tree tree : trees) {
            tree.printDetails();
        }

        if (apple instanceof Apple) {
            System.out.println("Apple is an Apple");
        }

        if (chery instanceof Chery) {
            System.out.println("Chery is a Chery");
        }

        if (pear instanceof Pear) {
            System.out.println("Pear is a Pear");
        }
    }
}
