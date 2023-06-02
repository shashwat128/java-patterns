package star21to30;

public class Pattern30_X {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {
        for (int i = 1; i <= rows * 2 - 1; i++) {
            for (int k = 1; k <= rows; k++) {
                if (k == i || k == rows - i + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
