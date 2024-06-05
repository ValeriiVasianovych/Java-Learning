public class DoubleArr {
    public static void main(String[] args) {
        double[][] doubleArr = new double[3][4];

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 4; ++j) {
                doubleArr[i][j] = (i * 4) + j + 1;
                System.out.print(doubleArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
