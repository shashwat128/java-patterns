package star21to30;

public class Pattern23_hollow_left_horizontal_triangle {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {
        for (int i = 1; i <= rows; i++ ) {
            for (int k = rows; k > i; k--) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                if (k == 1 || k == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 1; i <= rows - 1; i++) {
            for (int k = 1; k <= i; k++ ) {
                System.out.print(" ");
            }
            for (int k = rows - 1; k >= i ; k--) {
                if (k == rows - 1 || k == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
