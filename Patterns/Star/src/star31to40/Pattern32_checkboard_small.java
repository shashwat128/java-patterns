package star31to40;

public class Pattern32_checkboard_small {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {
        for (int i = 1; i <= rows; i++) {
            if (i % 2 != 0) {
                for (int k = 1; k <= rows/2 + 1; k++) {
                    System.out.print("*  ");
                }
            } else {
                for (int k = 1; k <= rows/2; k++) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
