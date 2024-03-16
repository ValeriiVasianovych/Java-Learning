class BreakContinue {
    public static void main(String[] args) {
        przykladBreakWPetli();
        przykladBreakWSwitch();
        przykladContinue();
    }

    public static void przykladBreakWPetli() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }

    public static void przykladBreakWSwitch() {
        int dzien = 3;
        switch (dzien) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            default:
                System.out.println("Inny dzień");
        }
    }

    public static void przykladContinue() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
