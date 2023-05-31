package star11to20;

public class Pattern17_hollow_triangle_inverted {
    public static void main(String[] args) {
        int rows = 5;
        starPrint(rows);
    }

    private static void starPrint(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int k = rows; k >= i; k--) {
                if (i == 1 || k == i || k == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
