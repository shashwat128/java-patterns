package star1to10;

public class Pyramid8_2_horizontal_triangle_outside {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {

        for(int i = 1; i <= 2 * rows - 1; i++) {
            if (i <= rows) {
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 1; k <= 2 * rows - i; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
