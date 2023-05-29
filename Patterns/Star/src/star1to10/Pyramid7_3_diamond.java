package star1to10;

// single nested loop
public class Pyramid7_3_diamond {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {

        for (int i = 1; i <= 2 * rows - 1; i++) {
            int gaps = Math.abs(rows - i);
            int stars = rows - gaps;

            for (int k = 1; k <= gaps; k++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * stars - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
