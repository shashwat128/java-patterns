package star21to30;

public class Pattern27_hollow_diamond_inside_rectangle {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int k = i; k <= rows; k++) {
                System.out.print("*");
            }
            for (int k = 1; k <= i * 2 - 2; k++) {
                System.out.print(" ");
            }
            for (int k = i; k <= rows; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int k = i * 2 - 2; k < rows * 2 - 2; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
