package star11to20;

public class Pyramid14_Mirror_effect_1 {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {
        int i, k;
        for(i = 1; i <= rows; i++) {
            for (k = 1; k < i; k++) {
                System.out.print(" ");
            }

            for (k = i; k <= rows; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (i = rows - 1; i >= 1; i--) {
            for (k = 1; k < i; k++) {
                System.out.print(" ");
            }

            for (k = i; k <= rows; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
