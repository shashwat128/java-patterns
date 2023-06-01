package star21to30;

public class Pattern21_hollow_diamond {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {

        for (int i = 1; i <= rows; i++) {
            for (int k = rows; k > i; k--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (i * 2) - 1; k++) {
                if(k == 1 || k == (i * 2) - 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = rows - 1; i >= 1; i--) {
            for (int k = rows - 1; k >= i; k--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (i * 2) - 1; k++ ) {
                if(k == 1 || k == (i * 2) - 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
