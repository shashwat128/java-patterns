package star1to10;

public class Pyramid5_centre_triangle {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            for(int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
