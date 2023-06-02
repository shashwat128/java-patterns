package star21to30;

public class Pattern24_hollow_right_parallelogram {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int k = rows - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (int k = 1; k<= rows; k++) {
                if ( i == 1 || i == rows || k == 1 || k == rows )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
