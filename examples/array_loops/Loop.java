import java.util.Arrays;

public class Loop {
    public static void main(String[] args) {
        String[] array = new String[]{"cat", "dog", "frog", "cow", "parrot"};
        System.out.println(Arrays.toString(array));

        FunctionWithoutParametres showFunc = new FunctionWithoutParametres();
        showFunc.performFunc();

        ForFunction showFor = new ForFunction();
        showFor.performForLoop(array);

        ForEachFunction showForEach = new ForEachFunction();
        showForEach.performForEachLoop(array);
    }
}

class ForFunction {
    public void performForLoop(String[] value) {
        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i] + " ");
        }
        System.out.println();
    }
}

class ForEachFunction {
    public void performForEachLoop(String[] value) {
        for (String x : value) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
