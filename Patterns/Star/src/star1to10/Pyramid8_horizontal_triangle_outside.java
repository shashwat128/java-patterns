package star1to10;

public class Pyramid8_horizontal_triangle_outside {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {

        for (int i = 1; i <= rows; i++) {
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= rows - 1; i++) {
            for (int k = rows - 1; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
